/**
 * Refactoring: Extract Interface.
 * Mendefinisikan kontrak untuk pengecekan tahun.
 */
public interface ITahunChecker {
    // Refactoring: Rename Method (dari 'cekApakahKabisat' menjadi 'isLeapYear')
    boolean isLeapYear(int year);
}