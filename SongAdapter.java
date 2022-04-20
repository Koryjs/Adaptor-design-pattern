public class SongAdapter extends Song {
    private Tune tune;
    public SongAdapter(Tune tune) {
        this.tune = tune;
    }
    public String getTitle() {
        return tune.getDisplayTitle().substring(0, tune.getDisplayTitle().indexOf(": "));
    }
    public String getAlbum() {
        //System.out.println(tune.getDisplayTitle().substring(tune.getDisplayTitle().indexOf(": ")+2));
        return tune.getDisplayTitle().substring(tune.getDisplayTitle().indexOf(": ")+2);
    }
    public String getArtistFirstName() {
        return tune.getArtistName().substring(0, tune.getArtistName().indexOf(" "));
    }
    public String getArtistLastName() {
        return tune.getArtistName().substring(tune.getArtistName().indexOf(" ")+1);
    }
    public String getGenre() {
        String cat = tune.getCategory();
        String fin = "";
        switch (cat) {
            case "Country and Western":
                fin = Genre.COUNTRY.toString();
                break;
            case "R&B and Soul":
                fin = Genre.OTHER.toString();
                break;
            case "Easy Listening":
                fin = Genre.OTHER.toString();
                break;
            default:
                fin = Genre.ROCK.toString();
        }
        return fin;
    }
}
