//Cannot use normal classes for multiple inheritance, can only use blueprint classes to do multiple inheritance.

public class MultipleInheritance {
    /*
    public static void main(String[] args){
        catdog catdogObj = new catdog();
        catdogObj.makeNoise();
    }
    */
}

interface MultipleInheritanceDog{
    default void makeNoise(){
        System.out.println("bark");
    }
}

interface MultipleInheritanceCat{
    default void makeNoise(){
        System.out.println("meow");
    }
}

interface MultipleInheritanceBird{
     default void makeNoise(){
        System.out.println("brown");
    }
}

class catdog implements MultipleInheritanceDog, MultipleInheritanceCat, MultipleInheritanceBird{ /*

to do multiple inheritance, you must implement multiple blueprint classes (interfaces). However, you can only "inherit"
methods as no variables can be stored in blueprint classes.

*/
    @Override //Override allows an already defined method to be re-defined with a new definition later on.
    public void makeNoise(){
        MultipleInheritanceCat.super.makeNoise(); //from parent cat blueprint class
        MultipleInheritanceDog.super.makeNoise(); //from parent dog blueprint class
        MultipleInheritanceBird.super.makeNoise(); //from parent bird blueprint class.

        /*
        * By doing multiple inheritance, you can access multiple different definitions of a method from ALL of the parent
        * blueprint classes.
        *
        * */

        System.out.println("barkmeow");
    }
}
