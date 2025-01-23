//SCHIZO CODE: ARRAY OF ANY DATA TYPES

import java.util.ArrayList;
import java.util.*;

public class Wildcard {
    public static void main(String[] args) {
        ListManager listManagerObj = new ListManager();
        ArrayList<String> stringArray = new ArrayList<String>();
        listManagerObj.add(stringArray);
    }
}

class ListManager{
    List<List<? extends Object>> table;
    ListManager(){
        table = new ArrayList<List<? extends Object>>();
    }

    public <E> void add(ArrayList<E> arr){
        table.add(arr);
    }
}

/*
LOWER-BOUND WILDCARD
* ? extends className means that the current object, and any subclasses from the class the object is initialised from, can be used
* as a type in whatever the ? (wildcard operator) unknown placeholder type that exists at runtime.
* */

/*
UPPER-BOUND WILDCARD
* ? super className means that the current object, and any parent classes from the class the object is initialised from, can be used
* as a type in whatever the ? (wildcard operator) unknown placeholder type that exists at runtime.
* */