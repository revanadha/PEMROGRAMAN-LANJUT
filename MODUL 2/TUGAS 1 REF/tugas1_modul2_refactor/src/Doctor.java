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

    // 2. Extract Method: calculateBonus
    public double calculateBonus() {
        return salary * BONUS_RATE;
    }

    // 3. Inline Variable: tidak ada lagi variable 'bonus' lokal,
    //    langsung tambahkan hasil calculateBonus() ke salary
    public void applyBonus() {
        salary += calculateBonus();
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

    // 1. Getter untuk name (Encapsulate Field)
    public String getName() {
        return name;
    }

    // (opsional) getter lain jika diperlukan
    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public String getSpecialization() {
        return specialization;
    }
}
