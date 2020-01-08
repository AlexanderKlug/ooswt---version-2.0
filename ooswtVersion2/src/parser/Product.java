        	 	package parser;

import symbol.StarSymbol;
import symbol.Symbol;

/*
 * arithmetic product
 */
public class Product implements Factor, Summand {
	private Factor first;
	private Summand second;
	private Symbol operator;
	
	/*
	 * constructor
	 */
	public Product(Factor first, Summand second, Symbol operator) {
		this.first = first;
		this.second = second;
		this.operator = operator;
	}

	@Override
	public Integer evaluate() {
		if(this.operator == StarSymbol.getInstance()) {
		return this.first.evaluate() * this.second.evaluate();
		} else {
		return this.first.evaluate() / this.second.evaluate();
		}
	}
}
