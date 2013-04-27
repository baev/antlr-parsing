package ru.ifmo.sta.lab03.baev;

import org.antlr.v4.runtime.ParserRuleContext;

/**
 * @author Dmitry Baev charlie@yandex-team.ru
 *         Date: 27.04.13
 */
public class PrefixExpressionsWalker extends PrefixExpressionsBaseListener {
    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        System.out.println("RULE2");
    }
}
