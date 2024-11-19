import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TheatreController {
    private List<Theatre> theatreList;
    private Map<City, List<Theatre>> cityTheatreMap;

    public TheatreController(){
        theatreList = new ArrayList<>();
        cityTheatreMap = new HashMap<>();
    }
    //CRUD operations

    public void addNewTheatre(City city, Theatre theatre){
        theatreList.add(theatre);
        List<Theatre> theatres = cityTheatreMap.getOrDefault(city, new ArrayList<>());
        theatres.add(theatre);
        cityTheatreMap.put(city, theatres);
    }
    public Map<Theatre, List<Show>> getAllShows(Movie movie, City city){
        List<Theatre> theatres = cityTheatreMap.getOrDefault(city, new ArrayList<>());
        return theatres.stream()
                .collect(Collectors.toMap(
                        theatre -> theatre,
                        theatre -> theatre.getShowList()
                                .stream()
                                .filter(show -> show.getMovie().getMovieId() == movie.getMovieId()).toList()));
//                .entrySet()
//                .stream()
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    public Theatre getTheatreByAddress(String address){
        return (Theatre) theatreList.stream().filter(theatre -> theatre.getAddress().equals(address));
    }
    public List<Theatre> getTheatresByCity(City city){
        return cityTheatreMap.getOrDefault(city, new ArrayList<>());
    }

    public List<Theatre> getTheatreList() {
        return theatreList;
    }

    public void setTheatreList(List<Theatre> theatreList) {
        this.theatreList = theatreList;
    }

    public Map<City, List<Theatre>> getCityTheatreMap() {
        return cityTheatreMap;
    }

    public void setCityTheatreMap(Map<City, List<Theatre>> cityTheatreMap) {
        this.cityTheatreMap = cityTheatreMap;
    }



}
