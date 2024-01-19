/**
 * File for a Song class to be used in the Playlist Project
 * @Alex C, Soren F
 * @version
 */
public class Song 
{
    //Fields-- what information do we want each Song to store?
private String songName;
private String artist;
private String duration;
private boolean like;



    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */
    public Song(String songName, String artist, String duration, boolean like)
    {
        this.songName = songName;
        this.artist = artist;
        this.duration = duration;
        this.like = false;
    }





     /**
      * Methods-- what will you want each Song to do?
      * Consider all the getter methods (getName, getArtist, etc.)
      * You should probably have a toString method to be able to get the information for the full
      * song easily as well!
      * What kind of mutator (setter) methods will you need?
      *getName, getartist, getduration, like, unlike, isliked
      */

      public String getName()
      {
        return songName;
      }

      public String getArtist()
      {
        return artist;
      }

      public String getDuration()
      {
        return duration;
      } 

      public void like()
      {
        like = true;
      } 

      public void unlike()
      {
        like = false;
      } 

      public boolean isLiked()
      {
        return like;
      } 

      public double getDurationInSeconds()
      {
        double seconds = 0;
        String minutesPart = duration.substring(0, duration.indexOf(":"));
        seconds += Integer.parseInt(minutesPart) * 60;
        String secondsPart = duration.substring(duration.indexOf(":") +1);
        seconds += Integer.parseInt(secondsPart);
        return seconds;
      }

        public String toString()
      {
        {
            return "songName-" + songName + ", artist-" + artist + ", duration-" + duration;
        } 
      }
}
