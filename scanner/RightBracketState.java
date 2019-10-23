package scanner;

import symbol.RightBracketSymbol;

/*
 * state while convertig an closing bracket
 */
public class RightBracketState extends State {

	/*
	 * constructor
	 */
	public RightBracketState(Scanner scanner) {
		super(scanner);
	}

	@Override
	public void scan(Character c) {
		this.getCurrentScanner().skip();
		this.getCurrentScanner().addSymbol(RightBracketSymbol.getInstance());
		this.endOfProcessing();
	}
}
