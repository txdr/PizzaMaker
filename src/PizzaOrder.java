import java.util.Scanner;

public class PizzaOrder {

    public static void main(String[] args) {
        // Variables
        Scanner input = new Scanner(System.in);
        String[] toppings = new String[10];
        int numberOfToppings = 0;
        final String DONE = "DONE";

        // Get toppings from the customer
        System.out.println("Enter up to 10 toppings you would like, enter \"DONE\" when you are ready to continue.");
        while (numberOfToppings < 10) {
            System.out.print("Enter toppings you would like: ");
            String topping = input.nextLine();

            if (topping.equalsIgnoreCase(DONE)) {
                break;
            }
            toppings[numberOfToppings] = topping;
            System.out.println("Added topping: " + topping + ".");

            numberOfToppings++;
        }


        // Get the delivery status
        System.out.print("Is this for delivery? (yes/no)");
        String deliveryResponse = input.nextLine();
        Pizza pizza;
        if (deliveryResponse.equalsIgnoreCase("yes")) {
            System.out.print("Delivery address: ");
            pizza = new DeliveryPizza(toppings, numberOfToppings, deliveryResponse);
        } else {
            pizza = new Pizza(toppings, numberOfToppings);
        }

        // Print out the pizza
        System.out.println(pizza);

        // Close the scanner
        input.close();
    }

}
