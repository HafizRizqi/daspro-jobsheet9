import java.util.Scanner;

public class ArrayRataNilai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jumlah mahasiswa : ");
        int jmlMhs = sc.nextInt();
        int[] nilaiMhs = new int[jmlMhs];
        double totalLulus = 0, totalTidakLulus = 0;
        double lulus = 0, tidakLulus = 0;

        for (int i = 0; i < jmlMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1)+ " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < jmlMhs; i++) {
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                lulus++;

            }else{
                totalTidakLulus += nilaiMhs[i];
                tidakLulus++;
            }
        }
        double rata2Lulus= lulus == 0 ? 0 : totalLulus/lulus;
        double rata2TidakLulus= tidakLulus == 0 ? 0 : totalTidakLulus/tidakLulus;
        System.out.println("Rata-rata nilai lulus = " +rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus = " +rata2TidakLulus);
    }
}