package ModulJayJay;

public class OddEvenChecker {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            checkOddEven(i);
        }
    }

    private static void checkOddEven(int number) {
        if (number < 1 || number > 10) {
            System.out.println(number + ": angka di luar jangkauan");
        } else if (number % 2 == 0) {
            System.out.println(number + ": genap");
        } else {
            System.out.println(number + ": ganjil");
        }
    }
}
