
import java.util.List;

import scanner.Scanner;
import symbol.Symbol;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = Scanner.getScanner();
		List<Symbol> result = scanner.toSymbolSequence("4+  5  ");
		System.out.println(result);
	}

}
