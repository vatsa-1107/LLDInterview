import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BookMyShow {
    private TheatreController theatreController;
    private MovieController movieController;

    public BookMyShow(){
        theatreController = new TheatreController();
        movieController = new MovieController();
    }
    public static void main(String[] args){
        BookMyShow  bookMyShow = new BookMyShow();
        bookMyShow.initialise();

        City city1 = new City("Mumbai");
        City city2 = new City("Delhi");
        //user1
        bookMyShow.createBooking(city1, "BAAHUBALI");

        //user2
        bookMyShow.createBooking(city2, "BAAHUBALI");
    }
    private void createBooking(City city, String movieName){
        //search movie by the location
        List<Movie> movies = movieController.getMoviesByCity(city);

        //select a movie
        Movie interestedMovie = null;
        for(Movie movie: movies){
            if(movie.getMovieName().equals(movieName)){
                interestedMovie = movie;
                break;
            }
        }
        //get all shows for this movie in the same city
        Map<Theatre, List<Show>> showsTheatreList = theatreController.getAllShows(interestedMovie, city);

        //select the show
        Map.Entry<Theatre, List<Show>> entry = showsTheatreList.entrySet().iterator().next();
        List<Show> runningShows = entry.getValue();
        Show interestedShow = runningShows.get(0);

        //select the seat

    }
    private void initialise(){
        createMovies();
        createTheatre();
    }
    private List<Screen> createScreens(){
        List<Screen> screens = new ArrayList<>();
        Screen screen1 = new Screen();
        screen1.setScreenId(1);
        screen1.setSeatList(createSeats());
        screens.add(screen1);

        return screens;

    }
    private Show createShows(int showId, Screen screen, Movie movie, int showStartTime){
        Show show = new Show();
        show.setShowId(showId);
        show.setScreen(screen);
        show.setMovie(movie);
        show.setShowStartTime(showStartTime); //24 hrs time ex: 14 means 2pm and 8 means 8AM
        return show;
    }
    private List<Seat> createSeats(){
        List<Seat> seats = new ArrayList<>();

        //1 to 40 : SILVER
        for (int i = 0; i < 40; i++) {
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setSeatType(SeatType.DIAMOND);
            seats.add(seat);
        }

        //41 to 70 : SILVER
        for (int i = 40; i < 70; i++) {
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setSeatType(SeatType.GOLD);
            seats.add(seat);
        }

        //1 to 40 : SILVER
        for (int i = 70; i < 100; i++) {
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setSeatType(SeatType.PLATINUM);
            seats.add(seat);
        }

        return seats;

    }
    private void createTheatre(){
        Movie movie1 = movieController.getMovieByName("AVENGERS");
        Movie movie2 = movieController.getMovieByName("BAAHUBALI");
        Theatre theatre1 = new Theatre();
        theatre1.setTheatreId(1);
        theatre1.setAddress("Nalasupara");
        theatre1.setCity(new City("Mumbai"));
        theatre1.setScreenList(createScreens());
    }
    private void createMovies(){
        //movie1
        Movie avengers = new Movie();
        avengers.setMovieId(1);
        avengers.setImdbRating(8.5);
        avengers.setMovieGenre("ACTION");
        avengers.setMovieName("AVENGERS");
        avengers.setMovieDuration(120);
        //movie2
        Movie baahubali = new Movie();
        baahubali.setMovieId(2);
        baahubali.setMovieName("BAAHUBALI");
        baahubali.setMovieDuration(180);

        movieController.addNewMovies(new City("Delhi"), avengers);
        movieController.addNewMovies(new City("Mumbai"), baahubali);
        movieController.addNewMovies(new City("Mumbai"), avengers);
        movieController.addNewMovies(new City("Delhi"), avengers);

    }
}
