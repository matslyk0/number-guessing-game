import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner user_input = new Scanner(System.in);

        int attempts = 0;
        int guess;
        int number = random.nextInt(10)+1;

        do{
            attempts++;
            System.out.print("Please enter a number: ");
            guess = user_input.nextInt();

            if (guess==number) {
                System.out.println("Well done!");
            }
            else if (guess > number) {
                System.out.println("Too high!");
            }
            else {
                System.out.println("Too low!");
            }

        }while(number != guess);

        System.out.printf("That took %d attempts!", attempts);

    }

}