public class ExplainingBlueprintClasses {
    public static void main(String[] args){
        Animal dogObj = new Dog(); //Dynamic dispatch

        Animal.m2("ahhhhhhh"); /*Public static methods of a blueprint class accessible without
        implementing the blueprint class*/

        dogObj.m1();
    }
}


interface Animal{ //Interface used to create a blueprint class
    void m1(); //Public abstract method (no body)

    static void m2(String arr){ //Public static method (isn't abstract, must have body)
        System.out.println(arr);
        System.out.println(m3()); //Can call other static methods from a static method, even if private.
    }

    private static int m3(){
        return 1; /*Private used to have static classes only accessible by
        other static classes in a blueprint class*/
    }

    //cannot store variables, only abstract classes or public / private static methods.
    //use static methods to process and return inputs only.
}

//Blueprint class abstract, static (pu

class Dog implements Animal{
    int arr;//
    public void m1(){
        Animal.m2("hello"); //Can call blueprint public static methods anywhere.
    }
}
