public class Movie {
    private int movieId;
    private String movieName;
    private double imdbRating;
    private String movieGenre;
    private int movieDuration;

    public int getMovieDuration() {
        return movieDuration;
    }

    public void setMovieDuration(int movieDuration) {
        this.movieDuration = movieDuration;
    }

    public Movie(int movieId, String movieName, double imdbRating, String movieGenre){
        this.movieId = movieId;
        this.movieName = movieName;
        this.imdbRating = imdbRating;
        this.movieGenre = movieGenre;
    }

    public Movie() {

    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(double imdbRating) {
        this.imdbRating = imdbRating;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }
}
