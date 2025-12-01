import java.util.Scanner;
public class StudiKaasus1 {
    Scanner sc= new Scanner(System.in);
    

    public static void isianArray(int[] nilai) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n=== Input Nilai Mahasiswa ===");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }
    }

    // Fungsi untuk menampilkan seluruh nilai yang telah diinputkan
    public static void tampilArray(int[] nilai) {
        System.out.println("\n=== Daftar Nilai Mahasiswa ===");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai Mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
        }
    }

    // Fungsi untuk menghitung dan mengembalikan total nilai seluruh mahasiswa
    public static int hitTot(int[] nilai) {
        int total = 0;
        for (int n : nilai) {
            total += n;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Membaca nilai N (jumlah mahasiswa) dari input pengguna
        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int N = sc.nextInt();

        // Membuat array dengan ukuran N
        int[] nilaiMahasiswa = new int[N];

        // Memanggil fungsi isianArray
        isianArray(nilaiMahasiswa);

        // Memanggil fungsi tampilArray
        tampilArray(nilaiMahasiswa);

        // Memanggil fungsi hitTot
        int totalNilai = hitTot(nilaiMahasiswa);

        // Menampilkan total nilai yang dikembalikan oleh fungsi hitTot
        System.out.println("\n==================================");
        System.out.println("Total nilai seluruh mahasiswa: " + totalNilai);
        
        double rataRata = (double) totalNilai / N;
        System.out.printf("Rata-rata nilai mahasiswa: %.2f\n", rataRata);
        System.out.println("==================================");

        sc.close();
    }
}
    

