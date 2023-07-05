package seminar3;

public class ArrayExample2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        try {
            int element = getElementByIndex(array, 6);
            System.out.println("Значение элемента: " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: Индекс выходит за пределы массива");
        }
    }

    private static int getElementByIndex(int[] array, int index) {
        return array[index];        
    }
    
}
