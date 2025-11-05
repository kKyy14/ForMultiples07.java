import java.util.Random;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        char menu = 'Y';
        do {
            int number = rand.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.println("Guest the number (1-10): ");
                int answer = input.nextInt();
                input.nextLine();
                success = (answer == number);

                if (answer < number){
                    System.out.println("answer smaller than number");
                } else if (answer > number){
                    System.out.println("answer greater than number");
                }else{
                    System.out.println("answer correct");
                }
                System.out.println();
            } while (!success);
            System.out.println("Do you want to repeat the game (Y/N) ");
            menu = input.next().charAt(0);
            input.nextLine();
        }while (menu == 'Y' || menu == 'y');
    }
    
}