public class GenericTypes {
    public static void main(String[] args){
        AbstractDataType<Integer> dataObj = new AbstractDataType<Integer>(1);
        /*
        * A generic type cannot be a primitive data type, it must be an object. If wanting to use a primitive data type,
        * use the wrapper equivalent and unbox (convert from Wrapper to primitive) it later.
        * */
        int x = 2;
        ExampleClass.setMethod(x);
    }
}

//CLASSES AND GENERIC TYPES
class AbstractDataType<E>{
    private E arr;

    /*
    * Can use generic types to create a generic parameter.
    * */
    public AbstractDataType(E e){
        arr = e;
    }

    /*
    * Can use generic types to create a generic return.
    * */
    E getArr(){
        return arr;
    }

    /*
    * When object of class using generic type is being initialised, the data type the generic type becomes MUST
    * be specified.
    *
    * className<dataType> objectName = new className<dataType>();
    * */
}

//GENERIC METHODS
class ExampleClass{
    public static <E> void setMethod(E e){
        /*
        * Can use generic types with methods to have a datatype of a parameter be determined by the datatype of the parameter
        * passed when the function is called.
        * */

        /*public static <E> E getMethod(E value){
            return value;
        }*/
        //NOT SURE IF GENERIC TYPE RETURN VALUES FOR METHODS IS ALLOWED
    }
}
