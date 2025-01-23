public class DefaultMethodsInInterfaces {
    /*public static void main(String[] args){

    }*/
}

interface blueprintClass{
    default void function(){
        System.out.println("function");

        /*
        * Default allows for an abstract method to have a body (definition) that can be later overridden, using @Override on the line above the function re-definition, by a class
        * which implements the interface.
        * */
    }

    void secondFunction();

    /*
    * Without default, you can only declare an abstract method (provide no body right now).
    *
    * An abstract method, that has no default keyword, does not need to be overridden as there is no body.
    *
    * However, it is best to override any method from an interface in case it does have a body. If there is no definition, override just
    * adds a body. If there is a definition, override adds the body. It is safer to just override no matter what.
    * */
}
