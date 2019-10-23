package scanner;

/*
 * state while converting whitespace 
 */
public class WhitespaceState extends State {
	
	/*
	 * constructor
	 */
	public WhitespaceState(Scanner scanner) {
		super(scanner);
	}

	@Override
	public void scan(Character c) {
		this.getCurrentScanner().skip();
		this.endOfProcessing();
	}

}
