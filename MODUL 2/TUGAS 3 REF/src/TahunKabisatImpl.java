/**
 * Implementasi konkret dari ITahunChecker.
 */
public class TahunKabisatImpl implements ITahunChecker {

    // --- Refactoring: Extract Method ---
    // Memecah logika menjadi metode yang lebih kecil
    private boolean isDivisibleBy4(int year) {
        return year % 4 == 0;
    }

    private boolean isDivisibleBy100(int year) {
        return year % 100 == 0;
    }

    private boolean isDivisibleBy400(int year) {
        return year % 400 == 0;
    }

    // --- Refactoring: Rename Method & Variable ---
    @Override
    public boolean isLeapYear(int year) { // Rename Method: t -> year
        if (year <= 0) {
            System.err.println("Input tahun tidak valid.");
            return false;
        }

        // --- Refactoring: Inline Variable ---
        // Menggabungkan variabel c1, c2, c3, dan hasil yang sebelumnya hanya digunakan sekali.
        return (isDivisibleBy4(year) && !isDivisibleBy100(year)) || isDivisibleBy400(year);
    }
}