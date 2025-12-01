import java.util.Scanner;

public class PengugnjungKafe21 {
    
    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("--- Daftar Pengunjung ---");
        
        // Cek jika tidak ada argumen yang diterima
        if (namaPengunjung.length == 0) {
            System.out.println("Tidak ada pengunjung.");
            return;
        }

        // Menggunakan for-each loop untuk menampilkan daftar
        int i = 1;
        for (String nama : namaPengunjung) {
            System.out.println(i + ". " + nama);
            i++;
        }
        System.out.println("Jumlah total pengunjung: " + namaPengunjung.length);
    }
    
    // Fungsi main() yang merupakan titik awal eksekusi program
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in); // Tidak digunakan, jadi bisa dihapus

        System.out.println("--- Pemanggilan 1 (3 argumen) ---");
        // Memanggil Varargs dengan 3 argumen
        daftarPengunjung("Ali", "Budi", "Citra");
        
        System.out.println("\n--- Pemanggilan 2 (1 argumen) ---");
        // Memanggil Varargs dengan 1 argumen
        daftarPengunjung("Andi");
        
        System.out.println("\n--- Pemanggilan 3 (4 argumen) ---");
        // Memanggil Varargs dengan 4 argumen
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
        
        System.out.println("\n--- Pemanggilan 4 (Tanpa argumen) ---");
        // Memanggil Varargs dengan 0 argumen
        daftarPengunjung(); 
    }
}