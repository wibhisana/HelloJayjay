package ModulJayJay;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        System.out.print("CAT dan tac adalah anagram: "+isAnagram("CAT", "tac")+"\n");

        Scanner scanner = new Scanner(System.in);
        // Input dari pengguna
        System.out.print("ModulJayJay.AnagramChecker\n");
        System.out.print("Masukkan inputan pertama: ");
        String stringA = scanner.nextLine();
        System.out.print("Masukkan inputan kedua: ");
        String stringB = scanner.nextLine();
        System.out.println("Dua inputan adalah anagram: "+isAnagram(stringA, stringB));
        scanner.close();
    }

    private static boolean isAnagram(String stringA, String stringB) {
        // Menghapus spasi dan mengubah ke huruf kecil
        stringA = stringA.replaceAll("\\s", "").toLowerCase();
        stringB = stringB.replaceAll("\\s", "").toLowerCase();

        // Jika panjang string tidak sama, bukan anagram
        if (stringA.length() != stringB.length()) {
            return false;
        }

        // Mengubah string menjadi array karakter dan mengurutkan
        char[] charArray1 = stringA.toCharArray();
        char[] charArray2 = stringB.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Membandingkan kedua array karakter
        return Arrays.equals(charArray1, charArray2);
    }
}
