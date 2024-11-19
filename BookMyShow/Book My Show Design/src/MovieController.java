import java.util.*;

public class MovieController {
    private List<Movie> movieList;
    private Map<City, List<Movie>> movieMap;
    public MovieController(){
        movieList = new ArrayList<>();
        movieMap = new HashMap<>();
    }
    //CRUD operations
    public void addNewMovies(City city, Movie movie){
        List<Movie> movies = movieMap.getOrDefault(city, new ArrayList<>());
        movies.add(movie);
        movieMap.put(city, movies);
        movieList.add(movie);
    }
    public Movie getMovieByName(String movieName){
        return (Movie) movieList.stream().filter(movie -> movie.getMovieName().equals(movieName));
    }
    public List<Movie> getMoviesByCity(City city){
        return movieMap.getOrDefault(city, new ArrayList<>());
    }
}
