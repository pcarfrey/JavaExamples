package PatternsCreational.Prototype;

/**
 * Created by pcarfrey on 6/20/16.
 */
public class Main {

    public static void main(String[] args) {

        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("Creational Patterns in Java");

        System.out.println(movie);
        System.out.println(movie.getTitle());
        System.out.println(movie.getRuntime());
        System.out.println(movie.getPrice());

        Movie anotheMovie = (Movie) registry.createItem("Movie");
        anotheMovie.setTitle("Gang of Four");

        System.out.println(anotheMovie); //unique instance
        System.out.println(anotheMovie.getTitle());
        System.out.println(anotheMovie.getRuntime());
        System.out.println(anotheMovie.getPrice());
    }
}
