/**
 * Refactoring: Introduce Parameter Object.
 * Menggabungkan data tahun dan label ke dalam satu objek.
 */
public class YearData {
    private final int year;
    private final String label;

    public YearData(int year, String label) {
        this.year = year;
        this.label = label;
    }

    public int getYear() { return year; }
    public String getLabel() { return label; }
}