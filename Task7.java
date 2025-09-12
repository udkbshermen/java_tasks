import java.util.*;

public class Task7 {

    //operator methods
    int Addition(int x, int y){
        return x+y;
    }

    int Subtract(int x, int y){
        return x-y;
    }

    int Multiply(int x, int y){
        return x*y;
    }

    float Divide(float x, float y){
        return x/y;
    }
    public static void main(String[] args) {
        int num1, num2; String operator;

        Scanner input = new Scanner(System.in);

        //first number input validation loop (for non-int input)
        while(true){
            System.out.print("Enter first number: ");
            if (input.hasNextInt()){
                num1 = input.nextInt();
                break;
            } else{
                System.out.print("Invalid input. Please try again. ");
                input.next();
            }
        }

        //second number input validation loop (for non-int input)
        while(true){
            System.out.print("Enter second number: ");
            if (input.hasNextInt()){
                num2 = input.nextInt();
                break;
            } else{
                System.out.print("Invalid input. Please try again. ");
                input.next();
            }
        }

        Task7 t7 = new Task7();

        //operator input validation loop for non-string and call operation methods to calculate
        while (true) {
            System.out.print("Enter operator (+, -, *, /): ");
            operator = input.next();

            if (operator.equals("+")) {
                System.out.println(num1 + " + " + num2 + " = " + t7.Addition(num1,num2));
                break;
            } else if (operator.equals("-")) {
                System.out.println(num1 + " - " + num2 + " = " + t7.Subtract(num1,num2));
                break;
            } else if (operator.equals("*")) {
                System.out.println(num1 + " x " + num2 + " = " + t7.Multiply(num1,num2));
                break;
            } else if (operator.equals("/")) {
                System.out.println(num1 + " / " + num2 + " = " + t7.Divide((float)num1,(float)num2));
                break;
            } else {
                System.out.print("Invalid operator. Please try again. ");
            }
        }

}
}