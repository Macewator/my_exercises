package exercises.telephon_book;

import java.io.*;
import java.util.*;

public class TeleBookController {

    private static final String DATA_FILE = "telebook.csv";

    private Scanner scanner;
    private TeleBook teleBook;

    public TeleBookController() {
        scanner = new Scanner(System.in);
        teleBook = new TeleBook();
        loadDataFromFIle();
    }

    public void teleBookLoopControl(){
        OPTION option  = null;
        do {
            printOptions();
            try {
                option = chooseOption();
                executeOption(option);
            }catch (InputMismatchException e){
                System.out.println("zły format danych");
                scanner.nextLine();
            }catch (NoSuchElementException e){
                System.out.println(e.getMessage());
            }catch (IOException e){
                e.printStackTrace();
            }
        }while (option != OPTION.CLOSE);
    }

    private void executeOption(OPTION option)throws IOException{
        switch (option) {
            case ADD_CONTACT:
                addContactToTeleBook();
                break;
            case SEARCH_BY_CHAR:
                searchByAlphabetChar();
                break;
            case SEARCH_BY_NAME:
                searchContactByNamePart();
                break;
            case SEARCH_BY_TEL:
                searchContactByNumberPart();
                break;
            case DELETE:
                deleteContactFromTeleBook();
                break;
            case CLOSE:
                close();
                break;
        }
    }

    private void close() throws IOException{
        saveDataToFile();
        scanner.close();
        System.out.println("Program zamknięty");
    }

    public OPTION chooseOption(){
        System.out.println("Wybierz numer");
        int option = scanner.nextInt();
        scanner.nextLine();
        return OPTION.convertToOption(option);
    }

    public void printOptions(){
        System.out.println("Opcje>>>");
        for (OPTION option: OPTION.values()){
            System.out.println(option);
        }
    }

    public void addContactToTeleBook(){
        System.out.println("Podaj nazwe kontaktu");
        String contactName = scanner.nextLine();
        System.out.println("Podaj numer telefonu");
        String contactNumber = scanner.nextLine();
        boolean add = teleBook.addContactToTeleBook(contactName,contactNumber);
        if (add) {
            System.out.println("Rekord dodany.");
        } else {
            System.out.println("Nie można dodać rekordu. Wpis o takiej nazwie już istnieje.");
        }
    }

    public void searchByAlphabetChar(){
        System.out.println("Podaj litere alfabetu");
        char letter = scanner.next().charAt(0);
        Set<Contact> contacts = teleBook.searchByAlphabetChar(letter);
        if(contacts.isEmpty()) {
            System.out.println("Brak wyników.");
        } else {
            System.out.println("Znalezione rekordy:");
            contacts.forEach(System.out::println);
        }
    }

    public void searchContactByNamePart(){
        System.out.println("Podaj fragment nazwy kontaktu");
        String contactNamePart = scanner.nextLine();
        Set<Contact> contacts = teleBook.searchContactByNamePart(contactNamePart);
        if(contacts.isEmpty()) {
            System.out.println("Brak wyników.");
        } else {
            System.out.println("Znalezione rekordy:");
            contacts.forEach(System.out::println);
        }
    }

    public void searchContactByNumberPart(){
        System.out.println("Podaj fragment numeru kontaktu");
        String contactNumberPart = scanner.nextLine();
        Set<Contact> contacts = teleBook.searchContactByNumberPart(contactNumberPart);
        if(contacts.isEmpty()) {
            System.out.println("Brak wyników.");
        } else {
            System.out.println("Znalezione rekordy:");
            contacts.forEach(System.out::println);
        }
    }

    public void deleteContactFromTeleBook(){
        System.out.println("Podaj nazwe kontaktu");
        String contactName = scanner.nextLine();
        boolean delete = teleBook.deleteContactFromTeleBook(contactName);
        if (delete) {
            System.out.println("Rekord usunięty.");
        } else {
            System.out.println("Nie można usunąć rekordu. Wpis o takiej nazwie nie istnieje.");
        }
    }

    public void saveDataToFile()throws IOException{
        try (
               BufferedWriter bw = new BufferedWriter(new FileWriter(DATA_FILE))
        ){
            for (Character cha: teleBook.getContacts().keySet()){
                for(Contact contact: teleBook.getContacts().get(cha)){
                    bw.write(contact.toCsvFormat());
                    bw.newLine();
                }
            }
        }
    }

    public void loadDataFromFIle(){
        List<String> csvList = new ArrayList<>();
        try (
                BufferedReader br = new BufferedReader(new FileReader(DATA_FILE))
                ){
            String line;
            while ((line = br.readLine()) != null){
                csvList.add(line);
            }
            for (int i = 0; i<csvList.size(); i++){
                String[] csvTab = csvList.get(i).split(",");
                char key = csvTab[0].charAt(0);
                String contactName = csvTab[1];
                String contactNumber = csvTab[2];
                if(teleBook.getContacts().containsKey(key)){
                    teleBook.getContacts().get(key).add(new Contact(contactName,contactNumber));
                }else if (!teleBook.getContacts().containsKey(key)){
                    Set<Contact> contactSet = new TreeSet<>();
                    contactSet.add(new Contact(contactName,contactNumber));
                    teleBook.getContacts().put(key,contactSet);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TeleBookController teleBookController = new TeleBookController();
        teleBookController.teleBookLoopControl();
    }
}
