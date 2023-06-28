package seminar2.hw;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = sc.nextInt();
        try {
            myInput(num);
        } catch (InvalidNumberException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        sc.close();
    }

    public static void myInput(int value) throws InvalidNumberException {
            if (value <= 0) {
                throw new InvalidNumberException("Некорректное число");
            }
            System.out.println("Корректное число " + value);
        }
}

class InvalidNumberException extends Exception {
    // конструктор
    public InvalidNumberException(String message) {
        super(message);
    }
}