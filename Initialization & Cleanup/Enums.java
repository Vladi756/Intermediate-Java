public class Enums {
    public enum Currency {                      // Declaring and Initializing an enum data type
        RSD, BGN, GBP, USD, EUR
    }
    
    public static void main(String[] args) {
        Currency money = Currency.USD;          
        for(Currency m: Currency.values()) {                            // Printing out every possible value of currency
            System.out.println(m + " ordinal " + m.ordinal());          // Ordinal means position of value in the enum.
        }
    }
}

/* Output:

RSD ordinal 0
BGN ordinal 1
GBP ordinal 2
USD ordinal 3
EUR ordinal 4

*/
