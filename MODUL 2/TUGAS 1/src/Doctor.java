public class Doctor {
    private static final double BONUS_RATE = 0.08;
    private String name;
    private int id;
    private double salary;
    private String specialization;

    // constructor
    public Doctor(String name, int id, double salary, String specialization) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.specialization = specialization;
    }

    public void applyBonus() {
        double bonus = salary * BONUS_RATE;
        salary += bonus;
        System.out.println("YEAY Dapet Bonus! Total gaji: " + salary);
    }

    public void printDetails() {
        System.out.println("Doctor ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Specialization : " + specialization);
        System.out.println("Gaji : " + salary);
    }

    public void updateSpecialization(String newSpecialization) {
        specialization = newSpecialization;
        System.out.println("Specialization updated to : " + specialization);
    }

    public String getName() {
        return name;
    }
}
