/**
 * A subclass of Song
 * @author Kory Singleton
 */
public class Track extends Song {
    private String title;
    private String album;
    private String firstName;
    private String lastName;
    private Genre genre;
    /**
     * Constructor for the Track class
     * @param title a String containing the title of the Song
     * @param album a String containing the album of the Song
     * @param firstName a String containing the first name of the artist
     * @param lastName a String containing the last name of the artist
     * @param genre a String containing the genre of the Song
     */
    public Track(String title, String album, String firstName, String lastName, Genre genre) {
        this.title = title;
        this.album = album;
        this.firstName = firstName;
        this.lastName = lastName;
        this.genre = genre;
    }
    public String getTitle() {
        return title;
    }
    public String getAlbum() {
        return album;
    }
    public String getArtistFirstName() {
        return firstName;
    }
    public String getArtistLastName() {
        return lastName;
    }
    public String getGenre() {
        return genre.toString();
    }
}
