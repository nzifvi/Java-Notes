import java.util.Scanner;

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

    final public void checkAge(int arr){
        if(arr > 0 && arr < 10) {
            throw new ArithmeticException("AHHHHHHHHH");
        }
    }
}
