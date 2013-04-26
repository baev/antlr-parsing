package ru.ifmo.sta.lab03.baev;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;

import java.io.IOException;

import static java.lang.ClassLoader.getSystemResourceAsStream;

/**
 * @author Dmitry Baev charlie@yandex-team.ru
 *         Date: 26.04.13
 */
public class Main {
    private static final String FILE_PATH = "ru/ifmo/sta/lab03/baev/sample.txt";

    public static void main(String[] args) throws IOException {
        CharStream input = new ANTLRInputStream(getSystemResourceAsStream(FILE_PATH));

        PrefixExpressionsLexer lexer = new PrefixExpressionsLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PrefixExpressionsParser parser = new PrefixExpressionsParser(tokens);

        parser.setBuildParseTree(true);
        RuleContext tree = parser.parse();

        tree.inspect(parser); // show in gui
        //tree.save(parser, "/tmp/R.ps"); // Generate postscript
//        System.out.println(tree.toStringTree(parser));

        lexer.reset();

    }
}
