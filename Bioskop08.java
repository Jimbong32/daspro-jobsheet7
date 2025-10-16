import java.util.Scanner;

public class Bioskop08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int hargaTiket = 50000;
        int jumlahTiket;
        double totalPendapatan = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (0 untuk berhenti): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid, ulangi!\n");
                continue;
            }

            double totalHarga = jumlahTiket * hargaTiket;
            double diskon = 0;

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            totalHarga -= totalHarga * diskon;
            System.out.println("Total harga: Rp " + totalHarga + "\n");

            totalPendapatan += totalHarga;
        }

        System.out.println("Total penjualan hari ini: Rp " + totalPendapatan);
        sc.close();
    }
}
