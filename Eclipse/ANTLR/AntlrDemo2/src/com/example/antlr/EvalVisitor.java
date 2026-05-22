package com.example.antlr;

public class EvalVisitor extends CalcBaseVisitor<Integer> {

    @Override
    public Integer visitProg(CalcParser.ProgContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Integer visitExpr(CalcParser.ExprContext ctx) {
        int result = visit(ctx.term(0));

        for (int i = 1; i < ctx.term().size(); i++) {
            String op = ctx.getChild(2 * i - 1).getText();

            if (op.equals("+")) {
                result += visit(ctx.term(i));
            } else {
                result -= visit(ctx.term(i));
            }
        }
        return result;
    }

    @Override
    public Integer visitTerm(CalcParser.TermContext ctx) {
        int result = visit(ctx.factor(0));

        for (int i = 1; i < ctx.factor().size(); i++) {
            String op = ctx.getChild(2 * i - 1).getText();

            if (op.equals("*")) {
                result *= visit(ctx.factor(i));
            } else {
                result /= visit(ctx.factor(i));
            }
        }
        return result;
    }

    @Override
    public Integer visitFactor(CalcParser.FactorContext ctx) {
        // Case 1: number
        if (ctx.INT() != null) {
            return Integer.parseInt(ctx.INT().getText());
        }

        // Case 2: (expr)
        return visit(ctx.expr());	
    }
}