package seminar3;

public class TryExample {
    public static void main(String[] args) {
        try {
            int x = 10;
            int y = 20;
            int sum = x + y;
            System.out.println("Сумма: " + sum);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        System.out.println("sum: " + sum); // Ошибка: недопустимая область видимости
    }
}
