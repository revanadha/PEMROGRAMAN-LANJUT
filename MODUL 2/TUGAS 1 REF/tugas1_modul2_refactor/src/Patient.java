public class Patient {
    private String name;
    private int recordNumber;
    private Doctor doctor;
    private String disease;

    // Constructor
    public Patient(String name, int recordNumber, Doctor doctor, String disease) {
        this.name = name;
        this.recordNumber = recordNumber;
        this.doctor = doctor;
        this.disease = disease;
    }

    // Method untuk print detail pasien
    public void printPatientDetails() {
        System.out.println("Nama pasien : " + name);
        System.out.println("Nomor rekam medis : " + recordNumber);
        System.out.println("Penyakit : " + disease);
        System.out.println("Dokter : " + doctor.getName());
    }

    // Method untuk update penyakit
    public void updateDisease(String newDisease) {
        this.disease = newDisease;
        System.out.println("Disease updated to : " + disease);
    }

    // Getter untuk name (kalau butuh)
    public String getName() {
        return name;
    }
}
