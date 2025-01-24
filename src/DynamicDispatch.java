/*
* WHAT IS DYNAMIC DISPATCH?
* Dynamic Dispatch is the process of using polymorphism to select, which version of a method that has multiple definitions
* due to polymorphism, when the polymorphised method is called.
*
* To implement Dynamic Dispatch, inheritance is used...
*
*               ParentClass
*                   |
*          ---------------------
*         |                    |
*         v                   v
*     ChildClass1         ChildClass2
*
*  Methods in ParentClass are both inherited by ChildClass1 and ChildClass2. Without inheritance, this is not possible.
* */

public class DynamicDispatch {
    public static void main(String[] args){
        ParentClass parentObj1 = new ParentClass();
        ChildClass1 childObj1 = new ChildClass1();
        ChildClass2 childObj2 = new ChildClass2();

        ParentClass ref = new ParentClass(); //An object of ParentClass is created.
        ref.m1(); //It's version of m1() is called.

        ref = childObj1; /* Even though ref was originally initialised with a Data Type of Parent class, because ChildClass1 is it's
        child, the value of ref can be reassigned to an object of ChildClass1.

        This means that, instead of ParentClass version of m1() being called, the ChildClass1 version of m1() will now be called.
        */
        ref.m1();

        ref = childObj2; /*Same rule applies. ChildClass2 is a child of ParentClass, and so is ChildClass1, an object of
        ChildClass1 can be reassigned to become an object of ChildClass2.
        */
        /*
        UnrelatedClass1 unrelObj1 = new UnrelatedClass1();
        ref = unrelObj1;

        The above code will error because, for Dynamic Dispatch to work, the classes the objects are initialised from must...
        1) The current object is being reassigned to an object that is either the child or parent of the current object.
        2) The object being reassigned a new object share the same parent class.
         */
    }


}

class ParentClass{
    public void m1(){
        System.out.println("ParentClass.m1() called");
    }
}

class ChildClass1 extends ParentClass{
    public void m1(){
        System.out.println("ChildClass1.m1() called");
    }
}

class ChildClass2 extends ParentClass{
    public void m1(){
        System.out.println("ChildClass2.m1() called");
    }
}

class UnrelatedClass1{
    public void m1(){
        System.out.println("UnrelatedClass1.m1() called");
    }
}

class UnrelatedClass2{
    public void m1(){
        System.out.println("UnrelatedClass2.m1() called");
    }
}