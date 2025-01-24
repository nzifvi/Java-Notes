public class FinalExample {
    //FINAL VARIABLES & OBJECTS:
    final int x = 2;
    /*
    When the final keyword is used on a variable, or object, that means it cannot be reassigned a value, anywhere else, later on.

    - When declaring a final variable, it must be assigned a value there and then, otherwise a syntax error occurs.
    */

    //FINAL METHODS
    final int getSquare(int arr){
        return arr * arr;
    }
    /*
    * When the final keyword is applied to a method, it means that no child class of the class the final method is in
    * can override it using @Override.
    */

    //FINAL CLASSES:
    /*
    When the final keyword is applied to a class, it means that no class can inherit from it.
    */
}

/*
WHEN TO USE FINAL KEYWORD
1) If you do not want a variable/object to be reassigned a value once it is assigned one.

2) If you do not want a child class to override, using @Override, a method from the parent class.

3) If you do not want a class to be inherited from.

WHY USE FINAL?
1) Can ensure that a method, from a parent class, cannot be changed and will operate
   the same no matter what child object calls it.

2) Prevents accidental overrides of methods.

3) JVM may optimise calling a final method better as it knows that, since the method is final,
   it cannot be overridden.
* */