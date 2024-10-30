import java.util.Scanner;

public class Tugas2Kafe11 {
    public static void main(String[] args) {
        Scanner sc11 = new Scanner(System.in);

        System.out.println("Masukkan jumlah yang ingin di pesan: ");
        int jmlPesanan = sc11.nextInt();
        sc11.nextLine();
        
        String[] namaPesanan = new String[jmlPesanan];
        double[] hargaPesanan = new double[jmlPesanan];

        for(int i = 0; i < jmlPesanan; i++) {
            System.out.println("Masukkan nama pesanan ke- "+(i+1) + ": ");
            namaPesanan[i] = sc11.nextLine();

            System.out.println("Masukkan Harga Untuk pesanan " + namaPesanan[i] + ": ");
            hargaPesanan[i] = sc11.nextDouble();
            sc11.nextLine();
        }
        double totalBiaya = 0;
        for (double harga : hargaPesanan) {
            totalBiaya += harga;
        }
        for (int i = 0; i < jmlPesanan; i++) {
            System.out.println("Daftar Pesanan: " +(i+1) + ". " + namaPesanan[i] + " - Rp "+hargaPesanan[i]);
        }
        System.out.println("Total biayanya: Rp " + totalBiaya);
    }
}