import java.util.Scanner;
public class Main {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your party affiliation: \n-Democrat (D)\n-Republican(R)\n-Independent (I)\n-Other ");
        String partyA = scanner.nextLine();

        if (partyA.equals("D")) {
            System.out.println("You get a Democratic Donkey");
        } else if (partyA.equals("R")) {
            System.out.println("You get Republican Elephant");
        } else if (partyA.equals("I")) {
            System.out.println("You get Independent Person");
        } else {
            System.out.println("You get Other");
        }
     }
}
