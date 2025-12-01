import java.util.Scanner;

public class ModifikasiKafe21 {

    // Fungsi Menu() (Harus ada agar dipanggil di main() berhasil)
    public static void Menu() {
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam\t\tRp 15,000");
        System.out.println("2. Cappuccino\t\tRp 20,000");
        System.out.println("3. Latte\t\tRp 22,000");
        System.out.println("4. Teh Tarik\t\tRp 12,000");
        System.out.println("5. Roti Bakar\t\tRp 10,000");
        System.out.println("6. Mie Goreng\t\tRp 18,000");
        System.out.println("===========================");
    }
    
    
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        
        int hargaSatuan = 0; 
        
        // Tentukan harga satuan berdasarkan pilihan menu
        switch (pilihanMenu) {
            case 1: hargaSatuan = 15000; break;
            case 2: hargaSatuan = 20000; break;
            case 3: hargaSatuan = 22000; break;
            case 4: hargaSatuan = 12000; break;
            case 5: hargaSatuan = 10000; break;
            case 6: hargaSatuan = 18000; break;
            default:
                System.out.println("Pilihan menu tidak ditemukan. Pesanan ini dibatalkan.");
                return 0; // Mengembalikan 0 jika pilihan tidak valid
        }

        // 1. Hitung total harga awal
        int totalHarga = hargaSatuan * banyakItem;
        double diskon = 0;
        
        // 2. Terapkan logika kodePromo (Jika Anda ingin diskon berlaku per item yang dipesan)
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            diskon = totalHarga * 0.50;
            System.out.println("Diskon 50% diterapkan pada item ini! Jumlah diskon: Rp " + (int)diskon);
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            diskon = totalHarga * 0.30;
            System.out.println("Diskon 30% diterapkan pada item ini! Jumlah diskon: Rp " + (int)diskon);
        } else if (!kodePromo.isEmpty()){
            System.out.println("Kode promo '" + kodePromo + "' invalid. Tidak ada diskon untuk item ini.");
        }
        
        // 3. Hitung total harga akhir
        int totalHargaAkhir = totalHarga - (int)diskon;
        
        return totalHargaAkhir;
    } // Penutup fungsi hitungTotalHarga

    // Fungsi utama (main) tempat eksekusi program dimulai
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalKeseluruhan = 0; 
        int pilihan = -1; 
        
        // **KESALAHAN SINTAKSIS DIPERBAIKI:** Deklarasi variabel yang salah 'iny hitungTotalHargaNoAbsen' dihapus.
        // **FUNGSI DIPERBAIKI:** Nama fungsi yang dipanggil harus sesuai dengan yang didefinisikan (hitungTotalHarga).

        System.out.println("=== Sistem Pemesanan Kafe Multi-Menu ===");
        
        // Loop untuk memungkinkan pemesanan berulang
        while (pilihan != 0) {
            Menu(); // Tampilkan menu

            System.out.print("Pilih menu (1-6) atau 0 untuk Selesai/Bayar: ");
            
            // Periksa apakah input berikutnya adalah integer
            if (input.hasNextInt()) {
                pilihan = input.nextInt();
            } else {
                System.out.println("Input tidak valid. Silakan masukkan angka.");
                input.next(); // Bersihkan input yang salah
                continue;
            }
            
            if (pilihan >= 1 && pilihan <= 6) {
                System.out.print("Masukkan jumlah pesanan: ");
                int jumlah = input.nextInt();
                
                // Minta kode promo untuk item ini (Jika Anda ingin promo berlaku per item)
                System.out.print("Masukkan kode promo item (Tekan Enter jika tidak ada): ");
                input.nextLine(); // Membersihkan buffer
                String promo = input.nextLine(); 
                
                // Hitung subtotal pesanan saat ini menggunakan fungsi yang benar
                int subTotalItem = hitungTotalHarga(pilihan, jumlah, promo); 
                
                // Tambahkan ke total keseluruhan
                totalKeseluruhan += subTotalItem; 
                
                System.out.println("Subtotal pesanan ini: Rp " + subTotalItem);
                System.out.println("Total sementara: Rp " + totalKeseluruhan);
                System.out.println("----------------------------------------");

            } else if (pilihan != 0) {
                System.out.println("Pilihan menu tidak valid.");
            }
        } // Akhir dari while loop

        System.out.println("\n*** PEMBAYARAN ***");
        System.out.println("Total keseluruhan pesanan Anda adalah: **Rp " + totalKeseluruhan + "**");
        
        // *** CATATAN: Jika Anda ingin menerapkan diskon total di akhir, logikanya harus ditambahkan di sini. ***
        
        System.out.println("Terima kasih telah berbelanja!");
        input.close();
    } // Penutup fungsi main
} 