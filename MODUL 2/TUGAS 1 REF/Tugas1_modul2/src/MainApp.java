public class MainApp {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Dr. Tirta", 1999, 12000, "Cardiology");
        Patient patient = new Patient("Julian", 555, doctor, "Heart Break");

        Hospital hospital = new Hospital("RS UMM", "Jalanin aja dulu", patient);
        hospital.printHospitalDetails();

        System.out.println();
        doctor.applyBonus();
        doctor.printDetails();
    }
}
