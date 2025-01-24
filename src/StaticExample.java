public class StaticExample{
    //STATIC VARIABLES:
    private static int x;
    /*
    * A class variable, with the static keyword applied, belongs to the class and not any object of the class. That means that, across
    * all objects, a static variable will have the same value and, if operated on by any of the objects, the value changes for all objects.
    * */

    //STATIC METHODS:
    public static void printSomething(){
        System.out.println("static method called");
    }
    /*
    * A static method is a method that belongs only to the class. It does not require any object to become initialised, it already exists before
    * an object of the class is initialised.
    *
    * Because non-static variables, methods, and inner classes only become "real" when an Object of the Class is created, a static method
    * cannot access non-static variables, methods, and inner classes.
    *
    * A static method can be called, anywhere in a program, without having to initialise an Object of the class. All you have to do is access it using the
    * class' name.
    * In this case, to call printSomething, you would...
    * 1. StaticExample.printSomething();
    * */

    //STATIC CLASSES:
    public static class InnerClass{
        int x;
        int y;
        InnerClass(){
            x = 0;
            y = 0;
        }
    }
    /*
    * An inner class (a class nested within another), if it uses the static keyword, belongs to the outer class and NOT an object of the outer class.
    * What that means is that you do not need to initialise an object of the outer class to initialise an object of the inner class in the program. However,
    * the inner static class cannot access anything besides itself or any static methods from the outer class.
    *
    * COMPARISON:
    * 1) WITHOUT INNER CLASS BEING STATIC
    *     1. StaticExample outerObj1 = new StaticExample();
    *     2. StaticExample.InnerClass innerObj1 = new outerObj1.new InnerClass();
    *
    * 2) WITH INNER CLASS BEING STATIC:
    *     1. StaticExample.InnerClass innerObj1 = new StaticExample.InnerClass()
    * */
}
