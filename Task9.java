import static java.lang.Math.*;

public class Task9 {

    //math static methods
    public static int add(int a, int b){
        return Math.addExact(a,b);
    }

    public static int subtract(int a, int b){
        return Math.subtractExact(a,b);
    }

    public static int multiply(int a, int b){
        return Math.multiplyExact(a,b);
    }

    public static float divide(int a, int b){
        return Math.floorDiv(a,b);
    }

    public static void main(String[] args) {
        System.out.println("Addition: " + add(6,15));
        System.out.println("Subtraction: " + subtract(15,5));
        System.out.println("Multiplication : " + multiply(25,10));
        System.out.println("Division: " + divide(25,5));
    }
}
