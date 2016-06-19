package Builder;

/**
 * Created by pcarfrey on 6/19/16.
 * <p>
 * provides flexibility of bean approach
 * provides immutability and contract nature of telescopic constructor approach
 * </p>
 */
public class LunchOrder {

    public static class Builder {
        private String bread;
        private String condiments;
        private String dressing;
        private String protein;

        public Builder() {

        }

        public Builder bread(String bread) {
            this.bread = bread;
            return this;
        }

        public LunchOrder build() {
            return new LunchOrder(this);
        }

        public Builder condiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

        public Builder dressing(String dressing) {
            this.dressing = dressing;
            return this;
        }

        public Builder protein(String protein) {
            this.protein = protein;
            return this;
        }
    }

    private final String bread;
    private final String condiments;
    private final String dressing;
    private final String protein;

    private LunchOrder(Builder builder) {
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressing = builder.dressing;
        this.protein = builder.protein;
    }

    public String getBread() {
        return this.bread;
    }

    public String getCondiments() {
        return this.condiments;
    }

    public String getDressing() {
        return this.dressing;
    }

    public String getProtein() {
        return this.protein;
    }
}