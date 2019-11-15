package parser;

import java.util.List;

import symbol.*;

/*
 * converts symbols into NaturalNumbers or BracketExpressions
 */
public class FactorParser extends Parser{
	private Factor myFactor;
	
	/*
	 * constructor
	 */
	public FactorParser(List<Symbol> symbols) {
		super(symbols);
	}

	/*
	 * converts a Symbol into an Expression
	 */
	public Factor toExpression() throws SymbolException {
		super.getCurrentSymbol().accept(this);
		return this.myFactor;
	}
	
	/*
	 * overrides the default implementation of how to handle a NumberSymbol
	 */
	public void handle(NumberSymbol symbol) throws SymbolException{
		this.myFactor = new NaturalNumber(Integer.valueOf(symbol.getValue()));
		super.skip();
	}
	
	/*
	 * overrides the default implementation of how to handle a LeftBracketExpression
	 */
	public void handle(LeftBracketSymbol symbol) throws SymbolException {
		super.skip();
		this.myFactor = new BracketExpression(new ExpressionParser(super.getSymbols()).toExpression());
		if(super.getCurrentSymbol().equals(RightBracketSymbol.getInstance())) {
			super.skip();
		}
		else
		{
			throw new SymbolException("missing RightBracketSymbol");
		}
	}

}
 