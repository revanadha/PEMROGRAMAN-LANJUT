
/**
 * Refactoring: Move Method/Field.
 * Memindahkan logika pencetakan hasil ke kelas khusus.
 */
public class OutputPrinter {

    private final ITahunChecker checker; // Field yang di-move atau dikenalkan

    public OutputPrinter(ITahunChecker checker) {
        this.checker = checker;
    }

    // --- Refactoring: Introduce Parameter Object ---
    // Mengubah parameter dari (int tahun) menjadi (YearData data)
    public void printResult(YearData data) {
        int year = data.getYear();
        boolean result = checker.isLeapYear(year);

        if (result) {
            System.out.println(data.getLabel() + year + " adalah Tahun Kabisat.");
        } else if (year > 0) {
            System.out.println(data.getLabel() + year + " BUKAN Tahun Kabisat.");
        }
        // Jika year <= 0, pesan error sudah dicetak di TahunKabisatImpl
    }
}