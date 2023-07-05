package seminar3.hw;

public class task1 {
    public static void main(String[] args) {
        
    }
}

class PowerCalculator extends Exception {

    public PowerCalculator(String message) {
        super(message);
    }

    public static void calculatePower(int base, int power) throws PowerCalculator {
        if (base == 0 && power < 0) {
            throw new PowerCalculator("Деление ");
        }
    }
}
