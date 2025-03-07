package ModulJayJay;

public class CarBrands {
    public static void main(String[] args) {
        // Deklarasi dan inisialisasi array merek mobil
        String[] carBrands = {"Mitsubishi", "Tesla", "Honda", "Nissan", "Kia", "Hyundai"};

        // Mencetak daftar merek mobil
        System.out.println("Daftar Merek Mobil:");
        for (String brand : carBrands) {
            System.out.println(brand);
        }
    }
}
