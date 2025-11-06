import java.util.Scanner;

class Order {
    String drinkName;
    double basePrice;
    Order(String n,double b){
        drinkName=n;
        basePrice=b;
    }
    void printBill(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Are you a cafe member? (Y/N): ");
        String answer = sc.nextLine();
        double finalPrice = 0;
        double discountPercent=0;

        if (answer.equalsIgnoreCase("y")) {
            discountPercent= .1;
            finalPrice=basePrice-(basePrice*discountPercent);
        }
        System.out.println("Drink: "+drinkName);
        System.out.println("Base Price: $"+basePrice);
        System.out.println("Discount: "+(discountPercent*100)+"%");
        System.out.println("Final Price: $"+finalPrice);

    }

}


    // TODO A1: Add a constructor that sets drinkName and basePrice.

    // TODO A2: Add a method printBill()
    //   - Ask: "Are you a café member (Y/N)?"
    //   - If the answer is "Y" or "y", apply a 10% discount.
    //   - Calculate finalPrice = basePrice - (basePrice * discount)
    //   - Print:
    //       Drink: <drinkName>
    //       Base Price: $<basePrice>
    //       Discount: <discount * 100> %
    //       Final Price: $<finalPrice>


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Coffee Menu ===");

        System.out.println("1. Espresso ($3.50)");
        System.out.println("2. Latte ($4.50)");
        System.out.println("3. Cappuccino ($5.00)");
        System.out.print("Enter your choice (1-3): ");

        int choice = input.nextInt();

        switch (choice) {
            case 1:
                Order espresso = new Order("Espresso", 3.50);
                espresso.printBill();
                break;
            case 2:
                Order latte = new Order("Latte", 4.50);
                latte.printBill();
                break;
            case 3:
                Order cappuccino = new Order("Cappuccino", 5.00);
                cappuccino.printBill();
            default:
                System.out.println("Invalid choice. Please try again.");
        }




        // TODO B1: Display the coffee menu:
        //   1. Espresso ($3.50)
        //   2. Latte ($4.50)
        //   3. Cappuccino ($5.00)

        // TODO B2: Ask the user for their choice (1–3).

        // TODO B3: Use a switch statement to:
        //   - Create an Order object for the chosen drink
        //   - Each case should assign the correct drink name and price
        //   - Include a default case for invalid options

        // TODO C1: Call printBill() to show the final amount.
    }

    System.out.println("Hello World");
}

