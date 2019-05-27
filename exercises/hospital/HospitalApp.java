package exercises.hospital;

import java.util.Scanner;

public class HospitalApp {

    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Scanner scanner = new Scanner(System.in);

        hospitalControl(hospital,scanner);

    }

    private static void options(){
        System.out.println("0 - wyjsćie z programu");
        System.out.println("1 - dopisanie pacjenta");
        System.out.println("2 - Wyświetlenie listy pacjentów");
    }

    public static Patient cretePatient(Scanner scanner){
        Patient patient = new Patient();
        patient.setFirstName(scanner.nextLine());
        patient.setLastName(scanner.nextLine());
        patient.setPesel(scanner.nextLine());
        return patient;
    }

    public static void hospitalControl(Hospital hospital, Scanner scanner){
        int option =-1;
        while (option!= 0){
            options();
            option = scanner.nextInt();
            scanner.nextLine();
            if (option == 1){
                hospital.addPatient(cretePatient(scanner));
            }else if(option == 2){
                hospital.patiantsInfo();
            }
        }
    }
}
