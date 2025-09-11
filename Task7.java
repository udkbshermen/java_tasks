import java.util.*;

public class Task7 {

    int Addition(int x, int y){
        return x+y;
    }

    int Subtract(int x, int y){
        return x-y;
    }

    int Multiply(int x, int y){
        return x*y;
    }

    int Divide(int x, int y){
        return x/y;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter operator (+, -, *, /) ");
        String operator = input.next();

        Task7 t7 = new Task7();

        if (operator.equals("+"))
            System.out.println(num1 + " + " + num2 + " = " + t7.Addition(num1,num2));

        else if (operator.equals("-"))
            System.out.println(num1 + " - " + num2 + " = " + t7.Subtract(num1,num2));
        
        else if (operator.equals("*"))
            System.out.println(num1 + " x " + num2 + " = " + t7.Multiply(num1,num2));

        else if (operator.equals("/"))
            System.out.println(num1 + " / " + num2 + " = " + t7.Divide(num1,num2));

        else System.out.println("Invalid Operator. Please try again.");
    }
}