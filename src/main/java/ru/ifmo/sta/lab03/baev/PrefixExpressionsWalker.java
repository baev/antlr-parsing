package ru.ifmo.sta.lab03.baev;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Stack;

/**
 * @author Dmitry Baev charlie@yandex-team.ru
 *         Date: 27.04.13
 */
public class PrefixExpressionsWalker extends PrefixExpressionsBaseListener {
    private static final String RESULT_FILE_PATH = "src/main/resources/ru/ifmo/sta/lab03/baev/result.txt";
    private static final String BEGIN = "Begin\n";
    private static final String END = "End";

    private Stack<String> expressionParseStack = new Stack<String>();

    private PrintWriter pw;
    private String offset = "\t";

    public PrefixExpressionsWalker() throws FileNotFoundException {
        this.pw = new PrintWriter(new File(RESULT_FILE_PATH));
    }

    private void incOffset() {
        offset += "\t";
    }

    private void decOffset() {
        offset = offset.replaceFirst("\t", "");
    }

    @Override
    public void exitCommand(PrefixExpressionsParser.CommandContext ctx) {
        String last = expressionParseStack.pop();
        expressionParseStack.push(offset + last + ";\n");
    }

    @Override
    public void exitWrite(PrefixExpressionsParser.WriteContext ctx) {
        String last = expressionParseStack.pop();
        if (!last.startsWith("(") || !last.endsWith(")")) {
            last = "(" + last + ")";
        }
        expressionParseStack.push("WriteLn" + last);
    }

    @Override
    public void enterName(PrefixExpressionsParser.NameContext ctx) {
        expressionParseStack.push(ctx.ID().toString());
    }

    @Override
    public void enterEnd(PrefixExpressionsParser.EndContext ctx) {
        String result = "";
        while (!expressionParseStack.empty()) {
            String last = expressionParseStack.pop();
            result = last + result;
        }

        pw.println("Begin");
        pw.print(result);
        pw.print("End.");
    }

    @Override
    public void exitEnd(PrefixExpressionsParser.EndContext ctx) {
        pw.close();
    }

    @Override
    public void enterMathOperator(PrefixExpressionsParser.MathOperatorContext ctx) {
        expressionParseStack.push(ctx.getText());
    }

    @Override
    public void exitMathExpr(PrefixExpressionsParser.MathExprContext ctx) {
        if (ctx.INT() != null) {
            expressionParseStack.push(ctx.INT().toString());
        } else if (ctx.ID() != null) {
            expressionParseStack.push(ctx.ID().toString());
        } else {
            String second = expressionParseStack.pop();
            String first = expressionParseStack.pop();
            String operator = expressionParseStack.pop();

            String expr = "(" + first + " " + operator + " " + second + ")";
            expressionParseStack.push(expr);
        }
    }

    @Override
    public void enterLogicOperator(PrefixExpressionsParser.LogicOperatorContext ctx) {
        expressionParseStack.push(ctx.getText());
    }

    @Override
    public void exitLogicExpr(PrefixExpressionsParser.LogicExprContext ctx) {
        if (ctx.ID() != null) {
            expressionParseStack.push(ctx.ID().toString());
        } else if (ctx.TRUE() != null) {
            expressionParseStack.push("TRUE");
        } else if (ctx.FALSE() != null) {
            expressionParseStack.push("FALSE");
        } else if (ctx.NOT() != null) {
            String operand = expressionParseStack.pop();

            String expr = "(" + ctx.NOT().toString() + " " + operand + ")";
            expressionParseStack.push(expr);
        } else {
            String second = expressionParseStack.pop();
            String first = expressionParseStack.pop();
            String operator = expressionParseStack.pop();

            String expr = "(" + first + " " + operator + " " + second + ")";

            expressionParseStack.push(expr);
        }
    }

    @Override
    public void enterCompareOperator(PrefixExpressionsParser.CompareOperatorContext ctx) {
        expressionParseStack.push(ctx.getText());
    }

    @Override
    public void enterOperand(PrefixExpressionsParser.OperandContext ctx) {
        incOffset();
        if (ctx.getChildCount() > 1) {
            expressionParseStack.push(offset + BEGIN);
            incOffset();
        }
    }

    @Override
    public void exitOperand(PrefixExpressionsParser.OperandContext ctx) {
        if (ctx.getChildCount() > 1) {
            decOffset();
            expressionParseStack.push(offset + END);

            for (int i = 0; i < ctx.getChildCount() - 1; i++) {
                String last = expressionParseStack.pop();
                String prev = expressionParseStack.pop();
                expressionParseStack.push(prev + last);
            }
        }
        decOffset();
    }



    @Override
    public void exitBranch(PrefixExpressionsParser.BranchContext ctx) {
        String last = expressionParseStack.pop();
        String second = expressionParseStack.pop();
        String first = expressionParseStack.pop();

        last = last.replaceFirst(";\n$", "");
        String expr = "If " + first + " then\n" + second + offset + "else\n" + last;

        expressionParseStack.push(expr);
    }

    @Override
    public void exitAssignment(PrefixExpressionsParser.AssignmentContext ctx) {
        String last = expressionParseStack.pop();
        String prev = expressionParseStack.pop();
        expressionParseStack.push(prev + " := " + last);
    }

    @Override
    public void exitRead(PrefixExpressionsParser.ReadContext ctx) {
        String last = expressionParseStack.pop();
        expressionParseStack.push("ReadLn(" + last + ")");
    }
}
