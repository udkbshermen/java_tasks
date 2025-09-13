import java.util.*;

public class Task8{

    static int[] cumulativeSum(int[] arr){
        int[] result = new int[arr.length];
        for (int i=0; i<arr.length; i++){
            
        }

        return result;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers will you enter? ");
        int size = input.nextInt();

        int arr[] = new int[size];
        
        for (int i=0; i<size; i++){
            System.out.print("Enter number " + ++size);
            arr[i] = input.nextInt();
        }

    }
}