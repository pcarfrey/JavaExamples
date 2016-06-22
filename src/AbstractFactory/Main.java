package AbstractFactory;

/**
 * Created by pcarfrey on 6/21/16.
 * <p>
 *     group of similar factories
 *     abstract factory exposes multiple factories, hides the factories
 *     pattern within a pattern, problem specific
 *     built through composition
 * </p>
 */
public class Main {

    public static void main(String[] args) {

        int creditScore = 775;
        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(creditScore);
        CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);
        System.out.println(card.getClass());

        creditScore = 600;
        abstractFactory = CreditCardFactory.getCreditCardFactory(creditScore);
        CreditCard card2 = abstractFactory.getCreditCard(CardType.GOLD);
        System.out.println(card2.getClass());

    }
}
