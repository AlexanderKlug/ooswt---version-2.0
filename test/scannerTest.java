package test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

import scanner.Scanner;
import symbol.*;

/*
 * testing of the package scanner and symbol
 */
class scannerTest {
	
	@Test
	void scannerTest1() {
		List<Symbol> symbolList = new ArrayList<Symbol>();
		symbolList.add(new NumberSymbol(5));
		Scanner scanner = new Scanner();
		List<Symbol> result = scanner.toSymbolSequence("5");
		assertEquals(symbolList, result);
	}

	@Test
	void scannerTest2() {
		List<Symbol> symbolList = new ArrayList<Symbol>();
		symbolList.add(new NumberSymbol(5));
		symbolList.add(PlusSymbol.getInstance());
		symbolList.add(new NumberSymbol(5));
		Scanner scanner = new Scanner();
		List<Symbol> result = scanner.toSymbolSequence("5+5");
		assertEquals(symbolList, result);
	}
	
	@Test
	void scannerTest3() {
		List<Symbol> symbolList = new ArrayList<Symbol>();
		symbolList.add(new NumberSymbol(27));
		symbolList.add(StarSymbol.getInstance());
		symbolList.add(new NumberSymbol(27));
		Scanner scanner = new Scanner();
		List<Symbol> result = scanner.toSymbolSequence("27*27");
		assertEquals(symbolList, result);
	}
	
	@Test
	void errorTokenTest1() {
		List<Symbol> symbolList = new ArrayList<Symbol>();
		symbolList.add(new ErrorToken("huurz!"));
		Scanner scanner = new Scanner();
		List <Symbol> result = scanner.toSymbolSequence(" huurz!   ");
		assertEquals(symbolList, result);
	}

}
