import java.util.Scanner;

public class NestedLoop07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double [][] temps = new double[5][7];

        for (int i = 0; i < temps.length; i++){
            System.out.println("City: " + i);
            for (int j = 0; j < temps[0].length; j++){
                System.out.print("Day " + (j + i) + ": ");
                temps[i][j] = scanner.nextDouble();
            }
            System.out.println();
        }

        for (int i = 0;  i < temps.length; i++){
            System.out.println("City: " + i);
            for (int j = 0; j < temps[0].length; j++){
                System.out.println(temps[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Displaying Temperatures (Using foreach):");
        for (int i = 0; i < temps.length; i++){
            System.out.println("City " + i + ":");
            for (double t : temps[i]){
                System.out.print(t + " ");
            }
            System.out.println();
        }

         System.out.println("\nAverage Temperature for Each City:");
        for (int i = 0; i < temps.length; i++){
            double sum = 0;
            for (double t : temps[i]){
                sum += t;
            }
            double average = sum / temps[i].length;
            System.out.println("City " + i + " average: " + average);
        }
    }
}

    
    

