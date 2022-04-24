/**
 * An abstract class to help initialize instances of songs
 * @author Kory Singleton
 */
public abstract class Song {
    /**
     * Returns the title of the Song
     * @return a String containing the title
     */
    abstract public String getTitle();
    /**
     * Returns the Album of the song
     * @return a String containing the album
     */
    abstract public String getAlbum();
    /**
     * Returns the artist's first name
     * @return a String containing the artist's first name
     */
    abstract public String getArtistFirstName();
    /**
     * Returns the last name of the artist
     * @return a String containing the artists's last name
     */
    abstract public String getArtistLastName();
    /**
     * Returns the genre of the song
     * @return a String containing the genre
     */
    abstract public String getGenre();
    /**
     * Reformats all of the contents of the Song into a single String
     * @return the reformmated String
     */
    public String toString() {
        String total = getTitle()+"\nAlbum: "+getAlbum()+"\nBy: ";
        total += getArtistFirstName()+" "+getArtistLastName()+"\nGenre: "+getGenre();
        return total;
    }
}