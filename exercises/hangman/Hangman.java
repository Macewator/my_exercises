package java_start.wisielec;

public class Hangman {

    public static final int MAX_ERROR = 8;

    private static String mainWord;
    private static String stars;
    private static String[] starsTab;
    private static String[] lettersTab;
    private static int error;

    public String getMainWord() {
        return mainWord;
    }

    public String getStars() {
        return stars;
    }

    public Hangman(String mainWord){
        Hangman.mainWord = mainWord;
        generateData();
    }

    public static void checkAndDisplay(String letter){
        errorCheck(letter);
        checkLetter(letter);
        generateDisplay();
    }

    public void generateData(){
        stars = mainWord.replaceAll("[^ ]","*");
        starsTab = stars.split("");
        lettersTab = mainWord.split("");
    }

    public static void checkLetter(String letter){
        for (int i = 0; i<mainWord.length(); i++){
            if(lettersTab[i].equals(letter)){
                starsTab[i] = letter;
            }
        }
    }

    public static void generateDisplay(){
        String stars2 = "";
        for (int i = 0; i<mainWord.length(); i++){
            stars2 += starsTab[i];
        }
        stars = stars2;
    }

    public static void errorCheck(String letter){
        if(!(mainWord.contains(letter))) {
            error ++;
        }
    }

    protected static boolean answer(String myAnswer){
        return myAnswer.matches(mainWord);
    }

    protected boolean playerLost(){
        return error >= MAX_ERROR;
    }

    protected boolean playerWon(){
        return !(stars.contains("*"));
    }
}
