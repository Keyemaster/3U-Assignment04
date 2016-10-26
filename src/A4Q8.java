
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author keyew7019
 */
public class A4Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //create the input for the user
        Scanner input = new Scanner(System.in);

        //create the values
        double dice = 0;
        double square = 0;
        double user = 1;

        //create Snakes and Ladders game
        while (user < 100) {
            System.out.println("Enter sum of dice");
            dice = (input.nextDouble());
            if (dice >= 2 && dice <= 12) {
                user = user + dice;
            }
            //create the snakes
            if (user == 54) {
                user = 19;
            }
            if (user == 90) {
                user = 48;
            }
            if (user == 99) {
                user = 77;
            }

            //create the ladders
            if (user == 9) {
                user = 34;
            }
            if (user == 40) {
                user = 64;
            }
            if (user == 67) {
                user = 86;
            }
            System.out.println("You are now on square " + user);
            if (dice == 0) {
                System.out.println("You Quit!");
                break;
            }
            if (user == 100) {
                System.out.println("You Win!");
                break;
            }
        }


    }
}
