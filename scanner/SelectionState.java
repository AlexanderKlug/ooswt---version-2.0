package scanner;

import java.util.HashMap;

public class SelectionState extends State{
	private HashMap<Character, State> char_To_State_Map;		// Hash Map to differentiate the scanned characters 
	
	/*
	 * constructor
	 */
	public SelectionState(Scanner scanner, HashMap<Character, State> map) {
		super(scanner);
		this.char_To_State_Map = map;
	}

	@Override
	public void scan(Character c) {
		if(!(this.char_To_State_Map.containsKey(c))) {
			this.getCurrentScanner().setCurrentState(new ErrorState(this.getCurrentScanner(), this.getCurrentScanner().getChar_To_State_Map()));
		}
		else {
			this.getCurrentScanner().setCurrentState(this.char_To_State_Map.get(c));
		}
	}

}
