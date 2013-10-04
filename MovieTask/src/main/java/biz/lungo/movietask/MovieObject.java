package biz.lungo.movietask;

public class MovieObject {
    private int posterImageId;
    private String title;
    private String genre;
    private String releaseYear;
    private String country;
    private String director;
    private String actors;
    private String description;

    public MovieObject(int posterImageId, String title, String genre, String releaseYear, String country, String director, String actors, String description) {
        this.posterImageId = posterImageId;
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.country = country;
        this.director = director;
        this.actors = actors;
        this.description = description;
    }

    public int getPosterImageId() {
        return posterImageId;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public String getCountry() {
        return country;
    }

    public String getDirector() {
        return director;
    }

    public String getActors() {
        return actors;
    }

    public String getDescription() {
        return description;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
