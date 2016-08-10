package DZoneCodeChallengeChemicalSymbol;

/**
 * Created by pcarfrey on 8/9/16.
 */
public class ChemicalSymbolNamingPartOne {
    public static void main(String[] args) {

        class SymbolChecker {
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

        SymbolChecker symbolChecker = new SymbolChecker();

        System.out.println("Valid Chemical Symbols");
        System.out.println(symbolChecker.isValidChemicalSymbol("Spenglerium", "Ee"));
        System.out.println(symbolChecker.isValidChemicalSymbol("Zeddemorium", "Zr"));
        System.out.println(symbolChecker.isValidChemicalSymbol("Venkmine", "Kn"));
        System.out.println(symbolChecker.isValidChemicalSymbol("Lithium", "Li"));
        System.out.println(symbolChecker.isValidChemicalSymbol("Silver", "Vr"));
        System.out.println(symbolChecker.isValidChemicalSymbol("Magnesium", "Ma"));
        System.out.println(symbolChecker.isValidChemicalSymbol("Magnesium", "Am"));
        System.out.println(symbolChecker.isValidChemicalSymbol("Zenon", "Nn"));

        System.out.println(symbolChecker.isValidChemicalSymbol("aa", "aa"));
        System.out.println(symbolChecker.isValidChemicalSymbol("Aa", "aa"));
        System.out.println(symbolChecker.isValidChemicalSymbol("aa", "Aa"));
        System.out.println(symbolChecker.isValidChemicalSymbol("Aa", "Aa"));

        System.out.println("Invalid Chemical Symbols");
        System.out.println(symbolChecker.isValidChemicalSymbol("Stantzon", "Zt"));
        System.out.println(symbolChecker.isValidChemicalSymbol("Melintzum", "Nn"));
        System.out.println(symbolChecker.isValidChemicalSymbol("Tullium", "Ty"));
        System.out.println(symbolChecker.isValidChemicalSymbol("Silver", "Rv"));
        System.out.println(symbolChecker.isValidChemicalSymbol("Mercury", "Hg"));
        System.out.println(symbolChecker.isValidChemicalSymbol("Xenon", "Xx"));

        System.out.println(symbolChecker.isValidChemicalSymbol("aa", "a"));
        System.out.println(symbolChecker.isValidChemicalSymbol("a", "aa"));
        System.out.println(symbolChecker.isValidChemicalSymbol("a", "a"));
        System.out.println(symbolChecker.isValidChemicalSymbol("aA", "aa"));
        System.out.println(symbolChecker.isValidChemicalSymbol("aa", "aA"));
        System.out.println(symbolChecker.isValidChemicalSymbol("aA", "aA"));
        System.out.println(symbolChecker.isValidChemicalSymbol("aa", "a"));
        System.out.println(symbolChecker.isValidChemicalSymbol("aa", "aaa"));

        /*
            Output:

            Valid Chemical Symbols
            true
            true
            true
            true
            true
            true
            true
            true
            true
            true
            true
            true
            Invalid Chemical Symbols
            false
            false
            false
            false
            false
            false
            false
            false
            false
            false
            false
            false
            false
            false
         */

    }
}


