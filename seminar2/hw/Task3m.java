package seminar2.hw;

import java.util.Scanner;

public class Task3m {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Введите первое число: ");
            int num1 = sc.nextInt();
            System.out.print("Введите второе число: ");
            int num2 = sc.nextInt();
            System.out.print("Введите третье число: ");
            int num3 = sc.nextInt();
            firstSecondNumbers(num1, num2);
            firstSecondSum(num1, num2);
            thirdNumber(num3);
            System.out.println("Проверка пройдена успешно.");
        } catch (NumberOutOfRangeException e){
            System.out.println("Ошибка: " + e.getMessage());
        } catch (NumberSumException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (DivisionByZeroException e){
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void firstSecondNumbers(int num1, int num2) throws NumberOutOfRangeException{
        if (num1 > 100) {
            throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
        }
        if (num2 < 0) {
            throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
        }
    }

    public static void firstSecondSum(int num1, int num2) throws NumberSumException {
        if (num1 + num2 < 10) {
            throw new NumberSumException("Сумма первого и второго чисел слишком мала");
        }
    }

    public static void thirdNumber(int num3) throws DivisionByZeroException {
        if (num3 == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
    }
}

class NumberOutOfRangeException extends Exception{
    public NumberOutOfRangeException(String message) {
        super(message);
    }
}

class NumberSumException extends Exception{
    public NumberSumException (String message){
        super(message);
    }
}

class DivisionByZeroException extends Exception{
    public DivisionByZeroException(String message) {
        super(message);
    }
}