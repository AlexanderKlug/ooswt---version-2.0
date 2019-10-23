package symbol;

/*
 * Symbol for an opening bracket
 * implemented as singleton
 */
public class Left_Bracket_Symbol implements BracketSymbol {
	private static final Left_Bracket_Symbol INSTANCE = new Left_Bracket_Symbol();		// singleton
	
	/*
	 * returns the reference to the Left_Bracket_Symbol
	 */
	public static Left_Bracket_Symbol getInstance() {
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
		visitor.handleLeft_Bracket_Symbol(this);
	}
	
	/*
	 * overrides the default implementation of toString
	 */
	public String toString() {
		return "Left_Bracket_Symbol";
	}

}
