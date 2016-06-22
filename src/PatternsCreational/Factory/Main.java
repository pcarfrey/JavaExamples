package PatternsCreational.Factory;

/**
 * Created by pcarfrey on 6/21/16.
 */
public class Main {

    public static void main(String[] args) {
        Website site = WebsiteFactory.getWebsite(WebsiteTypeEnum.BLOG);
        System.out.println(site.getPages());

        site = WebsiteFactory.getWebsite(WebsiteTypeEnum.SHOP);
        System.out.println(site.getPages());
    }
}
