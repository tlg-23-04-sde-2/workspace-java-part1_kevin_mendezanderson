package flix;

enum Genre {
    ROMANCE("Romance"),
    COMEDY("Comedy"),
    SCI_FI("Sci-FI"),
    DRAMA("Drama"),
    HORROR("Horror"),
    ACTION("Action!"),
    ADVENTURE("Adventure"),
    FANTASY("Fantasy");
    //everything below here is regular class definition stuff
    //fields, constructors, methods
    private final String display;

    Genre(String display){
        System.out.println("flix.Genre ctor called");
        this.display = display;
    }
    public String display(){
        return display;
    }
    public String toString() {
        return display();
    }
}