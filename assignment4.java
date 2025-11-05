import java.util.Scanner;

public class assignment4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] athletes = new String[4][5];
        String[] sports = {"Badminton", "Table Tennis", "Basketball", "Volleyball"};

        for(int i = 0; i < sports.length; i++) {
            System.out.println("Enter the names of 5 athletes for " + sports[i] + ":");
            for(int j = 0; j < 5; j++) {
                System.out.print("Athlete " + (j+1) + ": ");
                athletes[i][j] = input.nextLine();
            }
            System.out.println();
        }

        for(int i = 0; i < sports.length; i++) {
            for(int j = 0; j < 5 - 1; j++) {
                for(int k = j + 1; k < 5; k++) {
                    if(athletes[i][j].compareToIgnoreCase(athletes[i][k]) > 0) {
                        String temp = athletes[i][j];
                        athletes[i][j] = athletes[i][k];
                        athletes[i][k] = temp;
                    }
                }
            }
        }

        System.out.println("\n=== ATHLETE LIST ===");
        for(int i = 0; i < sports.length; i++) {
            System.out.println("\nSport: " + sports[i]);
            for(int j = 0; j < 5; j++) {
                System.out.println("- " + athletes[i][j]);
            }
        }
    }
}
