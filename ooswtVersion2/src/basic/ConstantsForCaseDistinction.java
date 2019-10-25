package basic;

import java.util.HashMap;

import scanner.*;

/*
 * class that stores constants which are used to differ characters
 */
public class ConstantsForCaseDistinction {
	
	public static final Character leftBracket = '(';		// constant for opening bracket
	public static final Character rightBracket = ')';		// constant for closing bracket
	public static final Character star = '*';				// constant for multiplication
	public static final Character plus = '+';				// constant for addition
	public static final Character whiteSpace = ' ';			// constant for whitespace
	public static final Character tab = '	';				// constant for tab
	
	/*
	 * hash map to convert a char into a state
	 */
	public static final HashMap<Character, State> char_To_State_Map = new HashMap<Character, State>();
	
	static {
		char_To_State_Map.put(leftBracket, new LeftBracketState());
		char_To_State_Map.put(rightBracket,	new RightBracketState());
		char_To_State_Map.put(star, new StarState());
		char_To_State_Map.put(plus, new PlusState());
		char_To_State_Map.put(whiteSpace,new WhitespaceState());
		char_To_State_Map.put(tab, new WhitespaceState());
		char_To_State_Map.put('0', new DigitState());
		char_To_State_Map.put('1', new DigitState());
		char_To_State_Map.put('2', new DigitState());
		char_To_State_Map.put('3', new DigitState());
		char_To_State_Map.put('4', new DigitState());
		char_To_State_Map.put('5', new DigitState());
		char_To_State_Map.put('6', new DigitState());
		char_To_State_Map.put('7', new DigitState());
		char_To_State_Map.put('8', new DigitState());
		char_To_State_Map.put('9', new DigitState());
	}

}
