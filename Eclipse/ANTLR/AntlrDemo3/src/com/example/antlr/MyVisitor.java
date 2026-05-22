package com.example.antlr;

import com.example.antlr.CalcParser.ExprContext;
import com.example.antlr.CalcParser.ProgContext;

public class MyVisitor extends CalcBaseVisitor<Integer>{

	
	@Override
	public Integer visitExpr(ExprContext ctx) {
		// TODO Auto-generated method stub
		if(ctx.getChildCount() == 3) {
			int left = visit(ctx.getChild(0));
			int right = visit(ctx.getChild(2));
			String op = ctx.getChild(1).getText();
			
			switch(op) {
			case "*": return left * right;
			case "/": return left / right;
			case "+": return left + right;
			case "-" : return left - right;
			}
		}
		
		// INT
		if( ctx.INT() != null) {
			return Integer.parseInt(ctx.INT().getText());
		}
		
		// (expr)
		return super.visitExpr(ctx);
	}
	
	@Override
	public Integer visitProg(ProgContext ctx) {
		// TODO Auto-generated method stub
		
		return visit(ctx.expr());	// calls visitExpr(ctx)
	}	
	
}
