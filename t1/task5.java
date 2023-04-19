package t1;

// 1. Напишите метод, на вход которого подаётся двумерный строковый массив 
// размером 4х4. При подаче массива другого размера необходимо бросить
// исключение MyArraySizeException. 

// 2. Далее метод должен пройтись по всем элементам массива, преобразовать в 
// int и просуммировать. Если в каком-то элементе массива преобразование 
// не удалось (например, в ячейке лежит символ или текст вместо числа), 
// должно быть брошено исключение MyArrayDataException с детализацией, в 
// какой именно ячейке лежат неверные данные.

//  3. В методе main() вызвать полученный метод, обработать возможные 
// исключения MyArraySizeException и MyArrayDataException и вывести 
// результат расчета (сумму элементов, приусловии что подали на вход
// корректный массив).

public class task5 {
    public static void main(String[] args) {
        // String[][] nums = new String[][] {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        
        // String[][] nums = new String[][] {{"1", "2", "3", "4"}, {"1", "x", "3", "4"}, {"1", "2", "x", "4"}, {"1", "2", "3", "x"}};
        
        // String[][] nums = new String[][] {{"1", "2", "3", "4", "5"}, {"1", "2", "3", "4", "5"}, {"1", "2", "3", "4", "5"}, {"1", "2", "3", "4", "5"}};
        
        String[][] nums = new String[][] {{"1", "2", "3", "4", "5"}, {"1", "x", "3", "4", "5"}, {"1", "2", "x", "4", "5"}, {"1", "2", "3", "x", "5"}};
        
        try {
            System.out.println(arraySum(nums));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        } 
        
    }

    public static int arraySum(String[][] array) {
        int sum = 0;

        if (array.length != 4 || array[0].length != 4){
            throw new MyArraySizeException();
        }

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){

                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}
