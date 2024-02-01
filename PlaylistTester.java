/**
 * Sample of a tester file for the Playlist class. This file should demonstrate all the capability of your
 * playlist in the main method. You don't need to follow the testing specifications of this exactly
 * if you want to write your own separate tester instead.
 * Note that there's no need for a Scanner in this project-- all of the playlist can be 'hardcoded' into main.
 * @author
 * @version
 */
public class PlaylistTester {
    public static void main(String[] args) {
        System.out.println("Initializing a Playlist...\n");

        // Make your playlist here
        Playlist p = new Playlist();

        System.out.println("Adding songs to the Playlist...\n");
        p.add(new Song("Rock and Roll", "Led Zeppelin", "3:40", false));
        p.add(new Song("Bohemian Rhapsody", "Queen", "5:55", false));
        p.add(new Song("Stairway to Heaven", "Led Zeppelin", "8:02", false));

        System.out.println("Printing the songs...\n");
        for (Song s : p.getAllSongs()) {
            System.out.println(s);
        }

        System.out.println("\nLiking the songs...\n");
        p.like(p.getAllSongs().get(0));
        p.like(p.getAllSongs().get(2));

        System.out.println("Printing the songs...\n");
        for (Song s : p.getAllSongs()) {
            System.out.println(s);
        }

        System.out.println("\nRemoving unliked songs...\n");
        p.removeUnliked();

        System.out.println("Printing all songs...\n");
        for (Song s : p.getAllSongs()) {
            System.out.println(s);
        }

        System.out.println("\nPrinting liked songs...\n");
        for (Song s : p.getLikedSongs()) {
            System.out.println(s);
        }

        System.out.println("\nPrinting the total duration of all songs...\n");
        System.out.println("Total Duration: " + p.duration());
    }
}
