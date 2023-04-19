package t1;

public class MyArrayDataException extends RuntimeException{
    
    public MyArrayDataException(int i, int j){
        super("Данные в ячейке " + i + "_" + j + " не являются числом");
    }
}
