package Exercise10;

public class Exercise10SelfCheckout {

    private final static double TAX_RATE = 0.055;


    public int subtotalCalculator(Item... items) {
        int total = 0;
        for (Item item : items) {
            total += item.getItemPrice() * item.getItemQuantity();
        }
        return total;
    }

    public double taxCalculator(Item... items) {
        return subtotalCalculator(items) * TAX_RATE;
    }

    public double totalCalculator(Item... items) {
        int total = subtotalCalculator(items);
        return total * TAX_RATE + total;
    }

}

