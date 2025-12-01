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

2.5

1.
-Mulai Program: Eksekusi dimulai dari baris pertama di dalam fungsi main(String[] args).
-Inisialisasi: Objek Scanner dibuat, dan variabel-variabel (p, l, t, L, vol) dideklarasikan.
-Input Panjang dan Lebar: Program meminta dan membaca input untuk panjang (p) dan lebar (l) dari pengguna .
-Input Tinggi: Program meminta dan membaca input untuk tinggi (t) dari pengguna.
-Hitung Luas: Program memanggil fungsi hitungLuas(p, l).
-Kontrol lompat ke hitungLuas, yang menghitung Luas = pjg * lb.
-Fungsi hitungLuas mengembalikan nilai Luas.
-Nilai kembalian disimpan ke variabel L di main().
-Tampil Luas: Program mencetak hasil L (Luas Persegi Panjang) ke layar.
-Hitung Volume: Program memanggil fungsi hitungVolume(t, p, l)
-Kontrol lompat ke hitungVolume.
-Di dalam hitungVolume, fungsi hitungLuas(a, b) dipanggil kembali.
-Nilai Luas (hasil hitungLuas) dikalikan dengan tinggi untuk mendapatkan volume.
-Fungsi hitungVolume mengembalikan nilai volume.
-Nilai kembalian disimpan ke variabel vol di main().
-Tampil Volume: Program mencetak hasil vol (Volume Balok) ke layar.
-Selesai: Program menutup input dan selesai

2. 
 1. main() dimulai, input dibaca: p=4, l=3, t=582828282.
 2. Panggil hitungLuas(4, 3):Fungsi hitungLuas menghitung: 4 * 3 = 12. Nilai 12 dikembalikan ke main(), sehingga L = 1284.Output: Luas Persegi Panjang adalah 1285.
 3. Panggil hitungVolume(5, 4, 3):Fungsi hitungVolume memanggil hitungLuas(4, 3) lagi86.hitungLuas mengembalikan 12.hitungVolume menghitung: volume = 12 * 5 = 60.Nilai 60 dikembalikan ke main(), sehingga vol = 6088.Output: Volume Balok adalah 6089.

3. output = 1234567
 1. Alur Jalannya Program:main() dimulai.
 2. int temp = Jumlah(1, 1);90:Fungsi Jumlah(1, 1) dipanggil9191.Fungsi Jumlah mengembalikan hasil penjumlahan $1 + 1 = 2$9292.Variabel temp di main() sekarang bernilai 293.
 3. TampilJumlah(temp, 5); (yaitu TampilJumlah(2, 5))94:Fungsi TampilJumlah dipanggil dengan argumen 2 dan 595.Di dalam TampilJumlah, terdapat pemanggilan bertingkat: TampilHinggaKe i(Jumlah(bil1, bil2))96.Pertama, Jumlah(2, 5) dipanggil:Fungsi Jumlah mengembalikan hasil penjumlahan 2 + 5 =7 .Kedua, TampilHinggaKe i(7) dipanggil98.Fungsi TampilHinggaKe i menjalankan perulangan (for) dari j=1 sampai j <= 7.Setiap nilai j (1, 2, 3, 4, 5, 6, 7) dicetak tanpa baris baru (System.out.print)100.
 4. Output muncul: 1234567.
 5. Fungsi TampilJumlah selesai, fungsi main selesai.

4. pakai parameter Ketika fungsi membutuhkan data eksternal (nilai yang berasal dari luar fungsi, seperti input pengguna atau hasil perhitungan lain) untuk melakukan tugasnya. Ini membuat fungsi menjadi fleksibel dan dapat digunakan kembali dengan data yang berbeda

pakai kembalian ketika Harus memiliki nilai kembalian (tipe non-void): Ketika fungsi diandalkan untuk menghitung atau menghasilkan suatu nilai yang akan digunakan lebih lanjut oleh fungsi pemanggil (misalnya, sebagai input untuk fungsi lain, disimpan dalam variabel, atau ditampilkan sebagai hasil)

5. Fungsi hitungLuas(int pjg, int lb): Sebaiknya menggunakan parameter (pjg dan lb).
Alasan: Luas persegi panjang dihitung berdasarkan nilai panjang dan lebar yang berubah-ubah. Jika tidak ada parameter, fungsi harus diubah setiap kali kita ingin menghitung luas dengan panjang/lebar yang berbeda, atau nilai tersebut harus hardcoded. Dengan parameter, fungsi bersifat generik dan dapat menghitung luas objek apa pun yang memiliki panjang dan lebar yang berbeda-beda.


Fungsi hitungVolume(int tinggi, int a, int b): Sebaiknya menggunakan parameter (tinggi, a, b).
Alasan: Volume balok dihitung berdasarkan tinggi dan luas alas (yang merupakan hasil kali a dan b). Sama seperti hitungLuas, nilai-nilai ini berubah-ubah. Parameter memungkinkan fungsi ini menghitung volume untuk balok dengan dimensi yang berbeda-beda setiap kali dipanggil.

6. Fungsi main(): Tidak perlu memiliki nilai kembalian (selalu bertipe void).
Alasan: Fungsi main() adalah titik awal eksekusi program. Tujuan utamanya adalah mengatur dan menjalankan seluruh program. Ia tidak dipanggil oleh fungsi lain yang membutuhkan nilai balik.

Fungsi hitungLuas: Sebaiknya memiliki nilai kembalian (bertipe int).
Alasan: Tujuan utama fungsi ini adalah untuk menghitung hasil (luas). Nilai hasil ini (Luas) dibutuhkan oleh fungsi main() untuk ditampilkan dan oleh fungsi hitungVolume untuk perhitungan lebih lanjut.

Fungsi hitungVolume: Sebaiknya memiliki nilai kembalian (bertipe int).
Alasan: Mirip dengan hitungLuas, tujuan utama fungsi ini adalah menghitung hasil (volume). Nilai hasil ini (volume) dibutuhkan oleh fungsi main() untuk ditampilkan sebagai hasil akhir program