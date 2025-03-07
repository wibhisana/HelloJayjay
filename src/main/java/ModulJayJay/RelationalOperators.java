package ModulJayJay;

import java.util.Scanner;

public class RelationalOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input dari pengguna
        System.out.print("Masukkan bilangan bulat pertama: ");
        int num1 = scanner.nextInt();
        System.out.print("Masukkan bilangan bulat kedua: ");
        int num2 = scanner.nextInt();

        // Melakukan perbandingan dan mencetak hasilnya
        System.out.println(num1 + " == " + num2 + ": " + (num1 == num2));
        System.out.println(num1 + " != " + num2 + ": " + (num1 != num2));
        System.out.println(num1 + " > " + num2 + ": " + (num1 > num2));
        System.out.println(num1 + " >= " + num2 + ": " + (num1 >= num2));
        System.out.println(num1 + " < " + num2 + ": " + (num1 < num2));
        System.out.println(num1 + " <= " + num2 + ": " + (num1 <= num2));

        scanner.close();
    }
}
