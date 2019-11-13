package parser;
/*
 * arithmetic product
 */
public class Product implements Factor, Summand {
	private Factor first;
	private Summand second;
	
	/*
	 * constructor
	 */
	public Product(Factor first, Summand second) {
		this.first = first;
		this.second = second;
	}

	@Override
	public Integer evaluate() {
		return this.first.evaluate() * this.second.evaluate();
	}

}
