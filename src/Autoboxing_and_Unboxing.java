/*
* PRIMITIVE vs WRAPPER TYPES:
* In Java, each data type (int, char, byte, double...) has an equivalent class that can be used to represent the same value of the
* data type. The class has methods which allow various things to be done as well.
*
* Primitive | Wrapper
* --------------------
* int       | Integer
* char      | Character
* n/a       | String
* ... (more exist)
*
* WHAT IS AUTOBOXING?
* Autoboxing is the process of converting a primitive datatype into it's Wrapper equivalent.
* 1. int x = 2; //Suppose you have an int datatype and you want to have it as a Wrapper instead.
* 2. Integer xObj = x;
* 3.
*
* WHAT IS UNBOXING?
* Unboxing is the reverse of autoboxing. You convert a Wrapper back into a primitive datatype.
* 1. Integer xObj = 2; /Suppose you have an Integer wrapper but you want it as a primitive int instead.
* 2. int x = xObj.intValue();
* 3.
* */

public class Autoboxing_and_Unboxing {
    public static void main(String[] args) {
        Integer xObj = 2;
        int x = xObj.intValue();
        System.out.println(x);
    }
}

/*
* WHY USE WRAPPERS INSTEAD OF PRIMITIVES
* 1. Generic types do not allow primitive types, they only allow classes.
* 2. Any data structure you get from a library (ArrayList, etc etc) will want an Object, not a primitive type, as they
*    use generic types.
* 3. With wrappers, you can test if a wrapperObj == null (i.e. nothing has been initialised during input or by the program),
*    you cannot do this with primitive types.
* */