package symbol;

/*
 * symbol of division implemented as singleton
 */
public class DivisionSymbol implements OperatorSymbol {
	private static final DivisionSymbol DIVISIONSYMBOL = new DivisionSymbol();								// singleton
	
	/*
	 * getter for instance of DivisionSymbol
	 */
	public static DivisionSymbol getDivisionSymbol() {
		return DIVISIONSYMBOL;
	}
	
	
	@Override
	public void accept(Visitor visitor) throws SymbolException {
		visitor.handle(this);
	}

}
