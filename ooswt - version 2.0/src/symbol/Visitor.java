package symbol;

/*
 * Visitor Pattern for case distinction
 */
public interface Visitor {
	
	/*
	 * how the visitor treats a NumberSymbol
	 */
	public void handleNumberSymbol(NumberSymbol symbol);
	
	/*
	 * how the visitor treats a PlusSymbol
	 */
	public void handlePlusSymbol(PlusSymbol symbol);
	
	/*
	 * how the visitor treats a StarSymbol
	 */
	public void handleStarSymbol(StarSymbol symbol);
	
	/*
	 * how the visitor treats a Left_Bracket_Symbol
	 */
	public void handleLeft_Bracket_Symbol(LeftBracketSymbol symbol);
	
	/*
	 * how the visitor treats a Right_Bracket_Symbol
	 */
	public void handleRight_Brackte_Symbol(RightBracketSymbol symbol);
	
	/*
	 * how the visitor treats an ErrorToken
	 */
	public void handleErrorToken(ErrorToken symbol);
	
	/*
	 * how trhe visitor treats an EndSymbol
	 */
	public void handleEndSymbol(EndSymbol symbol);

}
