import java.util.ArrayList;
import java.util.Arrays;

public class CreatingVGInstances {
    public static void main(String[] args) {
        ArrayList<String> unchartedGenres = new ArrayList<>();
        unchartedGenres.addAll(Arrays.asList("Adventure", "Puzzle"));

        VideoGame vg1 = new VideoGame("Uncharted", unchartedGenres,
                "M", "Playstation");
    }
}
