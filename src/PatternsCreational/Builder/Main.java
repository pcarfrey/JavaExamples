package PatternsCreational.Builder;

/**
 * Created by pcarfrey on 6/19/16.
 */
public class Main {
    public static void main(String arg[]) {
        LunchOrder.Builder builder = new LunchOrder.Builder();
        builder.bread("Wheat").condiments("Lettuce").dressing("Mayo").protein("Turkey");

        LunchOrder lunchOrder = builder.build();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getProtein());
    }
}
