package DZoneCodeChallengeChemicalSymbol;

/**
 * Created by pcarfrey on 8/9/16.
 */
public class SymbolChecker {
            boolean isValidChemicalSymbol(String chemicalName, String chemicalSymbol) {

                boolean isValid = false;

                if(chemicalName.matches("[a-zA-Z][a-z]+") && chemicalSymbol.matches("[a-zA-Z][a-z]")) {
                    
                    char firstLetter = chemicalSymbol.toLowerCase().charAt(0);
                    char secondLetter = chemicalSymbol.charAt(1);

                    int indexOfFirstLetter = chemicalName.toLowerCase().indexOf(firstLetter);
                    int indexOfSecondLetter = chemicalName.indexOf(secondLetter, indexOfFirstLetter + 1);

                    if (indexOfFirstLetter < indexOfSecondLetter) {
                        isValid = true;
                    }
                }

                return isValid;
            }

}


