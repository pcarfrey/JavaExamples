package PatternsCreational.AbstractFactory;

/**
 * Created by pcarfrey on 6/21/16.
 */
public class VisaFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new VisaGoldCreditCard();
            case PLATINUM:
                return new VisaBlackCreditCard();
            default:
                return null;
        }
    }

    @Override
    public Validator getValidator(CardType cardType) {
        return new VisaValidator();
    }
}
