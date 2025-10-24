import java.util.Scanner;

// Custom Exception
class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}

public class DEMO2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan sebuah angka positif: ");
            int angka = scanner.nextInt();

            if (angka <= 0) {
                throw new InvalidNumberException("Error: Angka harus positif!");
            }

            System.out.println("Angka valid: " + angka);

        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}