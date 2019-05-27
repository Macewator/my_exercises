package java_start.wisielec;

import java.util.*;

public class WordDatabase {

    private String[] words = {"zimne lato", "szybka rakieta"};
    private Map<String,Queue<String>> hint = new HashMap<>();
    private Random random = new Random();

    public Map<String, Queue<String>> getHint() {
        return hint;
    }

    public void hintMap(){
       for (String word: words){
           hint.put(word, new LinkedList<>());
       }
    }

    public void addHintToMap(){
        hint.get("zimne lato").offer("miało być gorące, a jest...");
        hint.get("zimne lato").offer("zazwyczaj bywa w lipcu");
        hint.get("zimne lato").offer("śnieg na leżaku");

        hint.get("szybka rakieta").offer("lata w kosmos");
        hint.get("szybka rakieta").offer("jest jak ferrari, czyli...");
        hint.get("szybka rakieta").offer("może być, ziemia - powietrze");
    }

    public String hintDisplay(String key){
        return hint.get(key).poll();
    }

    public String randomWord(){
        return words[random.nextInt(2)];
    }
}
