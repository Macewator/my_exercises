package exercises.playlista;

public class PlayListMain {
    public static void main(String[] args) {
        Song song = new Song("Labamba", 320);
        Song song1 = new Song("No", 305);
        Song song2 = new Song("I'm so sick", 298);
        Song song3 = new Song("Secret", 315);

        int playlistLength = PlayList.playlistLength(song,song1,song2);
        System.out.println(PlayList.getFormattedTime(playlistLength));
    }
}
