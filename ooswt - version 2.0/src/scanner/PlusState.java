package scanner;

import symbol.PlusSymbol;

/*
 * state while converting a plus character 
 */
public class PlusState extends State {
	
	/*
	 * constructor
	 */
	public PlusState(Scanner scanner) {
		super(scanner);
	}

	@Override
	public void scan(Character c) {
		this.getCurrentScanner().skip();
		this.getCurrentScanner().addSymbol(PlusSymbol.getInstance());
		this.endOfProcessing();
	}

}
