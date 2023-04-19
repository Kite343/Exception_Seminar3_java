package t1;

// Создайте класс Счетчик, у которого есть метод add(), увеличивающий 
// значение внутренней int переменной на 1.Сделайте так,чтобы с объектом 
// такого тип аможно было работать в блокеtry-with-resources. Нужнобросить 
// исключение, если работа с объектом типа счетчик была не в ресурсном try
// и/или ресурс о стался открыт. Подумайте какой тип исключения подойдет
// лучше всего.   

public class task3 {
    public static void main(String[] args) throws Exception {
        try (Counter counter = new Counter();) {
            System.out.println(counter);
            counter.add();
            System.out.println(counter);
            System.out.println();

        }

        Counter counter = new Counter();
        System.out.println(counter);
        counter.close();
        counter.add();
        System.out.println(counter);
    }


}
