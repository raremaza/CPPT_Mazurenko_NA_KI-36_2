package example.test.lab5;

/**
 * Class <code>CalcException</code> more precises ArithmeticException
 *
 */
class CalcException extends ArithmeticException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CalcException(String message) {
        super(message);
    }
}