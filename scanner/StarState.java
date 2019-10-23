package scanner;

import symbol.StarSymbol;

/*
 * state while converting multiplication character
 */
public class StarState extends State{
	
	/*
	 * constructor
	 */
	public StarState(Scanner scanner) {
		super(scanner);
	}

	@Override
	public void scan(Character c) {
		this.getCurrentScanner().skip();
		this.getCurrentScanner().addSymbol(StarSymbol.getInstance());
		this.endOfProcessing();
	}

}
