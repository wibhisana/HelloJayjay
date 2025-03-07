package ModulJayJay;

public class ColorLoop {
    public static void main(String[] args) {
        String[] warna = {"hitam", "biru", "putih", "merah", "kuning"};

        System.out.println("Mencetak semua warna:");
        for (String w : warna) {
            System.out.println("Warna: " + w);
        }

        // 2. print exclude white
        System.out.println("\nMencetak warna selain 'putih':");
        for (String w : warna) {
            if (w.equals("putih")) {
                continue;
            }
            System.out.println("Warna: " + w);
        }
    }
}
