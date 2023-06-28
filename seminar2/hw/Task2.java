package seminar2.hw;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Введите первое число: ");
            int num1 = sc.nextInt();
            System.out.print("Введите второе число: ");
            int num2 = sc.nextInt();
            System.out.print(num1 + " / " + num2 + " = ");
            System.out.println(division(num1, num2));
        } catch (DivisionByZeroException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    public static int division(int num1, int num2) throws DivisionByZeroException{
        if (num2 == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо.");
        }
        return num1 / num2;
    }
}

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message){
        super(message);
    }
}