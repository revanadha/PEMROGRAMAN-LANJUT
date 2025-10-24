import java.util.Scanner;
public class MainApp {

    public static void main(String[] args) {
        // Inisialisasi Scanner untuk membaca input dari konsol
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Pengecek Tahun Kabisat ===");
        System.out.print("Masukkan tahun yang ingin Anda cek: ");

        // Membaca input tahun dari user
        if (scanner.hasNextInt()) {
            int inputYear = scanner.nextInt();

            // Menggunakan interface dan kelas yang sudah di-refactor
            ITahunChecker checker = new TahunKabisatImpl();
            OutputPrinter printer = new OutputPrinter(checker);

            // Membuat objek YearData dari input user
            YearData userData = new YearData(inputYear, "Hasil: ");

            // Mencetak hasilnya
            printer.printResult(userData);

        } else {
            System.err.println("Input tidak valid. Harap masukkan bilangan bulat (tahun).");
        }

        // Tutup scanner setelah selesai
        scanner.close();
    }
}