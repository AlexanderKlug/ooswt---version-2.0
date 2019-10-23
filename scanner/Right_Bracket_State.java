package scanner;

import symbol.Right_Bracket_Symbol;

/*
 * state while convertig an closing bracket
 */
public class Right_Bracket_State extends State {

	/*
	 * constructor
	 */
	public Right_Bracket_State(Scanner scanner) {
		super(scanner);
	}

	@Override
	public void scan(Character c) {
		this.getCurrentScanner().skip();
		this.getCurrentScanner().addSymbol(Right_Bracket_Symbol.getInstance());
		this.endOfProcessing();
	}
}
