package symbol;

/*
 * Visitor Pattern for case distinction
 * includes specifie  d error handling
 */
public interface Visitor {
	
	/*
	 * how to treat NumberSymbols
	 */
	public void handle(NumberSymbol symbol) throws SymbolException;
	/*
	 * how to treat PlusSymbols
	 */
	public void handle(PlusSymbol symbol) throws SymbolException;
	
	/*
	 * how to treat StarSymbols
	 */
	public void handle(StarSymbol symbol) throws SymbolException;
	
	/*
	 * how to treat Left_Bracket_Symbols
	 */
	public void handle(LeftBracketSymbol symbol) throws SymbolException;
	
	/*
	 * how to treat Right_Bracket_Symbols
	 */
	public void handle(RightBracketSymbol symbol) throws SymbolException;
	
	/*
	 * how to treat ErrorTokens
	 */
	public void handle(ErrorToken symbol) throws SymbolException;
	
	/*
	 * how to treat EndSymbols
	 */
	public void handle(EndSymbol symbol) throws SymbolException;

}
