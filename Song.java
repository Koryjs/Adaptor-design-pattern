public abstract class Song {
    abstract public String getTitle();
    abstract public String getAlbum();
    abstract public String getArtistFirstName();
    abstract public String getArtistLastName();
    abstract public String getGenre();
    public String toString() {
        String total = getTitle()+"\nAlbum: "+getAlbum()+"\nBy: ";
        total += getArtistFirstName()+" "+getArtistLastName()+"\nGenre: "+getGenre();
        return total;
    }
}