package scanner;

import symbol.LeftBracketSymbol;

/*
 * state while converting an opening bracket
 */
public class LeftBracketState extends State {

	/*
	 * constructor
	 */
	public LeftBracketState(Scanner scanner) {
		super(scanner);
	}

	@Override
	public void scan(Character c) {
		this.getCurrentScanner().skip();
		this.getCurrentScanner().addSymbol(LeftBracketSymbol.getInstance());
		this.endOfProcessing();
	}
}
