package seminar2;
/**
 * Напишите программу, которая запрашивает у пользователя пароль. Правила для пароля следующие:
 * - длина пароля должна быть не менее 8 символов
 * - пароль должен содержать хотя бы одну заглавную букву
 * - пароль должен содержать хотя бы одну цифру
 * - пароль должен содержать отя бы один специальный символ (!@#$%^&*).
 * Если пользователь вводит неправильный пароль,
 * программа должна выбрасывать исключение InvalidPasswordException с сообщением о причине ошибки.
 * Необходимо обработать исключение и вывести соответствующее сообщение.
 */
public class Password {
    public static void main(String[] args) {
        try {
            checkPassword("null");
        } catch (InvalidPasswordException e) {
            // TODO Auto-generated catch block
            // e.printStackTrace();
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void checkPassword(String password) 
    throws InvalidPasswordException{
        if (password.length() < 8) {
            throw new InvalidPasswordException("длина пароля должна быть не менее 8 символов");
        }
        if (!password.matches(".*[A-Z].*")) {
            throw new InvalidPasswordException("пароль должен содержать хотя бы одну заглавную букву");
            // .* соответствует любому количеству символов (включая отсутствие символов) в строке
            // [A-Z] соответствует любой заглавной букве от A до Z
        }
        if (!password.matches(".*[\\d].*")) {   // ".*[0-9].*"
            throw new InvalidPasswordException("пароль должен содержать хотя бы одну цифру");
        }
        if (!password.matches(".*[!@#$%^&*].*")) {
            throw new InvalidPasswordException("пароль должен содержать отя бы один специальный символ (!@#$%^&*)");
        }
        System.out.println("Пароль корректен.");
    }
    
}

class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}
