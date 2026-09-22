import java.util.Scanner;

class ShipCostCalc {
    void main()
    {
        Scanner in = new Scanner(System.in);

        double shipCosts = 0;
        double itemPrice = 0;
        double totalCost = 0;
        String trash = "";

        //get the item price from the user

        IO.print("Enter your item price: ");

        if(in.hasNextDouble())
        {
            itemPrice = in.nextDouble();
            in.nextLine();  //clear the newline from the key buffer
        }
        else
        {
            trash = in.nextLine();
            IO.println("You must enter a valid number NOT" + trash);
            IO.println("Rerun the program and try again.");
            System.exit(0);
        }

        //we got the correct input so now use it

        if(itemPrice >= 100)
        {
            shipCosts = 0;
            totalCost = itemPrice;
        }
        else
        {
           shipCosts = itemPrice * .02;
           totalCost = itemPrice + shipCosts;
        }

        //display results

        IO.println("The shipping cost are: " + shipCosts);
        IO.println("The total cost is: " + totalCost);
    }
}
