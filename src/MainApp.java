import java.util.Scanner;

/**
 * Created by broadwells on 4/21/17.
 */
public class MainApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean keepGoing = true;


        while (keepGoing){
            System.out.println("Please enter side length of a square: ");
            int sideLength = scan.nextInt();
            SquareCal length = new SquareCal(sideLength);

            //method 1
            length.calculatePerimeter(sideLength);
            //method 2
            length.calculateArea(sideLength);

            scan.nextLine();
            System.out.println("Continue? (y/n): ");
            String yesNo = scan.nextLine();
            if (yesNo.equalsIgnoreCase("n")){
                System.out.println("Goodbye!");
                keepGoing = false;
            }
        }
    }

}
