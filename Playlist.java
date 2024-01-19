import java.util.ArrayList;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 */
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
      public Playlist()
      {
        playlist = new ArrayList<Song>();
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


    /**
     * @param newSong the song to be added
     */
      public void addSong(Song newSong)
      {
        playlist.add(newSong);
      }


    /**
     * Likes a song
     */
      public void like(Song newSong)
      {
        newSong.like();
      } 

      /**
       * Removes song from playlist
       */
      public void remove(Song exSong)
      {
        playlist.remove(exSong);
      } 

      public ArrayList<Song> getAllSongs()
    {
        return playlist;
    }
      
    public ArrayList<Song> getLikedSongs()
    {
     ArrayList<Song> likedSongs = new ArrayList<Song>();
     for (Song song : playlist)
     {
        if (song.isLiked())
        {
            likedSongs.add(song);
        }
     }
     return likedSongs;
    }

    public double totalDuration()
    {
        double total = 0;
        for (int i = 0; i < playlist.size(); i++)
        {
            total += playlist.get(i).getDurationInSeconds();
        } 
        return total;
    }
}
