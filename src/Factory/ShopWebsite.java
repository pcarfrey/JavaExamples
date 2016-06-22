package Factory;

/**
 * Created by pcarfrey on 6/21/16.
 */
public class ShopWebsite extends Website {

    @Override
    public void createWebsite() {
        pages.add(new CartPaage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());

    }
}
