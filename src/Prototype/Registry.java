package Prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by pcarfrey on 6/21/16.
 *
 * <p>
 *     guarantee unique instance
 *     performance gain, avoids costly constructor creation
 * </p>
 */
public class Registry {

    private Map<String, Item> items = new HashMap<>(); //consider using enum for Item keys

    public Registry() {
        loadItems();
    }

    public Item createItem(String type) { //creates new instance without costly constructor creation
        Item item = null;

        try {
            item = (Item) (items.get(type)).clone(); //shallow copy
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return item;
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Basic Movie");
        movie.setPrice(14.99);
        movie.setRuntime("2 hours");
        items.put("Movie", movie);

        Book book = new Book();
        book.setNumberOfPages(950);
        book.setPrice(12.00);
        book.setTitle("Basic Book");
        items.put("Book", book);
    }
}
