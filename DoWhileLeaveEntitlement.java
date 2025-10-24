import java.util.Scanner;

public class DoWhileLeaveEntitlement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int leaveEntitlement = 10, numLeave;
        String confirmation;

        do {
            System.out.print("Do you want to take a leave (y/n)? ");
            confirmation = input.next();

            if(confirmation.equalsIgnoreCase("y")) {
                System.out.print("How many days(s?) ");
                numLeave = input.nextInt();

                if(numLeave <= leaveEntitlement) {
                    leaveEntitlement -= numLeave;
                    System.out.println("Remaining leave entitlement: "+leaveEntitlement);
                }else {
                    System.out.println( "You dont have enough leave entitlement");
                }
            }
        }while(leaveEntitlement > 0);
    } 

}
