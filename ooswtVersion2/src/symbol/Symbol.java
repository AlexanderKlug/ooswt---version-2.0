package symbol;

/*
 * symbol in which a character can be converted 
 */
public interface Symbol {
	
	/*
	 * checks if two objects (a symbol and another object) are equal
	 * overrides the default implementation of equals 
	 */
	public boolean equals(Object obj);
	
	/*
	 * Visitor Pattern
	 * Object accepts visitor
	 */
	public void accept (Visitor visitor) throws SymbolException;
	
	/*
	 * returns the symbol description as string
	 * overrides the default implementation of toString
	 */
	public String toString();
}
