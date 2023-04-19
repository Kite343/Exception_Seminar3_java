package t1;

public class MyArraySizeException extends RuntimeException{
    
    public MyArraySizeException () {
        
        super("Массив должен иметь размер 4 на 4");

    }
}
