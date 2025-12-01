package Meeting14;

public class PengunjungCafe10 {
    static void daftarPengunjung (String... namaPengunjung) {
    System.out.println("Daftar Nama Pengunjung:");
    
    // Modifikasi: Menggunakan for-each loop
    for(String nama : namaPengunjung) {
        System.out.println("-" + nama);
    }
}

}
