/**
 * An interface to help initalize Objects
 * @author Kory Singleton
 */
public interface Tune {
    /**
     * Returns the artist's name
     * @return a String containing the artist's name
     */
    public String getArtistName();
    /**
     * Reformats the song title and record title into a single String
     * @return a String containing the reformatted string  
     */
    public String getDisplayTitle();
    /**
     * Returns the category of the Oldie
     * @return a String containing the category
     */
    public String getCategory();
}
