package exercises.telephon_book;

import java.util.Objects;

public class Contact implements Comparable<Contact>{

    private String contactName;
    private String contactNumber;

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Contact(String contactName, String contactNumber) {
        this.contactName = contactName;
        this.contactNumber = contactNumber;
    }

    public String toCsvFormat(){
        return contactName.charAt(0)+","+contactName+","+contactNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(contactName, contact.contactName) &&
                Objects.equals(contactNumber, contact.contactNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contactName, contactNumber);
    }

    @Override
    public int compareTo(Contact o) {
        return getContactName().compareToIgnoreCase(o.getContactName());
    }

    @Override
    public String toString() {
        return "Kontakt, nazwa: " + contactName
                + ", numer: " + contactNumber;
    }
}
