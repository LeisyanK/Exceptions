package seminar1.hw;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task3m {
    public static void main(String[] args) {
        summa();
        // File file = new File("null");
    }

    public static void summa() {
        // try {
        //     File file = new File("G:\\GEEK_BRAINS\\Quarter2\\Exceptions\\seminar1\\hw\\text.txt");
        //     System.out.println(file.read());
        // } catch (FileNotFoundException e) {
        //     System.out.println("Файл не найден");
        // }
        // return 1;

        // посимвольное чтение
        // try {
        //     FileReader fr = new FileReader("G:\\GEEK_BRAINS\\Quarter2\\Exceptions\\seminar1\\hw\\text.txt");
        //     int i;
        //     while ((i = fr.read()) != -1) {
        //         System.out.println((char)i);
        //     }
        // } catch (FileNotFoundException e) {
        //     System.out.println(e.getClass().getSimpleName());
        // } catch (IOException e) {
        //     System.out.println(e.getClass().getSimpleName());
        // }

        // построчное чтение файла
        int sum = 0;
        try {
            File file = new File("G:\\GEEK_BRAINS\\Quarter2\\Exceptions\\seminar1\\hw\\text.txt");
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
                // считываем остальные строки в цикле
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Строка не является числом.");
        } finally {
            System.out.println("Сумма равна " + sum);
        }
    }
}
