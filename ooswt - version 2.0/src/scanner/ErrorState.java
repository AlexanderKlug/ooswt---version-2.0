package scanner;

import java.util.HashMap;

import symbol.ErrorToken;

/*
 * state while converting undefined chars
 */
public class ErrorState extends State {
	private HashMap<Character, State> char_To_State_Map;		// Hash Map to differentiate the scanned characters
	private StringBuilder result;		// private StringBuilder to save the undefined characters
	
	/*
	 * constructor
	 */
	public ErrorState(Scanner scanner) {
		super(scanner);
		this.char_To_State_Map = this.getCurrentScanner().getChar_To_State_Map();
		this.result = new StringBuilder();
	}

	@Override
	public void scan(Character c) {
		if(!(this.char_To_State_Map.containsKey(c))) {
			this.getCurrentScanner().skip();
			this.result.append(c);
		}
		else {
			this.exit();
			this.endOfProcessing();
		}
	}
	
	/*
	 * finishes the scan process of the state
	 */
	public void exit() {
		this.getCurrentScanner().addSymbol(new ErrorToken(result.toString()));
	}

}
