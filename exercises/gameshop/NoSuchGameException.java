package exercises.gameshop;

public class NoSuchGameException extends Exception{

    public NoSuchGameException(String gameName) {
        super("Brak podanej gry w sklepie: " + gameName);
    }
}
