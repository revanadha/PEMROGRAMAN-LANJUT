import java.util.Scanner;

public class CODELAB2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Masukkan usia Anda: ");
            int usia = input.nextInt();
            cekUsia(usia);
            System.out.println("Usia valid: " + usia);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void cekUsia(int usia) throws InvalidAgeException {
        if (usia <= 0 || usia >= 120) {
            throw new InvalidAgeException("Usia harus lebih dari 0 dan kurang dari 120.");
        }
    }
}