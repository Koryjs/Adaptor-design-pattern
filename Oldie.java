/**
 * Creates an instance of an Oldie, which is similar to a Song but formatted differently
 * @author Kory Singleton
 */
public class Oldie implements Tune {
    private String artistName;
    private String songTitle;
    private String recordTitle;
    private String category;
    /**
     * The default constructor for the Oldie class
     * @param artistName a String containing the name of the artist
     * @param songTitle a String containing the title of the song
     * @param recordTitle a String containing the title of the record
     * @param category a String containing the musical category of the song
     */
    public Oldie(String artistName, String songTitle, String recordTitle, String category) {
        this.artistName = artistName;
        this.songTitle = songTitle;
        this.recordTitle = recordTitle;
        this.category = category;
    }
    public String getArtistName() {
        return artistName;
    }
    public String getDisplayTitle() {
        return songTitle+": "+recordTitle;
    }
    public String getCategory() {
        return category;
    }
}
