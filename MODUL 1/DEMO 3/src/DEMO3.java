import java.util.Scanner;

public class DEMO3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input nama mahasiswa
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = input.nextLine();

        // Input nilai ujian akhir
        System.out.print("Masukkan nilai ujian akhir: ");
        int nilai = input.nextInt();

        // Menentukan status kelulusan
        String status;
        if (nilai >= 60) {
            status = "Lulus";
        } else {
            status = "Tidak Lulus";
        }

        // Output hasil
        System.out.println("\n=== HASIL KELULUSAN ===");
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Nilai Akhir    : " + nilai);
        System.out.println("Status         : " + status);

        input.close();
    }
}
