public class Nested_For_Loop {
    public static void main(String[] args) {
	for(int i = 1; i < 1000; i++ ) {                    // Outter for loop determines the range of numbers the program outputs.
            int factors = 0;                                // The number of factors determines whether a number is prime or not, less than 2 = prime.
            for(int j = 1; j < (i + 2)/2; j++ ) {           // Inner for loop tests the number to find out how many factors it has.
		if((i % j) == 0) factors++; 			
            }
		if(factors < 2)                             // Less than 2 factors mean a number is prime (counting starts at 0).
                    System.out.println(i + " is prime");
	}
    }
}
