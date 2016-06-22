package Factory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pcarfrey on 6/21/16.
 */
public abstract class Website {

    protected List<Page> pages = new ArrayList<>();

    public Website() {
        this.createWebsite();
    }

    public List<Page> getPages() {
        return pages;
    }

    public abstract void createWebsite();
}
