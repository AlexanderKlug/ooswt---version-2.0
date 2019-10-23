package symbol;

/*
 * Symbol for a closing bracket
 * implemented as singleton
 */
public class Right_Bracket_Symbol implements OperatorSymbol {
	private static final Right_Bracket_Symbol INSTANCE = new Right_Bracket_Symbol();		// singleton
	
	/*
	 * returns the reference to the Right_Bracket_Symbol
	 */
	public static Right_Bracket_Symbol getInstance() {
		return INSTANCE;
	}
	
	/*
	 * overrides the default implementation of equals
	 */
	public boolean equals(Object obj) {
		return obj == INSTANCE;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.handleRight_Brackte_Symbol(this);
	}
	
	/*
	 * overrides the default implementation of toString
	 */
	public String toSTring() {
		return "Right_Bracket_Symbol";
	}

}
