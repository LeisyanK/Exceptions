package seminar3;
// вызывающий код не знает об ошибке и может работать с неправильными данными
public class ArrayExample {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        int element = getElementByIndex(array, 6);
        System.out.println("Значение элемента: " + element);
    }

    private static int getElementByIndex(int[] array, int index) {
        try {
            return array[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: Индекс выходит за пределы массива");
        }
        return 0;
    }
}
