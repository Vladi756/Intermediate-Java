class Test {                
	String s1;                          		// 's1' is unintialized - therefore Java will initialize this to null.
	String s2 = "hello";                		// 's2' is initialized to hello at the point of definition.
	String s3;  
	Test() {                            		// This is a constructor - and it initializes 's3'. 
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

/* Output: 
t.s1: null
t.s2: hello
t.s3: good-bye */ 

/* No variable can ever be completely uninitialized in Java. Unlike C, when the progrmamer forgets to initialize a variable, Java simply initializes it for him by default, Java initialies the variable to "null", this is why, when outputted, t.s1 is "null". 's2' is quite straightforward - it is declared and initalized on line 3, all in one go. Finally, t.s3 uses a constructor, namely : Test(). A constuctor is a built in method in Java which is used to initialize any uninitialized variable. This is called a default constructor as it takes no arguments (constructors can also take arguments). Java does all this behind the scenes in order to guarantee initialization - however we as programmers can also manually call the constructor - as is the case with s3. */
