public class Switch_Statement {
    public static void main(String args[]) {
        int c;
        for(c = 1; c <= 3; c++) {                                       // For loop from c = 1 to <= 3 - 3 iterations
            switch(c) {                                                 // Switch statement checks the value of c
                case 1:                                                 // The body of thise case will be run if the value of c is 1 
                    System.out.println("This is the first case.");      // Body of the case.
                    break;                                              // The break statement breaks out of the loop it's currently in (the switch statement in this case).
                case 2:
                    System.out.println("This is the second case.");
                    break;
                case 3:
                    System.out.println("This is the third case. ");
            }  
        }
        System.out.println("This is outside of the switch statement.");  // Since it is outside the for loop, this is only printed once -
    }                                                                    // after the for loop finishes iterating through c.
}


/* The output is: 
This is the first case.
This is the second case.
This is the third case. 
This is outside of the switch statement */
