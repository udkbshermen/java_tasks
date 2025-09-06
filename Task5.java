import java.util.*;

public class Task5{
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        //inputs 3 numbers and add each on arraylist
        for (int i=0; i<3; i++){
            System.out.print(++i+"/3 Enter a number: ");
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();

            numbers.add(--i, num);
        }

        //sorts the array in ascending order
        Collections.sort(numbers);
        
        //checks if all numbers are equal, prints last index (largest) if not
        if (numbers.get(0).equals(numbers.get(1)) && numbers.get(0).equals(numbers.get(2)))
            System.out.println("All numbers are equal.");
        else
            System.out.println(numbers.get(2)+ " is the largest number.");
    }
}