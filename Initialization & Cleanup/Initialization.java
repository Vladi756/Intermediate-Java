class Test {                
	String s1;                          // s1 is unintialized - therefore Java will initialize this to null.
	String s2 = "hello";                // s2 is initialized to hello at the point of definition.
	String s3;  
	Test() {                            // This is a constructor - and it initializes s3. 
            s3 = "good-bye"; 
        }
}

public class Initialization {
	public static void main(String[] args) {
		Test t = new Test();                    // Creates a new object with class "Test".
		System.out.println("t.s1: " + t.s1);    
		System.out.println("t.s2: " + t.s2);
		System.out.println("t.s3: " + t.s3);    // Outputting all 3 strings of 't'.
	}
}