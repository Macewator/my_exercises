package java_start.wisielec;

import java.util.Scanner;

public class Game {

    private static final int START = 1;
    private static final int END_GAME = 2;
    private static final String ANSWER = "4";
    private static final String HINT = "3";

    private Scanner scanner = new Scanner(System.in);
    private WordDatabase wordDatabase = new WordDatabase();
    private boolean play = true;

    public void gameControl(){
        option();
        int option;
        while ((option = scanner.nextInt())!= END_GAME){
            scanner.nextLine();
            if (option == START) {
                play();
            }
            option();
        }
        System.out.println("Bye Bye");
    }

    private void option(){
        System.out.println("1 - rozpocznij gre");
        System.out.println("2 - zakończ gre");
    }

    private void playOption(){
        System.out.println("3 - popowiedź");
        System.out.println("4 - odgaduje całe chasło");
    }

    private void play(){
        play = true;
        Hangman hangman = new Hangman(wordDatabase.randomWord());
        prepareHintMap();
        while (!(hangman.playerWon()) && !(hangman.playerLost()) && play) {
            playOption();
            System.out.println("hasło do zgadnięcia:");
            System.out.println(hangman.getStars());
            System.out.println("podaj litere");
            String letter = scanner.nextLine();
            hintCheck(letter, hangman.getMainWord());
            answer(letter);
        }
        if (hangman.playerLost()) {
            System.out.println("Przegrałeś za dużo prób!");
        }else if (hangman.playerWon()) {
            System.out.println("Wygrałeś!");
            System.out.printf("Hasło: %s\n\n", hangman.getStars());
        }
    }

    private void hintCheck(String letter, String key){
        if(letter.equals(HINT)){
            if(wordDatabase.getHint().get(key).isEmpty()) {
                System.out.println("Brak popowiedzi");
            }else{
                System.out.println("Podpowiedź: " + hint(key));
            }
        }
    }

    private String hint(String key){
        return wordDatabase.hintDisplay(key);
    }

    private void prepareHintMap(){
        wordDatabase.hintMap();
        wordDatabase.addHintToMap();
    }

    private void answer(String letter){
        if(letter.equals(ANSWER)) {
            System.out.println("Podaj pełne hasło");
            String myAnswer = scanner.nextLine();
            if (Hangman.answer(myAnswer)) {
                System.out.println("Wygrałeś");
                System.out.printf("Hasło: %s\n\n", myAnswer);
                play = false;
            } else {
                System.out.println("Błędne hasło, przegrałeś");
                play = false;
            }
        }else {
            Hangman.checkAndDisplay(letter);
        }
    }
}