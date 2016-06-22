package AbstractFactory;

/**
 * Created by pcarfrey on 6/21/16.
 */
public class AmexPlatinumValidator implements Validator{

    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
