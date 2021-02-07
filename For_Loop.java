import java.util.concurrent.ThreadLocalRandom;                                  // Methods from this library are used on lines 8 and 9.

public class For_Loop {
    public static void main(String[] args) {
        
        for(int c = 0; c < 25; c++)                                             // For loop makes its body execute 25 times
        {
            int random1 = ThreadLocalRandom.current().nextInt(0,  101);         // Two random numbers generated in each itteration
            int random2 = ThreadLocalRandom.current().nextInt(0,  101);
            if(random1 > random2)                                               // If statemen nested within for loop
                System.out.println(random1 + " is greater than " + random2);
            else 
                System.out.println(random1 + " is less than " + random2);       // The if statement returns the results accordingly
        }
    }
}