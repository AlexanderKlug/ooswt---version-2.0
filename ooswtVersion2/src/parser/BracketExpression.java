package parser;
/*
 * arithmetic expression in brackets
 */
public class BracketExpression implements Factor {
	private Expression content;
	
	/*
	 * constructor
	 */
	public BracketExpression(Expression content) {
		this.content = content;
	}

	@Override
	public Integer evaluate() {
		return this.content.evaluate();
	}

}
