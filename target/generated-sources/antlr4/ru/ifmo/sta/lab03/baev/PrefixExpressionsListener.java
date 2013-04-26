// Generated from ru/ifmo/sta/lab03/baev/PrefixExpressions.g4 by ANTLR 4.0
package ru.ifmo.sta.lab03.baev;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface PrefixExpressionsListener extends ParseTreeListener {
	void enterAssignment(PrefixExpressionsParser.AssignmentContext ctx);
	void exitAssignment(PrefixExpressionsParser.AssignmentContext ctx);

	void enterLogic_expr(PrefixExpressionsParser.Logic_exprContext ctx);
	void exitLogic_expr(PrefixExpressionsParser.Logic_exprContext ctx);

	void enterMath_operator(PrefixExpressionsParser.Math_operatorContext ctx);
	void exitMath_operator(PrefixExpressionsParser.Math_operatorContext ctx);

	void enterMath_expr(PrefixExpressionsParser.Math_exprContext ctx);
	void exitMath_expr(PrefixExpressionsParser.Math_exprContext ctx);

	void enterLogic_operator(PrefixExpressionsParser.Logic_operatorContext ctx);
	void exitLogic_operator(PrefixExpressionsParser.Logic_operatorContext ctx);

	void enterWrite(PrefixExpressionsParser.WriteContext ctx);
	void exitWrite(PrefixExpressionsParser.WriteContext ctx);

	void enterCommand(PrefixExpressionsParser.CommandContext ctx);
	void exitCommand(PrefixExpressionsParser.CommandContext ctx);

	void enterCompare_operator(PrefixExpressionsParser.Compare_operatorContext ctx);
	void exitCompare_operator(PrefixExpressionsParser.Compare_operatorContext ctx);

	void enterBranch(PrefixExpressionsParser.BranchContext ctx);
	void exitBranch(PrefixExpressionsParser.BranchContext ctx);

	void enterRead(PrefixExpressionsParser.ReadContext ctx);
	void exitRead(PrefixExpressionsParser.ReadContext ctx);

	void enterExpr(PrefixExpressionsParser.ExprContext ctx);
	void exitExpr(PrefixExpressionsParser.ExprContext ctx);

	void enterOperand(PrefixExpressionsParser.OperandContext ctx);
	void exitOperand(PrefixExpressionsParser.OperandContext ctx);

	void enterParse(PrefixExpressionsParser.ParseContext ctx);
	void exitParse(PrefixExpressionsParser.ParseContext ctx);
}