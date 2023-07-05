package seminar3.hw;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2 числа: ");
        try {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println(calculatePower(num1, num2));
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введено не число"); // + e.getClass().getSimpleName());
        } catch (InvalidInputException e) {
            // throw new RuntimeException(e);
            System.out.println("Ошибка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getClass().getSimpleName());
        } finally {
            sc.close();
        }
    }

    public static double calculatePower(int base, int power) throws InvalidInputException {
        if (base == 0 && power < 0) {
            throw new InvalidInputException("деление на ноль.");
        }
        return Math.pow(base, power); //num1 ** num2;
    }
}

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}
