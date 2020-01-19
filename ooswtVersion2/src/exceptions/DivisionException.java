package exceptions;

/*
 * exceptions which can appear by evaluation of a Quotient
 */
public class DivisionException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * constructor
	 */
	public DivisionException(String message) {
		super(message);
	}
}
