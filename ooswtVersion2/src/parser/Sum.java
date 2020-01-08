package parser;
/*
 * arithmetic sum
 */
public class Sum implements Expression {
	private Summand first;		
	private Expression second;
	
	/*
	 * constructor
	 */
	public Sum(Summand first, Expression second) {
		this.first = first;
		this.second = second;
	}

	@Override
	public Integer evaluate() {
		return this.first.evaluate() + this.second.evaluate();
	}

}
