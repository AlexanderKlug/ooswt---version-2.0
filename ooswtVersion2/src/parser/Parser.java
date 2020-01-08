package parser;

import java.util.List;

import symbol.DivisionSymbol;
import symbol.EndSymbol;
import symbol.ErrorToken;
import symbol.LeftBracketSymbol;
import symbol.NumberSymbol;
import symbol.PlusSymbol;
import symbol.RightBracketSymbol;
import symbol.StarSymbol;
import symbol.Symbol;
import symbol.SymbolException;
import symbol.Visitor;

/*
 * Parser that converts a list of symbols to an arithmetic expression
 * throws SymbolError if syntax is wrong
 */
public abstract class Parser implements Visitor {
	private List<Symbol> symbols;
	
	/*
	 * constructor
	 */
	public Parser(List<Symbol> symbols) {
		this.symbols = symbols;
	}

	@Override
	public void handle(NumberSymbol symbol) throws SymbolException {
		throw new SymbolException("unerwartetes " + symbol.toString());
	}

	@Override
	public void handle(PlusSymbol symbol) throws SymbolException {
		throw new SymbolException("unerwartetes " + symbol.toString());
	}

	@Override
	public void handle(StarSymbol symbol) throws SymbolException {
		throw new SymbolException("unerwartetes " + symbol.toString());
	}

	@Override
	public void handle(LeftBracketSymbol symbol) throws SymbolException {
		throw new SymbolException("unerwartetes " + symbol.toString());
	}

	@Override
	public void handle(RightBracketSymbol symbol) throws SymbolException {
		throw new SymbolException("unerwartetes " + symbol.toSTring());
	}

	@Override
	public void handle(ErrorToken symbol) throws SymbolException {
		throw new SymbolException("unerwartetes " + symbol.toString());
	}

	@Override
	public void handle(EndSymbol symbol) throws SymbolException {
		throw new SymbolException("unerwartetes " + symbol.toString());
	}
	
	@Override
	public void handle(DivisionSymbol symbol) throws SymbolException {
		throw new SymbolException("unerwartetes " + symbol.toString());
	}

	/*
	 * removes the first symbol
	 */
	public void skip() {
		this.symbols.remove(0);
	}
	
	/*
	 * returns the first symbol of the list
	 */
	public Symbol getCurrentSymbol() {
		return this.symbols.get(0);
	}
	
	/*
	 * returns the current list of symbols
	 */
	public List<Symbol> getSymbols() {
		return this.symbols;
	}
	
	/*
	 * converts a List of symbols into an arithmetic expression
	 */
	public abstract Expression toExpression() throws SymbolException;
}
