public class TahunKabisatChecker {

    // Logika utama kabisat dan output digabungkan di satu tempat.
    public boolean cekApakahKabisat(int t) {
        if (t <= 0) {
            System.err.println("Input tahun tidak valid.");
            return false;
        }

        // Variabel ini hanya digunakan sekali, bisa di-inline
        boolean c1 = t % 4 == 0;
        boolean c2 = t % 100 == 0;
        boolean c3 = t % 400 == 0;

        boolean hasil = (c1 && !c2) || c3;
        return hasil;
    }

    public void cetakHasil(int tahun) {
        boolean r = cekApakahKabisat(tahun);
        if (r) {
            System.out.println(tahun + " adalah Tahun Kabisat.");
        } else {
            System.out.println(tahun + " BUKAN Tahun Kabisat.");
        }
    }

    public static void main(String[] args) {
        TahunKabisatChecker checker = new TahunKabisatChecker();
        checker.cetakHasil(2000);
        checker.cetakHasil(2024);
        checker.cetakHasil(1900);
    }
}