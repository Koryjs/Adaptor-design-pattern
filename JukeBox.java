import java.util.*;
public class JukeBox {
    private HashMap<String, Song> songs;
    private int currentSong;
    public JukeBox() {
        songs = new HashMap<String, Song>();
        currentSong = 0;
    }
    public void addSong(Song song) {
        songs.put(song.getTitle(), song);
    }
    public void addSong(SongAdapter song) {
        Track track = new Track(song.getTitle(), song.getAlbum(), song.getArtistFirstName(), song.getArtistLastName(), Genre.valueOf(song.getGenre()));
        songs.put(track.getTitle(), track);
    }
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
