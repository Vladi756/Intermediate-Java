public class This_in_Constructors {                             
    This_in_Constructors() {
        System.out.println("Hey.");
    }
    This_in_Constructors(String s) {
        this();                                     // Calls the constructor on line 2. 
        System.out.println("Hey" + s);
    }
    public static void main(String[] args) {
        This_in_Constructors a = new This_in_Constructors();
        This_in_Constructors b = new This_in_Constructors(", nice to meet you!");
    }
}                                                       

/* In the context of constructors, the "this" keyword functions a little differently than it does normally.
In constructors, this doesn't mean "this object" as it usually would, rather it makes an explicit call to the 
constructor which matches the argument list you gave it. In line 6 this has no arguments, and therefore it makes a 
call to the constructor with no arguments which is on lines 2 to 4. 

This is why the output is the following: 

Hey. --> First constructor
Hey.
Hey, nice to meet you!  --> Second constructor (because the first one is called in the 2nd one)
*/