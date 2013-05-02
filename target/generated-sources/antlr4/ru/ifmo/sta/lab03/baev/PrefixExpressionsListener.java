// Generated from ru/ifmo/sta/lab03/baev/PrefixExpressions.g4 by ANTLR 4.0
package ru.ifmo.sta.lab03.baev;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface PrefixExpressionsListener extends ParseTreeListener {
	void enterMathExpr(PrefixExpressionsParser.MathExprContext ctx);
	void exitMathExpr(PrefixExpressionsParser.MathExprContext ctx);

	void enterExpr(PrefixExpressionsParser.ExprContext ctx);
	void exitExpr(PrefixExpressionsParser.ExprContext ctx);

	void enterOperand(PrefixExpressionsParser.OperandContext ctx);
	void exitOperand(PrefixExpressionsParser.OperandContext ctx);

	void enterLogicOperator(PrefixExpressionsParser.LogicOperatorContext ctx);
	void exitLogicOperator(PrefixExpressionsParser.LogicOperatorContext ctx);

	void enterAssignment(PrefixExpressionsParser.AssignmentContext ctx);
	void exitAssignment(PrefixExpressionsParser.AssignmentContext ctx);

	void enterLogicExpr(PrefixExpressionsParser.LogicExprContext ctx);
	void exitLogicExpr(PrefixExpressionsParser.LogicExprContext ctx);

	void enterName(PrefixExpressionsParser.NameContext ctx);
	void exitName(PrefixExpressionsParser.NameContext ctx);

	void enterCommand(PrefixExpressionsParser.CommandContext ctx);
	void exitCommand(PrefixExpressionsParser.CommandContext ctx);

	void enterWrite(PrefixExpressionsParser.WriteContext ctx);
	void exitWrite(PrefixExpressionsParser.WriteContext ctx);

	void enterRead(PrefixExpressionsParser.ReadContext ctx);
	void exitRead(PrefixExpressionsParser.ReadContext ctx);

	void enterBranch(PrefixExpressionsParser.BranchContext ctx);
	void exitBranch(PrefixExpressionsParser.BranchContext ctx);

	void enterCompareOperator(PrefixExpressionsParser.CompareOperatorContext ctx);
	void exitCompareOperator(PrefixExpressionsParser.CompareOperatorContext ctx);

	void enterParse(PrefixExpressionsParser.ParseContext ctx);
	void exitParse(PrefixExpressionsParser.ParseContext ctx);

	void enterMathOperator(PrefixExpressionsParser.MathOperatorContext ctx);
	void exitMathOperator(PrefixExpressionsParser.MathOperatorContext ctx);

	void enterEnd(PrefixExpressionsParser.EndContext ctx);
	void exitEnd(PrefixExpressionsParser.EndContext ctx);
}