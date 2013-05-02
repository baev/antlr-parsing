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
    private static final String BEGIN = "begin\n";
    private static final String END = "end";

    private Stack<String> operandStack = new Stack<String>();

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
        String last = operandStack.pop();
        operandStack.push(offset + last + ";\n");
    }

    @Override
    public void exitWrite(PrefixExpressionsParser.WriteContext ctx) {
        String last = operandStack.pop();
        if (!last.startsWith("(") || !last.endsWith(")")) {
            last = "(" + last + ")";
        }
        operandStack.push("writeLn" + last);
    }

    @Override
    public void enterName(PrefixExpressionsParser.NameContext ctx) {
        operandStack.push(ctx.ID().toString());
    }

    @Override
    public void enterEnd(PrefixExpressionsParser.EndContext ctx) {
        String result = "";
        while (!operandStack.empty()) {
            String last = operandStack.pop();
            result = last + result;
        }

        pw.println("begin");
        pw.print(result);
        pw.print("end.");
    }

    @Override
    public void exitEnd(PrefixExpressionsParser.EndContext ctx) {
        pw.close();
    }

    @Override
    public void enterMathOperator(PrefixExpressionsParser.MathOperatorContext ctx) {
        operandStack.push(ctx.getText());
    }

    @Override
    public void exitMathExpr(PrefixExpressionsParser.MathExprContext ctx) {
        if (ctx.INT() != null) {
            operandStack.push(ctx.INT().toString());
        } else if (ctx.ID() != null) {
            operandStack.push(ctx.ID().toString());
        } else {
            String second = operandStack.pop();
            String first = operandStack.pop();
            String operator = operandStack.pop();

            String expr = "(" + first + " " + operator + " " + second + ")";
            operandStack.push(expr);
        }
    }

    @Override
    public void enterLogicOperator(PrefixExpressionsParser.LogicOperatorContext ctx) {
        operandStack.push(ctx.getText());
    }

    @Override
    public void exitLogicExpr(PrefixExpressionsParser.LogicExprContext ctx) {
        if (ctx.ID() != null) {
            operandStack.push(ctx.ID().toString());
        } else if (ctx.TRUE() != null) {
            operandStack.push(ctx.TRUE().toString());
        } else if (ctx.FALSE() != null) {
            operandStack.push(ctx.FALSE().toString());
        } else if (ctx.NOT() != null) {
            String operand = operandStack.pop();

            String expr = "(" + ctx.NOT().toString() + " " + operand + ")";
            operandStack.push(expr);
        } else {
            String second = operandStack.pop();
            String first = operandStack.pop();
            String operator = operandStack.pop();

            String expr = "(" + first + " " + operator + " " + second + ")";

            operandStack.push(expr);
        }
    }

    @Override
    public void enterCompareOperator(PrefixExpressionsParser.CompareOperatorContext ctx) {
        operandStack.push(ctx.getText());
    }

    @Override
    public void enterOperand(PrefixExpressionsParser.OperandContext ctx) {
        incOffset();
        if (ctx.getChildCount() > 1) {
            operandStack.push(offset + BEGIN);
            incOffset();
        }
    }

    @Override
    public void exitOperand(PrefixExpressionsParser.OperandContext ctx) {
        if (ctx.getChildCount() > 1) {
            decOffset();
            operandStack.push(offset + END);

            for (int i = 0; i < ctx.getChildCount() - 1; i++) {
                String last = operandStack.pop();
                String prev = operandStack.pop();
                operandStack.push(prev + last);
            }
        }
        decOffset();
    }



    @Override
    public void exitBranch(PrefixExpressionsParser.BranchContext ctx) {
        String last = operandStack.pop();
        String second = operandStack.pop();
        String first = operandStack.pop();

        last = last.replaceFirst(";\n$", "");
        String expr = "if " + first + " then\n" + second + offset + "else\n" + last;

        operandStack.push(expr);
    }

    @Override
    public void exitAssignment(PrefixExpressionsParser.AssignmentContext ctx) {
        String last = operandStack.pop();
        String prev = operandStack.pop();
        operandStack.push(prev + " := " + last);
    }
}
