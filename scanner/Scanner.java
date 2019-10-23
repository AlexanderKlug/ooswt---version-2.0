package scanner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import symbol.*;

/*
 * Scanner that converts a string into a list of symbols
 */
public class Scanner {
	private List<Symbol> currentResult;		// list of symbols
	private State currentState;				//	state of the scanner while converting a string to a list of symbols
	private String currentExpression;		// string which has to be converted
	private HashMap<Character, State> char_To_Symbol_Map;		// Hash Map to differentiate the scanned characters 
	
	/*
	 * constructor
	 */
	public Scanner() {
		this.currentResult = new ArrayList<Symbol>();
		this.char_To_Symbol_Map = new HashMap<Character, State>();
		this.char_To_Symbol_Map.put('+', new PlusState(this));
		this.char_To_Symbol_Map.put('*', new StarState(this));
		this.char_To_Symbol_Map.put(' ', new WhitespaceState(this));
		this.char_To_Symbol_Map.put('(', new Left_Bracket_State(this));
		this.char_To_Symbol_Map.put(')', new Right_Bracket_State(this));
		this.char_To_Symbol_Map.put('0', new DigitState(this));
		this.char_To_Symbol_Map.put('1', new DigitState(this));
		this.char_To_Symbol_Map.put('2', new DigitState(this));
		this.char_To_Symbol_Map.put('3', new DigitState(this));
		this.char_To_Symbol_Map.put('4', new DigitState(this));
		this.char_To_Symbol_Map.put('5', new DigitState(this));
		this.char_To_Symbol_Map.put('6', new DigitState(this));
		this.char_To_Symbol_Map.put('7', new DigitState(this));
		this.char_To_Symbol_Map.put('8', new DigitState(this));
		this.char_To_Symbol_Map.put('9', new DigitState(this));
		this.currentState = new SelectionState(this, this.getChar_To_State_Map());
	}
	
	/*
	 * converts a string to a list of symbols
	 */
	public List<Symbol> toSymbolSequence(String expression) {
		this.currentExpression = expression;
		
		while(this.currentExpression.length() > 0) {
			this.currentState.scan(this.currentExpression.charAt(0));
		}
		
		this.currentState.exit();
		return this.currentResult;
	}
	
	/*
	 * setter method for the attribute currentScanner
	 */
	public void setCurrentState(State state) {
		this.currentState = state;
	}
	
	/*
	 * getter method for the attribute char_To_State_Map
	 */
	public HashMap<Character, State> getChar_To_State_Map() {
		return this.char_To_Symbol_Map;
	}

	/*
	 * deletes the first character of the attribute currentExpression
	 */
	public void skip() {
		if(this.currentExpression.length() > 0) {
			this.currentExpression = this.currentExpression.substring(1);
		}
	}
	
	/*
	 * adds a symbol to currentResult
	 */
	public void addSymbol(Symbol symbol) {
		this.currentResult.add(symbol);
	}
}
