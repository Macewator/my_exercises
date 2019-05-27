package exercises.hospital;

public class Hospital {

    private Patient[] patients = new Patient[10];
    private int patientCount = 0;

    public void addPatient(Patient patient){
        if(patientCount<10) {
            patients[patientCount] = patient;
            patientCount++;
        }else {
            System.out.println("Brak wolnych miejsc");
        }
    }

    public void patiantsInfo(){
        for (Patient p: patients) {
            if (p!=null){
                System.out.println(p);
            }
        }
    }

}
