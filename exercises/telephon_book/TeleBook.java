package exercises.telephon_book;

import java.util.*;

public class TeleBook{

    Map<Character,Set<Contact>> contacts;

    public Map<Character, Set<Contact>> getContacts() {
        return contacts;
    }

    public void setContacts(Map<Character, Set<Contact>> contacts) {
        this.contacts = contacts;
    }

    public TeleBook() {
        contacts = new TreeMap<>();
    }

    public boolean addContactToTeleBook(String contactName, String contactNumber){
        if(contactName == null || contactNumber == null){
            throw new NullPointerException("name and telephone cannot be null");
        }
        if (contactName.isEmpty() || contactNumber.isEmpty()){
            throw new IllegalArgumentException("name and telephone cannot be null");
        }
        Character key = getKeyLetter(contactName);
        if(contacts.containsKey(key)){
            contacts.get(key).add(new Contact(contactName,contactNumber));
            return true;
        }else if (!contacts.containsKey(key)){
            Set<Contact> contactSet = new TreeSet<>();
            contactSet.add(new Contact(contactName,contactNumber));
            contacts.put(key,contactSet);
            return true;
        }else {
            return false;
        }
    }

    public Set<Contact> searchByAlphabetChar(Character letter){
        Set<Contact> contactSet = new HashSet<>();
       if(contacts.keySet().contains(letter)){
           contactSet = contacts.get(letter);
       }
        return  contactSet;
    }

    public boolean deleteContactFromTeleBook(String contactName){
        Character key = getKeyLetter(contactName);
        return contacts.get(key).removeIf(contact -> contact.getContactName().equals(contactName));
    }

    public Set<Contact> searchContactByNamePart(String contactNamePart){
        Set<Contact> findContact = new TreeSet<>();
        for (Set<Contact> contactSet: contacts.values()){
            contactSet.stream()
                    .filter(contact -> contact.getContactName().toLowerCase().contains(contactNamePart.toLowerCase()))
                    .forEach(findContact::add);
        }
        return findContact;

    }

    public Set<Contact> searchContactByNumberPart(String contactNumberPart){
        Set<Contact> findContact = new TreeSet<>();
        for (Set<Contact> contactSet: contacts.values()){
            contactSet.stream()
                    .filter(contact -> contact.getContactNumber().contains(contactNumberPart))
                    .forEach(findContact::add);
        }
        return findContact;
    }

    public Character getKeyLetter(String contactName){
        return contactName.charAt(0);
    }

}
