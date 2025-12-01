package Meeting14;

import java.util.Scanner;

public class NilaiMahasisswa10 {
    static Scanner sc = new Scanner(System.in); 

    public static int[] isianArray(int N) {
        int[] nilaiMahasiswa = new int[N];
        System.out.println("--- Input Nilai Mahasiswa ---");
        for (int i = 0; i < N; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = sc.nextInt();
        }
        return nilaiMahasiswa;
    }

    public static void tampilArray(int[] arrNilai) {
        System.out.println("\n--- Daftar Nilai Mahasiswa ---");
        for (int i = 0; i < arrNilai.length; i++) {
            System.out.println("Nilai Mahasiswa ke-" + (i + 1) + ": " + arrNilai[i]);
        }
    }

    public static double hitTot(int[] arrNilai) {
        double total = 0; // Menggunakan double untuk total
        for (int nilai : arrNilai) {
            total += nilai;
        }
        return total;
    }

    public static void main(String[] args) {
        // 1. Membaca nilai N (jumlah mahasiswa)
        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int N = sc.nextInt();

        // 2. Membuat array dengan ukuran N (sudah dilakukan di isianArray)
        
        // 3. Memanggil fungsi isianArray
        int[] nilaiMhs = isianArray(N);

        // 4. Memanggil fungsi tampilArray
        tampilArray(nilaiMhs);

        // 5. Memanggil fungsi hitTot dan menyimpan nilai kembalian
        double totalNilai = hitTot(nilaiMhs);

        // 6. Menampilkan total nilai
        System.out.println("\n=============================");
        System.out.println("Total Nilai Seluruh Mahasiswa: " + totalNilai);
        
        // Bonus: Tampilkan rata-rata
        if (N > 0) {
            double rataRata = totalNilai / N;
            System.out.println("Rata-rata Nilai: " + rataRata);
        }
        System.out.println("=============================");
        
        sc.close();
    }
}
