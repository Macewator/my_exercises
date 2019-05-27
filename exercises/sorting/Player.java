package exercises.sorting;

import java.util.Comparator;

public class Player implements Comparable<Player>{

    private String nickName;
    private int score;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Player(String nickName, int score) {
        this.nickName = nickName;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Player{" +
                "nickName='" + nickName + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Player o) {
        return Integer.compare(o.getScore(),getScore());
    }

    public static Comparator<Player> reversScoreOrder = (o1, o2) -> {
        int result = 0;
        if(o1.getScore()>o2.getScore()){
            result = 1;
        }else if(o1.getScore()<o2.getScore()){
            result = -1;
        }

        return result;
    };

    public static Comparator<Player> nickNameOrder = (o1, o2) -> o1.getNickName().compareTo(o2.getNickName());

    public static Comparator<Player> reversNickNameOrder = (o1, o2) -> o2.getNickName().compareTo(o1.getNickName());
}
