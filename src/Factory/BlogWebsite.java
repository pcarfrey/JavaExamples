package Factory;

/**
 * Created by pcarfrey on 6/21/16.
 */
public class BlogWebsite extends Website {

    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}
