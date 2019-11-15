package parser;

import java.util.List;

import symbol.EndSymbol;
import symbol.PlusSymbol;
import symbol.RightBracketSymbol;
import symbol.StarSymbol;
import symbol.Symbol;
import symbol.SymbolException;

/*
 * converts symbols into Products or Factors
 */
public class SummandParser extends Parser {
	private Summand mySummand;
	
	public SummandParser(List<Symbol> symbols) {
		super(symbols);
	}
	
	/*
	 * converts a Symbol into an Expression
	 */
	public Summand toExpression() throws SymbolException{
		this.mySummand = new FactorParser(super.getSymbols()).toExpression();
		super.getCurrentSymbol().accept(this);
		return this.mySummand;
	}
	
	/*
	 * overrides the default implementation how to handle a PlusSymbol
	 */
	public void handle(PlusSymbol symbol) throws SymbolException {	
	}
	
	/*
	 * overrides the default implementation how to handle a StarSymbol
	 */
	public void handle(StarSymbol symbol) throws SymbolException {
		super.skip();
		
		this.mySummand = new Product((Factor) this.mySummand, new SummandParser(super.getSymbols()).toExpression());
	}
	
	/*
	 * overrides the default implementation how to handle EndSymbols;
	 */
	public void handle(EndSymbol symbol) {	
	}
	
	/*
	 * overrides the default implementaion hot to handleRightBracketSymbols
	 */
	public void handle(RightBracketSymbol symbol) {
	}

}
