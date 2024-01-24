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
        Playlist p = new Playlist();

        System.out.println("Adding songs to the Playlist...\n");
        /**
         * Add some songs here. Note that the format for adding a Song to a Playlist p
         * is something like...
         * p.addSong(new Song(..., ..., ...))
         */
        p.addSong(new Song("Pain", "Pink Pantheress", "1:31", false));
        p.addSong(new Song("For the First Time", "Mac DeMarco", "3:02", false));
        p.addSong(new Song("Youngest Daughter", "Superhaven", "4:09", false));
        p.addSong(new Song("Everlong", "Foo Fighters", "4:10", false));
        p.addSong(new Song("Rebel Yell", "Billy Idol", "4:48", false));



        System.out.println("Printing the songs...\n");
        //Print out all the songs in the playlist to verify it's working correctly
        System.out.println(p.getAllSongs());


        System.out.println("\nLiking Pain, For the First Time, and Youngest Daughter...\n");
        //Once your songs are 'liked', this should be reflected in the next printout
        p.like(0);
        p.like(1);
        p.like(2);


        System.out.println("Printing the songs...\n");
        System.out.println(p.getAllSongs());

        System.out.println("\nRemoving Rebel Yell...\n");
        p.remove(4);


        System.out.println("Printing the songs...\n");
        System.out.println(p.getAllSongs());


        System.out.println("\nPrinting only the liked songs...\n");
        //Your Playlist should be able to do this without looping while in main!
        System.out.println(p.getLikedSongs());


        System.out.println("\nPrinting the total duration of all songs...\n");
        //Note that the format should look something like minutes:seconds
        System.out.println(p.totalDuration());


        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        //This should be doable with a single method call
        p.removeUnliked();


        System.out.println("Printing all songs...\n");
        //This should now look like only the liked songs list from before
        System.out.println(p.getAllSongs());
    }
}
