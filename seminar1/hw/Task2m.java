package seminar1.hw;

import java.util.Scanner;

public class Task2m {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Введите возраст:");
            int age = Integer.parseInt(sc.nextLine());
            System.out.println("Ваш возраст: " + age);
        } catch (NumberFormatException e) {
            System.out.println("Введено некорректное значение.");
        } finally {
            sc.close();
        }
    }    
}
