package flix;

class MovieClient {

    public static void main(String[] args) {
        Movie movie1 = new Movie("Mario");
        movie1.setReleaseYear(2023);
        movie1.setRevenue(1_000_000_000.0);
        movie1.setRating(Rating.R);
        movie1.setGenre(Genre.ROMANCE);

        System.out.println(movie1); //toString() automatically called. Because it is a movie object

        Movie movie2 = new Movie("Zelda",2000,750_000_000.0, Rating.PG, Genre.ACTION);
        Movie movie3 = new Movie("hero");

        System.out.println(movie2);
        System.out.println(movie3);
    }

}