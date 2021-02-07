public class While_Loop {
    static boolean condition() {
       boolean result = Math.random() < 0.99;                // "Result" is a boolean so it can only
       System.out.println(result + ", ");                    // return true or false. A random boolean is true 70% of the time
       return result;                                        // and therefore false the remaining 30% of the time.
    }
    
    public static void main(String[] args) {
        while(condition())                                   // This means: While condition() evaluates to "true" exectute the body of the loop
            System.out.println("Inside the while loop.");    // Returns so long as condition() evaluates to true
        
        System.out.println("Outside of the while loop.");    // Returns when condition() evaluates to false
    }
}