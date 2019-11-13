package parser;

import java.util.List;

import symbol.BracketSymbol;
import symbol.LeftBracketSymbol;
import symbol.NumberSymbol;
import symbol.RightBracketSymbol;
import symbol.Symbol;
import symbol.SymbolException;

public class FactorParser extends Parser{
	private Factor myFactor;
	
	/*
	 * constructor
	 */
	public FactorParser(List<Symbol> symbols) {
		super(symbols);
	}

	@Override
	public Expression toExpression() throws SymbolException {
		super.getCurrentSymbol().accept(this);
		return this.myFactor;
	}
	
	public void handle(NumberSymbol symbol) throws SymbolException{
		this.myFactor = new NaturalNumber(Integer.valueOf(symbol.getValue()));
		super.skip();
	}
	
	public void handle(LeftBracketSymbol symbol) throws SymbolException {
		super.skip();
		this.myFactor = new BracketExpression(new ExpressionParser(super.getSymbols()).toExpression());
		if(super.getCurrentSymbol().equals(RightBracketSymbol.getInstance())) {
			super.skip();
		}
		else
		{
			throw new SymbolException("unerwartetes " + symbol.toString());
		}
	}

}
 