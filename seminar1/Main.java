package seminar1;

public class Main{
    public static void main(String[] args) {
    task4();
}

    public static void task1(){
        int[] nums = new int[4];
        try {
            System.out.println("До генерации исключения");
            nums[6] = 10;
            System.out.println("1234");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за границы массива");
        }
        System.out.println("После оператора catch");
    }

    public static void task2(){
        int[] arr1 = {4, 8, 16, 32, 64, 128};
        int[] arr2 = {2, 0, 4, 4, 0, 8};
        for (int i = 0; i < arr1.length; i++) {
            try {
                System.out.println(arr1[i] + " / " + arr2[i] + " = " + arr1[i] / arr2[i]);
            } catch (ArithmeticException e) {
                System.out.println("Попытка деления на ноль.");
            }
        }
    }

    public static void task3(){
        int[] arr1 = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] arr2 = {2, 0, 4, 4, 0, 8};
        for (int i = 0; i < arr1.length; i++) {
            try {
                System.out.println(arr1[i] + " / " + arr2[i] + " = " + arr1[i] / arr2[i]);
            } catch (ArithmeticException e) {
                System.out.println("Попытка деления на ноль.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Соответствующий элемент не найден");
            }
        }
    }

    public static void task4(){
        int[] arr1 = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] arr2 = {2, 0, 4, 4, 0, 8};
        for (int i = 0; i < arr1.length; i++) {
            try {
                System.out.println(arr1[i] + " / " + arr2[i] + " = " + arr1[i] / arr2[i]);
            } 
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Соответствующий элемент не найден");
            }
            catch (Throwable e) {
                System.out.println("Все другие ошибки.");
                System.out.println(e);
            }
        }
    }
}

