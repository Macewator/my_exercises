package exercises.playlista;

public class Song {

    private String songName;
    private int songDuration;

    public String getSongName() {
        return songName;
    }

    public int getSongDuration() {
        return songDuration;
    }

    public Song(String songName, int songDuration) {
        this.songName = songName;
        this.songDuration = songDuration;
    }

    @Override
    public String toString() {
        return "song name: " + songName +
                ", song duration: " + songDuration;
    }
}
