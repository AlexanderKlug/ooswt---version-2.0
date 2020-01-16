package facade;

import java.util.List;

import exceptions.DivisionException;
import exceptions.SymbolException;
import parser.Expression;
import parser.ExpressionParserProxy;
import scanner.Scanner;
import symbol.Symbol;

/*
 * Entry point into application logic
 * summarizes the functionalities of scanner and parser
 */
public class Facade {

	private String input;
	
	/*
	 * evaluates arithmetic expresions
	 * evaluation order from right to left!
	 */
	public Integer evaluate(String input) throws SymbolException, DivisionException{
		this.input = input;
		return this.compile(input).evaluate();
	}
	
	/*
	 * checks syntax of user entered arithmetic expression
	 */
	public Expression checkSyntax(String input) throws SymbolException {
		this.input = input;
		return this.compile(input);
	}
	
	
	/*
	 * converts an user entered String into an expression
	 * throws SymbolExceptions
	 */
	private Expression compile(String input) throws SymbolException {
		ExpressionParserProxy proxyParser = new ExpressionParserProxy();
		List<Symbol> listOfSymbols = Scanner.getScanner().toSymbolSequence(input);
		Expression expression = proxyParser.toExpression(listOfSymbols);
		return expression;
	}

}
