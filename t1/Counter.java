package t1;

import java.io.IOException;

public class Counter  implements AutoCloseable {

    // примитивные классы автоматически приравниваются к нулю
    //  если будет тип Integer, то обязателен конструктор, иначе значение будет равно null и выдаст ошибку

    private int count;
    static boolean closed = false;

    public void add() throws IOException {
        // if(closed){throw new RuntimeException("Counter closed");}
        if(closed){throw new IOException("Counter closed");}
        // closeChek();
        this.count++;
    }

    @Override
    public void close() throws Exception {
        // если работа с файлом, то необходимо прописывать закрытие файла, 
        // иначе он будет висеть открытым пока не закроем приложение, и у других программ не будет доступа к нему

        // можно убрать переменную closed,
        // и написать
        // this.count = null, далее в if проверять count == null, предпочтительно для count тип Integer
        closed = true;
    }

    @Override
    public String toString() {
        return String.valueOf(count);
    }

    // private static void closeChek() throws IOException {
    //     if(closed){throw new IOException("Counter closed");}
    // }    
}
