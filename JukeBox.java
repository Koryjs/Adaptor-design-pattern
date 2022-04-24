import java.util.*;
/**
 * Creates a HashMap of songs that the user can play
 * @author Kory Singleton
 */
public class JukeBox {
    private HashMap<String, Song> songs;
    private int currentSong;
    /**
     * Default constructor for JukeBox
     */
    public JukeBox() {
        songs = new HashMap<String, Song>();
        currentSong = 0;
    }
    /**
     * Adds a Song object to the HashMap
     * @param song an Song object
     */
    public void addSong(Song song) {
        songs.put(song.getTitle(), song);
    }
    /**
     * Converts the contents of a SongAdaptor into a Track to be added to the HashMap
     * @param song a SongAdapter instance
     */
    public void addSong(SongAdapter song) {
        Track track = new Track(song.getTitle(), song.getAlbum(), song.getArtistFirstName(), song.getArtistLastName(), Genre.valueOf(song.getGenre()));
        songs.put(track.getTitle(), track);
    }
    /**
     * Prints the paramterized songName if that song exists in the Map
     * @param songName a string containing the name of the song you'd like to search for
     */
    public void play(String songName) {
        Iterator<Map.Entry<String, Song> > iterator = songs.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Song> entry = iterator.next();
            if (songName.equals(entry.getKey())) {
                System.out.println(entry.toString());
            }
        }
    }
}
