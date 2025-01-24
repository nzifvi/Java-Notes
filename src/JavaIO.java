/*
Java IO package has multiple streams that are used to perform all input-output
operations.

- The streams support all types of objects, data-types, characters, and files to
  fully implement all IO operations.

- Java provides 3 standard, aka default, streams that are most commonly used:
    1) System.in
    2) System.out
    3) System.err
*/

public class JavaIO {
    //System.in
    public  void systemInExample(){
        /*
        System.in is the standard input stream.

        It is used to read in data from the keyboard or any other
        standardised input device.
        * */
    }

    public void systemOutExample(){
        /*
        System.out is the standard output stream.

        It is used to output data to the console. The data is passed as a
        parameter to a method which is a member of System.in

        System.out has multiple methods to output to the stream
         */

        //1) .print()
        System.out.print(2); //Prints and keeps on the same line.

        //2) .println()
        System.out.println(2); //Prints and, after parameter is printed, moves to new line.

        //3) .printf()

        /*
        printf() works like c and, unlike print() and println() can take multiple arguments.
        */

        //System.out.printf()
    }


}
