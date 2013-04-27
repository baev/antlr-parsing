package ru.ifmo.sta.lab03.baev;

import org.antlr.v4.runtime.ParserRuleContext;

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
    private static final String SPACE = " ";

    private Stack<String> mathExprStack = new Stack<String>();

    private PrintWriter pw;
    private String offset = "\t";

    public PrefixExpressionsWalker() throws FileNotFoundException {
        this.pw = new PrintWriter(new File(RESULT_FILE_PATH));
        System.out.println("init program...");
        pw.println("begin");
    }

    private void addEndOfLine() {
        pw.print(";\n");
    }

    private void addStartOfLine() {
        pw.print(offset);
    }

    @Override
    public void enterCommand(PrefixExpressionsParser.CommandContext ctx) {
        addStartOfLine();
    }

    @Override
    public void exitCommand(PrefixExpressionsParser.CommandContext ctx) {
        addEndOfLine();
    }

    @Override
    public void enterWrite(PrefixExpressionsParser.WriteContext ctx) {
        pw.print("writeln(");
    }

    @Override
    public void exitWrite(PrefixExpressionsParser.WriteContext ctx) {
        pw.print(")");
    }

    @Override
    public void enterName(PrefixExpressionsParser.NameContext ctx) {
        pw.print(ctx.ID());
    }

    @Override
    public void enterEnd(PrefixExpressionsParser.EndContext ctx) {
        pw.print("end.");
    }

    @Override
    public void exitEnd(PrefixExpressionsParser.EndContext ctx) {
        pw.close();
    }

    @Override
    public void enterMath_operator(PrefixExpressionsParser.Math_operatorContext ctx) {
        mathExprStack.push(ctx.getText());
    }

    @Override
    public void enterMath_expr(PrefixExpressionsParser.Math_exprContext ctx) {
        if (ctx.INT() != null) {
            pw.print(ctx.INT());
            mathExprStack.push(ctx.INT().toString());
        }
    }

    @Override
    public void exitMath_expr(PrefixExpressionsParser.Math_exprContext ctx) {

    }
}
