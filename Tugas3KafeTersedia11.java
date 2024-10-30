import java.util.Scanner;

public class Tugas3KafeTersedia11 {
    public static void main(String[] args) {
        Scanner sc11 = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar",
        "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        System.out.println("Nama makanan yang ingin di cari: ");
        String key = sc11.nextLine();

        boolean ditemukan = false;
        for (String makanan : menu) {
            if (makanan.equalsIgnoreCase(key)) {
                ditemukan = true;
                break;
            }
        }
        if (ditemukan) {
            System.out.println("Makanan "+key+ " tersedia di menu. ");
        }else {
            System.out.println("Maaf,makanan " +key+ " tidak ada di menu. ");
        }
    }
}