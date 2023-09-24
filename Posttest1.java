package posttest1;

import films.Film;
import java.util.ArrayList;

public class Posttest1 {
    public static void main(String[] args) {
        ArrayList<Film> films = new ArrayList<>();

        // Isi ArrayList dengan objek Film
        films.add(new Film("Inception", "Action"));
        films.add(new Film("The Shawshank Redemption", "Drama"));
        films.add(new Film("The Dark Knight", "Action"));
        films.add(new Film("Pulp Fiction", "Crime"));
        films.add(new Film("The Godfather", "Crime"));

        // Perulangan untuk menampilkan informasi film
        for (Film film : films) {
            System.out.println("Film " + film.getJudul() + " bergenre " + film.getGenre() + ".");
        }
    }
}

