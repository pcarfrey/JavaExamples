package AbstractFactory;

/**
 * Created by pcarfrey on 6/21/16.
 * <p>
 *     AbstractFactory
 * </p>
 */
public abstract class CreditCardFactory {

    public static CreditCardFactory getCreditCardFactory(int creditScore) {

        if(creditScore > 650) {
            return new AmexFactory();
        } else {
            return new VisaFactory();
        }
    }

    public abstract CreditCard getCreditCard(CardType cardType);

    public abstract Validator getValidator(CardType cardType);
}
