import java.util.Scanner;
public class Kafe21 {

   

        // Percobaan 1: Membuat Fungsi Tanpa Parameter
public class Kafe {

    // Fungsi Menu() tanpa parameter dan bertipe void
    public static void Menu() {
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam\t\tRp 15,000"); //
        System.out.println("2. Cappuccino\t\tRp 20,000"); //
        System.out.println("3. Latte\t\tRp 22,000");     //
        System.out.println("4. Teh Tarik\t\tRp 12,000"); //
        System.out.println("5. Roti Bakar\t\tRp 10,000"); //
        System.out.println("6. Mie Goreng\t\tRp 18,000"); //
        System.out.println("===========================");
        System.out.println("Silakan pilih menu yang Anda inginkan."); //
    }

    public static void main(String[] args) {
        // Memanggil fungsi Menu()
        Menu();
        Scanner input = new Scanner(System.in);
        
  
        Menu();
    
        System.out.print("Silakan pilih menu (1-6): ");
        int pilihan = input.nextInt();
    
        System.out.println("Anda memilih menu nomor: " + pilihan);

        input.close();
    
    }
}
    }
