package seminar3.hw;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankTransaction2 {
    public static void main(String[] args) {
        double balance = 1000.50;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Введите сумму перевода: ");
            double amount = sc.nextDouble();
            checkAmount(amount, balance);
            System.out.println("Перевод выполнен успешно.");
        } catch (InputMismatchException e) {
            // throw new RuntimeException(e);
            System.out.println("Ошибка: некорректный ввод");
        } catch (InvalidAmountException e) {
            // TODO Auto-generated catch block
            // e.printStackTrace();
            System.out.println("Ошибка: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            // TODO Auto-generated catch block
            // e.printStackTrace();
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    public static void checkAmount (double amount, double balance) 
    throws InvalidAmountException, InsufficientFundsException {
        if (amount <= 0) {
            throw new InvalidAmountException("Некорректная сумма перевода");
        }
        if (amount > balance) {
                throw new InsufficientFundsException("Недостаточно средств на счете");
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