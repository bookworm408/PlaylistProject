import java.util.ArrayList;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 */
public class Playlist {
    private ArrayList<Song> playlist;
    private ArrayList<Song> liked;

    public Playlist() {
        playlist = new ArrayList<>();
        liked = new ArrayList<>();
    }

    public void add(Song newSong) {
        playlist.add(newSong);
    }

    public void add(String title, String artist, String duration) {
        playlist.add(new Song(title, artist, duration, false));
    }

    public void removeSong(Song exsong) {
        playlist.remove(exsong);
    }

    public void like(Song newsong) {
        newsong.like();
        liked.add(newsong);
    }

    public void removeUnliked() {
        ArrayList<Song> unlikedSongs = new ArrayList<>();
        for (Song song : playlist) {
            if (!song.isLiked()) {
                unlikedSongs.add(song);
            }
        }
        playlist.removeAll(unlikedSongs);
    }

    public void examine() {
        for (Song song : playlist) {
            System.out.println(song);
        }
    }

    public void examineLiked() {
        for (Song song : liked) {
            System.out.println(song);
        }
    }

    public String duration() {
        int totalMinutes = 0;
        int totalSeconds = 0;

        for (Song song : playlist) {
            totalMinutes += song.getDurationMinutes();
            totalSeconds += song.getDurationSeconds();
        }

        totalMinutes += totalSeconds / 60;
        totalSeconds %= 60;

        return totalMinutes + ":" + totalSeconds;
    }

    public ArrayList<Song> getAllSongs() {
        return playlist;
    }

    public ArrayList<Song> getLikedSongs() {
        return liked;
    }
}
