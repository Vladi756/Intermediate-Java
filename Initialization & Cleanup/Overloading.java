public class Overloading {                              // This program shows what overloading a constructor or method is.
    static class Dog {
        Dog() {                                         // Default constructor with no arguments.
            System.out.println("I am a dog.");
        }
        Dog(String i) {                                 // Constructor with argument String i
            System.out.println(i + " and I am a dog");  // When this constructor is used, it's argument is also printed.
        }
        void bark() {
            System.out.println("Bark Bark");            // First version of a method.
        }
        void bark(String s) {
            System.out.println(s + " Bark Bark");       // Overloaded method with the same name returns something different.
        }
    }
            
    public static void main(String[] args) {            // Main function
        Dog g1 = new Dog();                             // Declaring a dog object with name g1 using the default constructor.
        System.out.println("Overloaded constructor:");
        Dog g2 = new Dog("My name is Scruffy");         // Declaring a dog object with name g1 using overladed constructor - this time with an argument.
        g1.bark();                                      // Calling method bark on g1.
        System.out.println("Overloaded method:");
        g1.bark("Woof woof");                           // Calling overloaded method bark on g1 - this time with an argument.
        g2.bark();                                      // Same thing we did for g1 we do for g2, normal and overloaded methods are both called. 
        System.out.println("Overloaded method:");
        g2.bark("Woof woof");
    }
}                                                       
 /* The reason Java can differentiate between methods and constructors of the same name is by looking at their arguments - different arguments tell Java that they're not 
the same thing. Even if just the order of arguments is switched around (in the case that there are multiple arguments) Java could still figure out which one's which. 

Output of the program: 

I am a dog.
Overloaded constructor:
My name is Scruffy and I am a dog
Bark Bark
Overloaded method:
Woof woof Bark Bark
Bark Bark
Overloaded method:
Woof woof Bark Bark
