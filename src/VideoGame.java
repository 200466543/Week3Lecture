import java.util.ArrayList;

public class VideoGame {
    private String name;
    private ArrayList<String> genre;
    private String ageRating;
    private String console;

    public VideoGame(String name, ArrayList<String> genre, String ageRating, String console) {
        setName(name);
        setGenre(new ArrayList<>());
        setAgeRating(ageRating);
        setConsole(console);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getGenre() {
        return genre;
    }

    public void setGenre(ArrayList<String> genre) {
        this.genre = genre;
    }

    public String getAgeRating() {
        return ageRating;
    }

    public void setAgeRating(String ageRating) {
        this.ageRating = ageRating;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }
}
