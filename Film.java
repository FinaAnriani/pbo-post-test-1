package films;

public class Film {
    private String judul;
    private String genre;

    public Film(String judul, String genre) {
        this.judul = judul;
        this.genre = genre;
    }

    public String getJudul() {
        return judul;
    }

    public String getGenre() {
        return genre;
    }
}


