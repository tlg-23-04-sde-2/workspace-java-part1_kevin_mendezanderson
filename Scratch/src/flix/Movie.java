package flix;

class Movie {
    //fields or instance variables / properties / attributes
    private String titles;
    private Integer releaseYear;
    private Double revenue;
    private Rating rating;
    private Genre genre;

    //constructors
//    public flix.Movie(){
//        // no-op
//    }
    public Movie(String titles){
        setTitles(titles);
    }
    public Movie(String titles, Genre genre){
        this(titles);
        setGenre(genre);
    }
    public Movie(String titles, Integer releaseYear, Double revenue, Rating rating, Genre genre){
        this(titles, genre);                           //delegate to ctor above for title
        setReleaseYear(releaseYear);            //delegate to its setter for any validation/conversion
        setRevenue(revenue);                    //delegate to its setter for any validation/conversion
        setRating(rating);
    }

    //business methods - pause(), play(), stop(), rewind()


    //accessor methods ( get/set) - these provide controlled access to the object's fields

    public String getTitles() {
        return titles;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public Double getRevenue() {
        return revenue;
    }

    public void setTitles(String titles) {
        this.titles = titles;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    //to string method
    public String toString(){
        return String.format("Movie title=%s, release date=%s, revenue=%,.2f, Rating=%s, Genre=%s",
                getTitles(),getReleaseYear(),getRevenue(),getRating(),getGenre());
    }

}