package scanner;

import symbol.Left_Bracket_Symbol;

/*
 * state while converting an opening bracket
 */
public class Left_Bracket_State extends State {

	/*
	 * constructor
	 */
	public Left_Bracket_State(Scanner scanner) {
		super(scanner);
	}

	@Override
	public void scan(Character c) {
		this.getCurrentScanner().skip();
		this.getCurrentScanner().addSymbol(Left_Bracket_Symbol.getInstance());
		this.endOfProcessing();
	}
}
