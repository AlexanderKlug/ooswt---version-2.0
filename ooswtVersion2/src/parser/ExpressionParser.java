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

	public Expression toExpression() throws SymbolException {
		SummandParser parser = new SummandParser(super.getSymbols());
		super.getCurrentSymbol().accept(this);
		this.myExpression = parser.toExpression();
		return this.myExpression;
	}
	
	
	public void handle(PlusSymbol symbol) {
		
	}
}
