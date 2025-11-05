import java.util.Scanner;

public class WhileMultiples07 {
    public static void main(String[] args) {
        System.out.println("input the multiple");
        Scanner input = new Scanner(System.in);

        int multiple, sum = 0,counter = 0;
        double average;
        multiple = input.nextInt();

        int i = 1;
        while (i <= 50){
            i++;
            if(i % multiple == 0) {
                sum = sum + i;
                counter++;
            }
        }

        average = (double) sum / counter;

        System.out.printf("There are %d number that are multiple of %d in range 1 to 50.\n", counter, multiple);
        System.out.printf("The sum of all multiples of %d in range 1 to 50 is %d. \n", multiple, sum);
        System.out.println("average :" + average);
    }
    
}
