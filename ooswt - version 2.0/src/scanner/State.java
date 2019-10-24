package scanner;

/*
 * state that a scanner can have while converting a string to a list if symbols
 */
public abstract class State {
	private Scanner currentScanner;			// scanner of the state
	
	/*
	 * constructor
	 */
	public State(Scanner scanner) {
		this.currentScanner = scanner;
	}
	
	/*
	 * getter method for the attribute currentScanner
	 */
	public Scanner getCurrentScanner() {
		return this.currentScanner;
	}
	
	/*
	 * converts a string into a list of symbols
	 */
	public abstract void scan(Character c);
	
	/*
	 * finishes the scan process of the state
	 */
	public void exit() {
		
	}
	
	/*
	 * sets a new SelectionState
	 */
	public void endOfProcessing( ) {
		this.getCurrentScanner().setCurrentState(new SelectionState(this.getCurrentScanner()));
	}

}
