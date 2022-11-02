package example.test.lab6;

/**
 * Class <code>CalcException</code> more precises ArithmeticException
 *
 */
class CalcException extends ArithmeticException {
    public CalcException(String message) {
        super(message);
    }
}