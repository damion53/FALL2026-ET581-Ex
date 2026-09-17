import java.util.Scanner;

import java.util.StringTokenizer;
public class TokenizerHomework {
    public static void main(String[] agrs){

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter two words: ");
    String input = scanner.nextLine();

    StringTokenizer tokenizer = new StringTokenizer(input);
    String firstWord = tokenizer.nextToken();
    String secondWord = tokenizer.nextToken();

    System.out.println("First word: " + firstWord);
    System.out.println("Second word: " + secondWord);

    System.out.print("Enter a seperator (+, -, ): ");
    String seperator = scanner.nextLine();

    if (seperator.equals("+") || seperator.equals("-") || seperator.equals("")){
        System.out.println("Concatenated string: " + firstWord + seperator + secondWord);
    
    } else {
        System.out.println("Not valid seperator. ");
    
    }
   
  }

}
