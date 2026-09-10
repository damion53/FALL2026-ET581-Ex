    import java.util.Scanner;
    public class ArithmeticOperations{
        public static void main(String [] args){
            Scanner input = new Scanner(System.in);

            System.out.println("Enter Score 1: ");
            int score1 = input.nextInt();

            System.out.println("Enter Score 2: ");
            int score2 = input.nextInt();

            System.out.println("Enter Score 3: ");
            int score3 = input.nextInt();


            double average = (score1 + score2 + score3) / 3.0;

            System.out.println("Average Score: " + average);

            input.close();
        }
    }