public class GenericTypes {
    public static void main(String[] args){
        AbstractDataType<Integer> dataObj = new AbstractDataType<Integer>(1);
        /*
        * A generic type cannot be a primitive data type, it must be an object. If wanting to use a primitive data type,
        * use the wrapper equivalent and unbox (convert from Wrapper to primitive) it later.
        * */
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

