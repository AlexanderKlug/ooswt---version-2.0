package parser;

import java.util.List;

import scanner.Scanner;
import symbol.Symbol;
import symbol.SymbolException;

public class Main {

	public static void main(String[] args) throws SymbolException {
		try {
		ExpressionParserProxy proxy = new ExpressionParserProxy();
		List<Symbol> list = Scanner.getScanner().toSymbolSequence("5+5)");
		Expression exp = proxy.toExpression(list);
		System.out.println(exp.evaluate());
		}
		catch(SymbolException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
