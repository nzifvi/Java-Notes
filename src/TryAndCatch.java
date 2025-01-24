import java.util.Scanner;

/*
* WHAT IS TRY AND CATCH?
* Try and Catch allows for a block of code to be tried and, if an exception is thrown due to the block of code throwing one,
* the catch statement executes. If there is no exception thrown when trying the block of code, the catch does not trigger.
*
* In the catch area, the following approaches can be taken:
* 1) Something is done to cause the try statement to re-execute (nest the try and catch in a while loop that only
*    exits if the try does not throw an exception.
*
* 2) If it is a variable having a certain value that causes the issue, you can manually set it yourself.
*
* 3) Actions for specific Exceptions, such as buffer contamination, can be handled: allowing the program to continue safely.
*
*
* WHAT ARE EXCEPTIONS?
* Exceptions are a way to detect that something has gone wrong when a piece of code has been run. An exception is thrown:
* throw new ExceptionType("somethingToPrintToConsole");
*
* No matter where in the program an exception is thrown, it is thrown on a global level: allowing a try and catch to detect
* the thrown exception even if it is in a higher scope than where the Exception was thrown.
* */

public class TryAndCatch {
    public static void main(String[] args) {
        Input inputObj = new Input();
        System.out.println(inputObj.takeInput());
    }
}

class Input{
    final private Scanner scanObj = new Scanner(System.in);
    int number;
    public int takeInput() throws ArithmeticException {
        boolean isValidated = false;
        while(!isValidated){
            try{
                System.out.print("Enter an integer: ");
                number = scanObj.nextInt();
                checkAge(number);
            }catch(Exception e){
                System.out.println("wrong");
                takeInput();
            }finally{
                isValidated = true;
            }
        }
        return number;
    }

    /*
    * WHAT IS FINALLY?
    * Finally is an additional conditional branch that comes after the catch conditional.
    *
    * try {
    *     //try the code
    * }catch(Exception e){
    *     //handle the Exception, if it can be at all.
    * }finally{
    *     //once the catch conditional finishes, or if it never executed, the code nested in the finally condition is
    *      executed.
    *  }

   This means that, if the catch conditional doesn't cause the nested code to execute, it will go straight to the finally conditional.
   If the catch conditional does cause the nested code to execute (i.e. an Exception has been thrown), the nested code of the finally conditional
   will execute after the nested code of the Catch conditional finishes executing.
     */

    final public void checkAge(int arr){
        if(arr > 0 && arr < 10) {
            throw new ArithmeticException("AHHHHHHHHH");
        }
    }
}
