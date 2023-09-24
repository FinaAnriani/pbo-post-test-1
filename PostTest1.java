package com.mycompany.post.test1;


import java.util.ArrayList;

public class PostTest1 {
    public static void main(String[] args) {
        ArrayList<Film> films = new ArrayList<>();
        
        // Objek 1
        Film film1 = new Film("Inception", 2010, "Christopher Nolan");
        films.add(film1);
        
        // Objek 2
        Film film2 = new Film("The Shawshank Redemption", 1994, "Frank Darabont");
        films.add(film2);
        
        // Objek 3
        Film film3 = new Film("Pulp Fiction", 1994, "Quentin Tarantino");
        films.add(film3);
        
        // Objek 4
        Film film4 = new Film("The Dark Knight", 2008, "Christopher Nolan");
        films.add(film4);
        
        // Objek 5
        Film film5 = new Film("Fight Club", 1999, "David Fincher");
        films.add(film5);
        
        for (Film film : films) {
            System.out.println("Film berjudul " + film.getTitle() + " dirilis tahun " + film.getYear() +
                    " dan disutradarai oleh " + film.getDirector() + ".");
        }
    }
}

class Film {
    private String title;
    private int year;
    private String director;
    
    public Film(String title, int year, String director) {
        this.title = title;
        this.year = year;
        this.director = director;
    }
    
    public String getTitle() {
        return title;
    }
    
    public int getYear() {
        return year;
    }
    
    public String getDirector() {
        return director;
    }
}