import java.util.*;

public class Task8{

    //cumulative sum method
    static int cumulativeSum(int[] arr){
        int result = 0;
        //loop each input element
        for (int i=0; i<arr.length; i++){ 
            int inresult = 0;
            //loop add ascending value of the current element
            for (int j=0; j<=arr[i];j++){
                inresult += j;
            }
            //add each cumulative sum of each input element to result variable
            result += inresult;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //enter input quantity which will server as array size
        System.out.print("How many numbers will you enter? ");
        int size = input.nextInt();

        int arr[] = new int[size];
        
        //input loop for the array base the size previously input
        for (int i=0; i<size; i++){
            System.out.print("Enter number " + ++i + ": ");
            arr[--i] = input.nextInt(); //add each input into array
        }

        //call cumulativeSum method and print return value
        System.out.println("The overall cumulative sum of your input is " + cumulativeSum(arr));

    }
}