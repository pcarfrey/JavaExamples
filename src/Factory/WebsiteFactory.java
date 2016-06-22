package Factory;

/**
 * Created by pcarfrey on 6/21/16.
 *
 * <p>
 *     opposite of a Singleton, returns various instances
 *     parameter drive, solves complex creation, can choose type at run time
 * </p>
 */
public class WebsiteFactory {

    public static Website getWebsite(WebsiteTypeEnum siteType){
        switch(siteType) {
            case BLOG: {
                return new BlogWebsite();
            }

            case SHOP: {
                return new ShopWebsite();
            }

            default: {
                return null;
            }
        }

    }
}
