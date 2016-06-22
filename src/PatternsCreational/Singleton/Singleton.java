package PatternsCreational.Singleton;

/**d
 * Created by pcarfrey on 6/19/16.
 * <p>
 *     provides one, thread-safe instance of the object
 * </p>
 */
public class Singleton {

    private Singleton() {
    }

    private static Singleton instance = null; //lazy load, performance gain, does not load at app start up

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) { //checks only on first load, makes singleton thread-safe
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}