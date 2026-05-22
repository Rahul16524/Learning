package com.example.antlr;

import com.example.antlr.CalcParser.ExprContext;

public class MyListener extends CalcBaseListener{
	
	
	
	@Override
	public void enterExpr(ExprContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("Enter inside : " + ctx.getText());
	}
	
	@Override
	public void exitExpr(ExprContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("Exit leaving: " + ctx.getText());
	}
}
