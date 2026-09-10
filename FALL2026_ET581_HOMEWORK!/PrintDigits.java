    import java.util.Scanner;
    public class PrintDigits{
        
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a 4-digit integer: ");
            int number = input.nextInt();

            int firstDigit = number / 1000;
            int secondDigit = (number / 100) % 10;
            int thirdDigit = (number / 10) % 10;
            int fourthDigit = number % 10;

            System.out.println("first digit: " + firstDigit);
            System.out.println("second digit: " + secondDigit);
            System.out.println("third digit: " + thirdDigit);
            System.out.println("fourth digit: " + fourthDigit);

            input.close();

        }
    }