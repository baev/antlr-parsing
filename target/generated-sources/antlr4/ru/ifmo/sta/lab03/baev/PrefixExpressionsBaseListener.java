// Generated from ru/ifmo/sta/lab03/baev/PrefixExpressions.g4 by ANTLR 4.0
package ru.ifmo.sta.lab03.baev;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

public class PrefixExpressionsBaseListener implements PrefixExpressionsListener {
	@Override public void enterAssignment(PrefixExpressionsParser.AssignmentContext ctx) { }
	@Override public void exitAssignment(PrefixExpressionsParser.AssignmentContext ctx) { }

	@Override public void enterLogic_expr(PrefixExpressionsParser.Logic_exprContext ctx) { }
	@Override public void exitLogic_expr(PrefixExpressionsParser.Logic_exprContext ctx) { }

	@Override public void enterMath_operator(PrefixExpressionsParser.Math_operatorContext ctx) { }
	@Override public void exitMath_operator(PrefixExpressionsParser.Math_operatorContext ctx) { }

	@Override public void enterMath_expr(PrefixExpressionsParser.Math_exprContext ctx) { }
	@Override public void exitMath_expr(PrefixExpressionsParser.Math_exprContext ctx) { }

	@Override public void enterName(PrefixExpressionsParser.NameContext ctx) { }
	@Override public void exitName(PrefixExpressionsParser.NameContext ctx) { }

	@Override public void enterLogic_operator(PrefixExpressionsParser.Logic_operatorContext ctx) { }
	@Override public void exitLogic_operator(PrefixExpressionsParser.Logic_operatorContext ctx) { }

	@Override public void enterWrite(PrefixExpressionsParser.WriteContext ctx) { }
	@Override public void exitWrite(PrefixExpressionsParser.WriteContext ctx) { }

	@Override public void enterCommand(PrefixExpressionsParser.CommandContext ctx) { }
	@Override public void exitCommand(PrefixExpressionsParser.CommandContext ctx) { }

	@Override public void enterCompare_operator(PrefixExpressionsParser.Compare_operatorContext ctx) { }
	@Override public void exitCompare_operator(PrefixExpressionsParser.Compare_operatorContext ctx) { }

	@Override public void enterBranch(PrefixExpressionsParser.BranchContext ctx) { }
	@Override public void exitBranch(PrefixExpressionsParser.BranchContext ctx) { }

	@Override public void enterRead(PrefixExpressionsParser.ReadContext ctx) { }
	@Override public void exitRead(PrefixExpressionsParser.ReadContext ctx) { }

	@Override public void enterExpr(PrefixExpressionsParser.ExprContext ctx) { }
	@Override public void exitExpr(PrefixExpressionsParser.ExprContext ctx) { }

	@Override public void enterOperand(PrefixExpressionsParser.OperandContext ctx) { }
	@Override public void exitOperand(PrefixExpressionsParser.OperandContext ctx) { }

	@Override public void enterParse(PrefixExpressionsParser.ParseContext ctx) { }
	@Override public void exitParse(PrefixExpressionsParser.ParseContext ctx) { }

	@Override public void enterEnd(PrefixExpressionsParser.EndContext ctx) { }
	@Override public void exitEnd(PrefixExpressionsParser.EndContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	@Override public void visitTerminal(TerminalNode node) { }
	@Override public void visitErrorNode(ErrorNode node) { }
}