import java.util.Scanner;

public class Parkir08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPembayaran = 0;

        while (true) {
            System.out.print("Masukkan jenis kendaraan (mobil/motor, ketik 0 untuk keluar): ");
            String jenis = sc.next();

            if (jenis.equals("0")) {
                break;
            }

            System.out.print("Masukkan durasi parkir (jam): ");
            int durasi = sc.nextInt();

            int tarif = 0;
            if (durasi > 5) {
                tarif = 12500;
            } else {
                if (jenis.equalsIgnoreCase("mobil")) {
                    tarif = durasi * 3000;
                } else if (jenis.equalsIgnoreCase("motor")) {
                    tarif = durasi * 2000;
                } else {
                    System.out.println("Jenis kendaraan tidak dikenal!\n");
                    continue;
                }
            }

            System.out.println("Total bayar: Rp " + tarif + "\n");
            totalPembayaran += tarif;
        }

        System.out.println("Total pembayaran seluruh kendaraan: Rp " + totalPembayaran);
        sc.close();
    }
}
