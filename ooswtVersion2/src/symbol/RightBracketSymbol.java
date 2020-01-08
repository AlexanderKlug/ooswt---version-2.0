package symbol;

/*
 * Symbol for a closing bracket
 * implemented as singleton
 */
public class RightBracketSymbol implements OperatorSymbol {
	private static final RightBracketSymbol INSTANCE = new RightBracketSymbol();		// singleton
	
	/*
	 * private constructor
	 */
	private RightBracketSymbol() {
	}
	
	/*
	 * returns the reference to the Right_Bracket_Symbol
	 */
	public static RightBracketSymbol getInstance() {
		return INSTANCE;
	}
	
	/*
	 * overrides the default implementation of equals
	 */
	public boolean equals(Object obj) {
		return obj == INSTANCE;
	}

	@Override
	public void accept(Visitor visitor) throws SymbolException {
		visitor.handle(this);;
	}
	
	/*
	 * overrides the default implementation of toString
	 */
	public String toSTring() {
		return "Right_Bracket_Symbol";
	}

}
