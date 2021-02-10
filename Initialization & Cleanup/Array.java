public class Array {
    public static void main(String[] args) {
        int[] g1 = {1, 2, 3, 4, 5, 6};          // Initializing array to constant values
        int[] g2;                               // Declaring an array
        g2 = g1;                                // Initializing array to another array
        
        for(int i = 0; i < g2.length; i++) {
            g2[i] = g1[i] * 2;                  // Multiplies of 2nd array.
        }
        for(int i = 0; i < g1.length; i++) {
            System.out.println("g1[" + i + "] = " + g1[i]); // Prints values of first array
        }
    }   
}
/* The values of the 1st array are changed even thought ther weren't directly manipulated. Both reference the same 
chunk of memory, and therefore when one is manipulated, the effect also applies to the other array. 

Output:
g1[0] = 2
g1[1] = 4
g1[2] = 6
g1[3] = 8
g1[4] = 10
g1[5] = 12 */