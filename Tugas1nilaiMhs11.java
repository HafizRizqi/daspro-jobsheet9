import java.util.Scanner;

public class Tugas1nilaiMhs11 {
    public static void main(String[] args) {
        Scanner sc11 = new Scanner(System.in);
        System.out.println("Masukkan banyaknya nilai mahasiswa yang ingin diinput: ");
        int banyakNilai = sc11.nextInt();
        int[] arrMhs = new int[banyakNilai];

        int totalNilai = 0;
        double rata2;
        for (int i = 0; i < banyakNilai; i++) {
            System.out.println("Masukkan nilai Mahasiswa ke-"+(i + 1) +": ");
            arrMhs[i]= sc11.nextInt();

        }
        int nilaiTertinggi = arrMhs[0];
        int nilaiTerendah = arrMhs[0];
        for (int nilai : arrMhs) {
            totalNilai += nilai;
        }
        rata2 = (double) totalNilai/banyakNilai;
        for (int nilai : arrMhs) {
            if (nilai > nilaiTertinggi) {
                nilaiTertinggi = nilai;
            } if (nilai < nilaiTerendah) {
                nilaiTerendah = nilai;

            }
        }
        for ( int i = 0; i < banyakNilai; i++) {
            System.out.println("Nilai mahasiswa ke-"+(i+1) + ": " + arrMhs[i]);
        }
        System.out.println("Banyaknya nilai Mahasiswa yang di input: " + banyakNilai);
        System.out.println("Rata-rata nilai setiap Mahasiswa: " + rata2);
        System.out.println("Nilai tertinggi mahasiswa: " + nilaiTertinggi);
        System.out.println("Nilai terendah mahasiswa: " + nilaiTerendah);

    }
}