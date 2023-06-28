package seminar2;

public class Task1 {
    public static void main(String[] args) {
        
        try {
            myInput(5);
            myInput(-1);
        } catch (MyException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        
    }

    public static void myInput(int value) throws MyException {
            if (value < 0) {
                throw new MyException("Значение не может быть отрицательным");
            }
            System.out.println("Обработка значения " + value);
        }
}

class MyException extends Exception {
    // конструктор
    public MyException(String message) {
        super(message);
    }
}