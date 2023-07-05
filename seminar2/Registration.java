package seminar2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Регистрация пользователя
 * Напишите программу, которая реализует систему регистрации пользователей.
 * При регистрации пользователь должен ввести свое имя и возраст. Однако в 
 * программе должна быть обработка возможных ошибок при вводе данных.
 * Условия:
 * Если пользователь не вводит имя или оно содержит только пробельные символы,
 * программа должна выбрасывать собственное исключение InvalidNameException с
 * сообщением "Некорректное имя пользователя." 
 * Если пользователь не вводит возраст или вводит некорректное значение возраста
 * (отрицательное число или нечисловые символы), программа должна выбрасывать 
 * собствееное исключение InvalidAgeException с сообщением "Некорректный возраст
 * пользователя".
 * Если пользователь успешно ввел имя и возраст, программа должна выводить 
 * сообщение "Регистрация успешна!".
 */

public class Registration {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Введите имя: ");
            String name = sc. nextLine();
            checkName(name);
            try {
                System.out.println("Введите возраст: ");
                int age = sc.nextInt();
                checkAge(age);
                System.out.println("Регистрация успешна!");
            } catch (InvalidAgeException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Некорректный возраст пользователя");
            }
        } catch (InvalidNameException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkName(String userName)
    throws InvalidNameException {
        if (userName.isBlank()) {
            throw new InvalidNameException("Некорректное имя пользователя.");
        }
        // if (userName.trim().isEmpty()) {
        //     throw new InvalidNameException("Имя не введено");
        // }
        // if (userName.matches("^\\s+$")) {
        //     throw new InvalidNameException("Имя не введено");
        // }
    }
    public static void checkAge(int age)
    throws InvalidAgeException {
        if (age < 0) { // !age.matches("^\\d+$")
            throw new InvalidAgeException("Некорректный возраст пользователя");
        }
    }
}

class InvalidNameException extends Exception{
    public InvalidNameException(String message){
        super(message);
    }
}
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}