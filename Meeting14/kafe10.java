package Meeting14;

import java.util.Scanner;

public class kafe10 {
    // Definisikan fungsi hitungTotalHarga yang sudah dimodifikasi (atau versi aslinya) di sini
    public static int hitungTotalHarga (int pilihanMenu, int banyakItem) { 
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }
    
    // Definisikan fungsi Menu() di sini
    public static void Menu() {
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam           Rp 15,000");
        System.out.println("2. Cappuccino           Rp 20,000");
        // ... menu lainnya
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu(); // Tampilkan menu

        int totalKeseluruhan = 0;
        boolean pesanLagi = true;

        while (pesanLagi) { // Loop untuk pesanan berganda
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();

            // Panggil fungsi untuk menghitung harga item saat ini
            int totalHargaItem = hitungTotalHarga(pilihanMenu, banyakItem);
            
            // Tambahkan ke total keseluruhan
            totalKeseluruhan += totalHargaItem; 
            
            System.out.println("Total harga untuk pesanan ini: Rp" + totalHargaItem);

            System.out.print("Pesan menu lain? (y/n): ");
            char pilihan = sc.next().charAt(0);
            if (pilihan == 'n' || pilihan == 'N') {
                pesanLagi = false;
            }
        }

        System.out.println("==================================");
        System.out.println("Total keseluruhan pesanan Anda: Rp" + totalKeseluruhan);
        System.out.println("==================================");

        sc.close();
        sc.close();
    }
}
