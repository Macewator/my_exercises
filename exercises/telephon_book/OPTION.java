package exercises.telephon_book;

import java.util.NoSuchElementException;

public enum OPTION {

    ADD_CONTACT(0, "Dodaj kontakt"),
    SEARCH_BY_CHAR(1, "Szukaj alfabetycznie"),
    SEARCH_BY_NAME(2, "Szukaj po nazwie"),
    SEARCH_BY_TEL(3, "Szukaj po telefonie"),
    DELETE(4, "Usuń"),
    CLOSE(5, "Koniec");

    private final int shortcut;
    private final String description;

    OPTION(int shortcut, String description) {
        this.shortcut = shortcut;
        this.description = description;
    }

    public int getShortcut() {
        return shortcut;
    }

    static OPTION convertToOption(int option) {
        if(option >= values().length || option < 0)
            throw new NoSuchElementException("Podana ocja nie istnieje");
        return values()[option];
    }

    @Override
    public String toString() {
        return shortcut + " - " + description;
    }
}
