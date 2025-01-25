/*
WHAT ARE EXCEPTIONS?
- Exceptions are a way to indicate that an error has occurred with a program. By using
  exceptions, a program can handle errors "gracefully" (in a controlled way that does not
  result in the program crashing/doing something unexpected.)

- Any exception, or specific exceptions, can be checked for using a catch conditional, allowing
  errors to be caught after some code has been tried.

WHEN DO EXCEPTIONS HAPPEN?
- When an error occurs, Java stops and generates an error message. The name of the error
  message is an Exception. The generation of an exception is referred to as THROWING
  an Exception.
* */

public class Exceptions {
    public static void main(String[] args){
        int x = 3;
        //Can throw some Exceptions if a conditional that you create is true.
        if(x > 2){
            //throw new ArithmeticException("AHHHH");
        }

        //Can also try to execute some code and, if an Exception occurs, it is caught:
        int[] xArray = new int[4];
        int i = 0;
        boolean isInBounds = true;
        while(i < 100 && isInBounds){
            try{
                xArray[i] = i + 1;
            }catch(Exception e){
                System.out.println("Index went out of bounds!");
                isInBounds = false;
            }
            i++;
        }

        /*
        * If an Exception is thrown, and is not handled using a catch conditional, the program will terminate. The program can only continue
        * if the Exception is handled.
        */
    }
}


