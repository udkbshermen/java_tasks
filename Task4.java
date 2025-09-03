import java.util.Scanner;

public class Task4{
    public static void main(String[] args) {

        System.out.println("Enter a word to check if palindrome: ");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        StringBuilder sb = new StringBuilder(word); //used a string builder to use reverse()
        String word2 = sb.reverse().toString();

        if (word.equalsIgnoreCase(word2)) //used equals() to compare
            System.out.println("The input string is a palindrome.");
        else
            System.out.println("The input string is not a palindrome.");
    }
}