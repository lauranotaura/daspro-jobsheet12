import java.util.Scanner;
public class ModifikasiKafe21 {
  
    // Fungsi Menu() dengan parameter
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("=====================================");
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        // Cek status member
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        // Cek kode promo 
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("🎉Kode promo 'DISKON50' berhasil diterapkan! Anda mendapat diskon 50%!");
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println(" Kode promo 'DISKON30' berhasil diterapkan! Anda mendapat diskon 30%!");
        } else if (!kodePromo.isEmpty()){
            System.out.println("Kode promo '" + kodePromo + "' invalid.");
        }

        System.out.println("\n===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam\t\tRp 15,000");
        System.out.println("2. Cappuccino\t\tRp 20,000");
        System.out.println("3. Latte\t\tRp 22,000");
        System.out.println("4. Teh Tarik\t\tRp 12,000");
        System.out.println("5. Roti Bakar\t\tRp 10,000");
        System.out.println("6. Mie Goreng\t\tRp 18,000");
        System.out.println("===========================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }

    public static void main(String[] args) {
       
        System.out.println("--- Pelanggan Andi (Member, Tanpa Promo) ---");
        Menu("Andi", true, "");

        System.out.println("\n--- Pelanggan Budi (Member, DISKON30) ---");
        
        Menu("Budi", true, "DISKON30");
    }
}




    

