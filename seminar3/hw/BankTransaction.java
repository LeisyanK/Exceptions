package seminar3.hw;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankTransaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 1000.50;
        try {
            System.out.println("Введите сумму перевода: ");
            double amount = sc.nextDouble();
            if (amount <= 0) {
                throw new InvalidAmountException("Некорректная сумма перевода");
            }
            if (amount > balance) {
                throw new InsufficientFundsException("Недостаточно средств на счете");
            }
            System.out.println("Перевод выполнен успешно.");
        } catch (InvalidAmountException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (InputMismatchException e) {
            // throw new RuntimeException(e);
            System.out.println("Ошибка: некорректный ввод");
        } catch (InsufficientFundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
            // e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}

class InvalidAmountException extends Exception {
    public InvalidAmountException (String message) {
        super(message);
    }
}
class InsufficientFundsException extends Exception {
    public InsufficientFundsException (String message) {
        super(message);
    }
}