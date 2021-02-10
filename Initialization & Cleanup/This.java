public class This {
        int i = 0;
        This increment() {                                
            i++;
            return this;            // "This" keyword returns the reference to the current object it is in 
        }
    void print() {
        System.out.println("i = " + i);
    }
    public static void main(String[] args) {
        This test = new This();
        test.increment().increment().increment().print();   // Increment() returns the reference of the object it is currently in by using the "This" keyword.                                                            
    }                                                       // Because of this, a number of operations can be used on it.
}

/* To recap quickly, "This" is a keyword in Java which is used to pass the reference of the current object it is in.
It can be used in a plethora of different ways, including but not limited to: referencing the current object, passing
the current object into another method, as well as many more.*/