package t1;


public class DividedZeroException extends ArithmeticException{
    
    public DividedZeroException(int n) {
        super("деление на ноль " + n);
    }
}
