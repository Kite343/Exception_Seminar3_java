package t1;

import java.io.IOException;

// Создайте метод doSomething(), который может быть источником одного из 
// типов checked exceptions (тело самого метода прописывать не обязательно). 
// Вызовите этот метод из main и обработайте в нем исключение, которое 
// вызвал метод doSomething().

public class task2 {
    public static void main(String[] args) {
        System.out.println("start");
        System.out.println();
        try {
            doSomething();
        } catch (IOException e) {
            System.out.println(e);
            // e.printStackTrace(); // можно вместе с println
            // throw new RuntimeException(e); // println с этим не работает
            System.out.println("получили IOException в main" + " идущее из " + e);
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
            //  для прерывания программы
            // System.exit(1);
        }
        System.out.println();
        System.out.println("the end");
    }

    public static void doSomething() throws IOException{
        // лучше использовать этот вариант, чтобы объект не висел в памяти, а подчищался мусорщиком после использования
        throw new IOException("исключение в doSomething");
        // то же самое:
        // IOException e = new IOException("исключение в doSomething");
        // throw e;

    }
}
