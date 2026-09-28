public class DeliveryPizza extends Pizza {

    // New variables
    private int deliveryFee;
    private String deliveryAddress;

    // Constructor
    public DeliveryPizza(String[] toppings, int numberOfToppings, String deliveryAddress) {
        super(toppings, numberOfToppings);
        this.deliveryAddress = deliveryAddress;

        if (getPrice() > 10) {
            deliveryFee = 3;
        } else {
            deliveryFee = 5;
        }
    }

    // Override for toString
    public String toString() {
        return super.toString() + "\nDelivery fee: " + deliveryFee +
                "\nDelivery address: " + deliveryAddress +
                "\nTotaly price: $" + (getPrice() + deliveryFee);
    }

}
