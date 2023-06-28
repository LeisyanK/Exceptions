package seminar1.hw;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Введите первое число: ");
            int num1 = sc.nextInt();
            System.out.println("Введите второе число: ");
            int num2 = sc.nextInt();
            System.out.println(num1 + " / " + num2 + " = " + num1 / num2);
        } catch (ArithmeticException e) {
            System.out.println("Делить на ноль нельзя!");
        } finally {
            sc.close();
        }

        System.out.println("Второй способ решения: проброс ошибки выше.");
        try {
            System.out.println(Task1.divide());
        } catch (ArithmeticException e) {
            System.out.println("Делить на ноль нельзя!");
        }
    }

    public static int divide() throws ArithmeticException {
        System.out.println("Введите первое число: ");
        int num1 = 5;
        System.out.println("Первое число: " + num1);
        int num2 = 0;
        System.out.println("Второе число: " + num2);
        System.out.println(num1 + " / " + num2 + " = " + num1 / num2);
        return num1 / num2;
    }
}
