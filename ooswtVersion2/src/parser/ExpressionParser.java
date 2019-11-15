package parser;

import java.util.List;


import symbol.*;


public class ExpressionParser extends Parser {
	private Expression myExpression;
	
	/*
	 * constructor
	 */
	public ExpressionParser(List<Symbol> symbols) {
		super(symbols);
	}
	/*
	 * converts a Symbol into an Expression
	 */
	public Expression toExpression() throws SymbolException {
		this.myExpression = new SummandParser(super.getSymbols()).toExpression();
		super.getCurrentSymbol().accept(this);
		return this.myExpression;
	}
	
	/*
	 * overrides the default implementation how to handle a PlusSymbol
	 */
	public void handle(PlusSymbol symbol) throws SymbolException {
		super.skip();
		this.myExpression = new Sum( (Summand) this.myExpression, new ExpressionParser(super.getSymbols()).toExpression());
	}
	
	/*
	 * overrides the default implementation how to handle EndSymbols
	 */
	public void handle(EndSymbol symbol) {
	}
	
	/*
	 * overrides the default implementation how to handle RightBracketSymbols 
	 */
	public void handle(RightBracketSymbol symbol) {
	}
}
