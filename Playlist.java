import java.util.ArrayList;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 */
import java.util.ArrayList;
 public class Playlist 
{
    /**
     * Variables-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */

    ArrayList<Song> playlist;
    
    



     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */
      String test = ("test");
      public Playlist()
      {
        playlist = new ArrayList<Song>();
      }
      public Liked()
      {
        liked = new ArrayList<Song>();
      }


      /**
       * Methods-- Remember that you need to be able to complete all of the following:
       * Adding a song
       * 'liking' a song
       * Removing a specific song
       * Examining all Songs (a String return or void print makes sense here)
       * Examining a sublist of all liked songs
       * Determining the total duration of all songs
       * Removing all unliked songs from the playlist (careful with this one!)
       */
      public void add(Song newSong)
      {
        playlist.add(newSong);
      }
      public void add(String title, String artist, String duration)
      {
        playlist.add(new Song(title, artist, duration));
      }
       public String addLikedSong()
      {

      }
      public String removeUnliked()
      {

      }
      public void removeSong(Song exsong)
      {
        playlist.remove(exsong);
      }
      public String Examine()
      {
        System.out.print(playlist);
      }
      public String examineLiked()
      {
        System.out.print(liked);
      }
      public void like(Song newsong)
      {
        newsong.like();
      }
      public String Duration()
      {

      }
      public ArrayList<Song>getAllSongs()
      {
        return playlist;
      }
      public ArrayList<Song>getLikedSongs()
      {
        ArrayList<Song> likedSongs = new ArrayList<Song>();
        for (Song song : playlist)
        {
            if (song.liked())
            likedSongs.add(song);
        }
      }


}
