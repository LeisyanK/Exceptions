package seminar1;

import java.io.IOException;

public class Task5 {
    public static char prompt(String str)
    throws java.io.IOException {
        System.out.println(str + ": ");
        return (char) System.in.read();
    }

    public static void main(String[] args) {
        char ch;
        try {
            ch = prompt("Введите символ: ");
        } catch (java.io.IOException e) {
            System.out.println("Произошло исключение ввода-вывода");
            ch = 'X';
        }
        System.out.println("Вы нажали: " + ch);
    }
}
