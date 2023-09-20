import java.util.Scanner;

public class pembelianbarang {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int total = 0;
            while (true) {
                System.out.println("Item yang tersedia:");
                System.out.println("1. buku tulis (Rp.2500)");
                System.out.println("2. penghapus (Rp.500)");
                System.out.println("3. checkout");
                System.out.print("Pilih item (1/2/3):");
                int pilih = scanner.nextInt();

                switch (pilih) {
                    case 1:
                        System.out.print("Berapa banyak? ");
                        int bukutulis = scanner.nextInt();
                        total += 2500 * bukutulis;
                        break;
                    case 2:
                        System.out.print("Berapa banyak? ");
                        int penghapus = scanner.nextInt();
                        total += 500 * penghapus;
                        break;
                    case 3:
                        System.out.println("Total pembayaran: Rp."+total);
                        return;
                    default:
                        System.out.println("Item tidak tersedia.");
                }
            }
        }
    }
}