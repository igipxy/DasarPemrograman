package Meeting14;

public class HitungBalok10 {
    public class programku {
    public static void TampilHinggakei (int i) { // Fungsi 1: Mencetak angka 1 sampai i
        for (int j=1; j<=i; j++) {
            System.out.print(j);
        }
    }
    public static int Jumlah (int bil1, int bil2) { // Fungsi 2: Menghitung jumlah
        return (bil1 + bil2);
    }
    public static void TampilJumlah (int bil1, int bil2) { // Fungsi 3: Memanggil Fungsi 1 dan 2
        TampilHinggaKei (Jumlah (bil1, bil2));
    }
    public static void main(String[] args) { // Fungsi Utama
        int temp = Jumlah (1, 1);
        TampilJumlah(temp, 5);
    }
}
}
