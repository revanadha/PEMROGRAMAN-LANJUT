
import java.util.Scanner; // Import Scanner untuk input user
public class TahunKabisatChecker {

    // Logika utama kabisat dan penanganan input <= 0
    public boolean cekApakahKabisat(int t) {
        // Pengecekan input
        if (t <= 0) {
            System.err.println("Input tahun tidak valid.");
            return false;
        }

        // Variabel yang namanya kurang jelas (c1, c2, c3)
        boolean c1 = t % 4 == 0;
        boolean c2 = t % 100 == 0;
        boolean c3 = t % 400 == 0;

        // Variabel 'hasil' yang bisa langsung di-inline
        boolean hasil = (c1 && !c2) || c3;
        return hasil;
    }

    // Metode yang mencetak hasil, masih berhubungan erat dengan cekApakahKabisat
    public void cetakHasil(int tahun) {
        boolean r = cekApakahKabisat(tahun);
        if (r) {
            System.out.println(tahun + " adalah Tahun Kabisat.");
        } else {
            // Pengecekan 'else' yang tidak membedakan antara tahun > 0 atau tahun <= 0
            if (tahun > 0) {
                System.out.println(tahun + " BUKAN Tahun Kabisat.");
            }
            // Pesan error untuk tahun <= 0 sudah dicetak di cekApakahKabisat
        }
    }

    public static void main(String[] args) {
        TahunKabisatChecker checker = new TahunKabisatChecker();
        Scanner scanner = new Scanner(System.in); // Inisialisasi Scanner

        System.out.println("--- Pengecek Tahun Kabisat (Kode Belum Refactoring) ---");
        System.out.print("Masukkan tahun yang ingin Anda cek: ");

        // Membaca input dari user
        if (scanner.hasNextInt()) {
            int inputTahun = scanner.nextInt();

            // Menggunakan metode yang belum di-refactor
            checker.cetakHasil(inputTahun);

        } else {
            System.err.println("Input tidak valid. Harap masukkan bilangan bulat.");
        }

        scanner.close(); // Tutup scanner
    }
}