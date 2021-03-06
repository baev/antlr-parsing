package ru.ifmo.sta.lab03.baev;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

import static java.lang.ClassLoader.getSystemResourceAsStream;

/**
 * @author Dmitry Baev charlie@yandex-team.ru
 *         Date: 26.04.13
 */
public class Visualization {
    private static final String FILE_PATH = "ru/ifmo/sta/lab03/baev/sample.txt";

    public static void main(String[] args) throws IOException {
        CharStream input = new ANTLRInputStream(getSystemResourceAsStream(FILE_PATH));

        PrefixExpressionsLexer lexer = new PrefixExpressionsLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PrefixExpressionsParser parser = new PrefixExpressionsParser(tokens);

        RuleContext tree = parser.parse();
        tree.inspect(parser);

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new PrefixExpressionsWalker(), tree);
    }
}
