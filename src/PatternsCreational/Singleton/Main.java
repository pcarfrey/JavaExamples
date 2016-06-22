package PatternsCreational.Singleton;

/**
 * Created by pcarfrey on 6/19/16.
 */
public class Main {
    public static void main(String arg[]) {

        Singleton instance = Singleton.getInstance();
        System.out.println(instance); //address in memory

        Singleton anotherInstance = Singleton.getInstance();
        System.out.println(anotherInstance); //will have same address in memory

    }
}
