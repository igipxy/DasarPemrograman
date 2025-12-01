Answer !

2.1

1. tidak harus void karena parameter tidak hanya void
2. benar, daftar menu dapat ditampilkan tanpa menggunakan fungsi Menu()
3. Kode di dalam fungsi Menu() dapat dipanggil berkali-kali dari berbagai tempat dalam program tanpa harus menulis ulang baris kode yang sama
4. Program Dimulai Eksekusi program Java selalu dimulai dari baris pertama di dalam fungsi main(String[] args). Pemanggilan Fungsi Program mencapai baris kode Menu(); di dalam main(). Lompatan Eksekusi Kontrol eksekusi program melompat keluar dari main() ke baris pertama di dalam definisi fungsi public static void Menu(). Eksekusi Fungsi Menu() Semua perintah di dalam fungsi Menu() (yaitu serangkaian System.out.println) dijalankan secara berurutan, yang menghasilkan tampilan daftar menu di layar.

2.2 Percobaan 2: Membuat Fungsi Dengan Parameter
1. Apakah kegunaan parameter di dalam fungsi?
Kegunaan utama parameter di dalam fungsi adalah untuk mengizinkan fungsi menerima data dari luar (dari fungsi pemanggil) untuk diproses di dalamnya.

Parameter berfungsi sebagai variabel lokal di dalam fungsi yang nilainya diinisialisasi oleh argumen yang dikirim saat fungsi dipanggil.

Ini membuat fungsi menjadi lebih fleksibel dan generik karena dapat beroperasi pada data yang berbeda setiap kali dipanggil, menghasilkan hasil yang berbeda tanpa harus mengubah kode internal fungsi.

2. Jelaskan mengapa pada percobaan ini fungsi Menu() menggunakan parameter namaPelanggan dan isMember?
Fungsi Menu() menggunakan parameter namaPelanggan bertipe String dan isMember bertipe boolean

3.  Parameter serupa dengan variabel tetapi memiliki perbedaan mendasar dalam konteks, parameter Dideklarasikan di dalam tanda kurung pada definisi fungsi/metode. variabel Dideklarasikan di mana saja di dalam blok kode (seperti di dalam main() atau di dalam badan fungsi).

4. Parameter isMember adalah variabel lokal bertipe boolean di dalam fungsi Menu(). Saat fungsi Menu() dipanggil, nilai true atau false dari argumen yang diberikan akan disalin ke variabel isMember. Di dalam fungsi Menu(), terdapat struktur kontrol if (isMember). Struktur if ini akan mengeksekusi blok kode di dalamnya hanya jika nilai isMember adalah true

5. Jika kita memanggil fungsi Menu() tanpa menyertakan argumen untuk parameter namaPelanggan dan isMember, program akan mengalami kesalahan kompilasi Compile-time Error

6. done

7. Menu("Budi", true, "DISKON30");

8. Ya, penggunaan parameter namaPelanggan dan isMember membuat program jauh lebih mudah dibaca dan dikembangkan, karenaketerbacaan (Readability): Ketika melihat pemanggilan Menu("Budi", true, "DISKON30");, kita langsung tahu siapa yang dilayani, status membernya, dan promo apa yang digunakan, tanpa harus melihat detail kode di dalam fungsi Menu().

2.3

1. Fungsi Membutuhkan Nilai Kembalian (Bertipe selain void), Ketika tujuan utama fungsi adalah untuk menghitung, memproses, atau mengambil suatu nilai, dan nilai hasil proses tersebut dibutuhkan oleh fungsi pemanggil untuk digunakan dalam operasi atau perhitungan selanjutnya.

2. komponen fungsi = Nilai Kembalian
tipe data = int
konteks = Nilai total harga pesanan (dalam Rupiah) yang akan dikirim kembali ke fungsi pemanggil.

komponen fungsi = Parameter 1 (pilihanMenu)	
data tipe = int
Konteks = Nomor urut menu yang dipilih pengguna (1 untuk Kopi Hitam, 2 untuk Cappuccino, dst.).

komponen fungsi = Parameter 2 (banyakItem)	
data tipe = int
konteks = Jumlah porsi atau kuantitas dari menu yang dipesan.

3. done

4. done

2.4

1. Penulisan String... namaPengunjung menggunakan fitur Java yang disebut Varargs (Variable Arguments). Tujuan: Untuk memungkinkan fungsi menerima nol atau lebih argumen (input) dari tipe data yang sama (String)

2. done

3. Tidak, kita tidak bisa menggunakan dua parameter varargs dalam satu fungsi misalnya String dan int

4. Jika fungsi daftarPengunjung dipanggil tanpa argumen, yaitu daftarPengunjung(); : Program akan tetap berjalan (tidak error). Varargs dirancang untuk menerima nol atau lebih argumen. Ketika dipanggil tanpa argumen, Java akan membuat array namaPengunjung dengan panjang nol (namaPengunjung.length adalah 0).