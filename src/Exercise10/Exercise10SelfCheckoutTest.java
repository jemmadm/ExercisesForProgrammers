package Exercise10;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class Exercise10SelfCheckoutTest {

    private Exercise10SelfCheckout exercise10SelfCheckout;

    @Before

    public void setup() {
        exercise10SelfCheckout = new Exercise10SelfCheckout();
    }

    @Test
    public void oneItemQuantityOnePriceOne() {
        assertThat(exercise10SelfCheckout.subtotalCalculator(new Item("Broccoli", 1, 1))).isEqualTo(1);
    }

    @Test
    public void oneItemQuantityTwoPriceOne() {
        assertThat(exercise10SelfCheckout.subtotalCalculator(new Item("Carrots", 1, 2))).isEqualTo(2);
    }

    @Test
    public void oneItemQuantityThreePriceFive() {
        assertThat(exercise10SelfCheckout.subtotalCalculator(new Item("Potatoes", 5, 3))).isEqualTo(15);
    }

    @Test
    public void twoItemsQuantityOnePriceOne() {
        assertThat(exercise10SelfCheckout.subtotalCalculator(new Item("Broccoli", 1, 1), new Item("Carrots", 1, 1))).isEqualTo(2);
    }

    @Test
    public void twoItemsQuantityTwoPriceFive() {
        assertThat(exercise10SelfCheckout.subtotalCalculator(new Item("Milk", 5, 2), new Item("Eggs", 5, 2))).isEqualTo(20);
    }

    @Test
    public void twoItemsDifferentQuantitiesSamePrice() {
        assertThat(exercise10SelfCheckout.subtotalCalculator(new Item("Bread", 2, 1), new Item("Cheese", 2, 4))).isEqualTo(10);
    }

    @Test
    public void twoItemsDifferentQuantitiesDifferentPrice() {
        assertThat(exercise10SelfCheckout.subtotalCalculator(new Item("Yoghurt", 5, 5), new Item("Crisps", 2, 2))).isEqualTo(29);
    }

    @Test
    public void threeItemsSamePriceSameQuantities() {
        assertThat(exercise10SelfCheckout.subtotalCalculator(new Item("Yoghurt", 5, 5), new Item("Eggs", 5, 5), new Item("Milk", 5, 5))).isEqualTo(75);
    }

    @Test
    public void threeItemsDifferentPriceDifferentQuantities() {
        assertThat(exercise10SelfCheckout.subtotalCalculator(new Item("Yoghurt", 5, 5), new Item("Milk", 3, 3), new Item("Eggs", 2, 2))).isEqualTo(38);
    }

    @Test
    public void taxOneItem() {
        assertThat(exercise10SelfCheckout.taxCalculator(new Item("Coffee", 5, 1))).isEqualTo(0.28);
    }

    @Test
    public void taxTwoItem() {
        assertThat(exercise10SelfCheckout.taxCalculator(new Item("Coffee", 5, 1), new Item("Milk", 3, 3))).isEqualTo(0.77);
    }

    @Test
    public void taxThreeItem() {
        assertThat(exercise10SelfCheckout.taxCalculator(new Item("Coffee", 5, 1), new Item("Milk", 3, 3), new Item("Sugar", 4, 6))).isEqualTo(2.09);
    }

    @Test
    public void totalWithTaxOneItem() {
        assertThat(exercise10SelfCheckout.totalCalculator(new Item("Coffee", 5, 1))).isEqualTo(5.28);
    }

    @Test
    public void totalWithTaxTwoItem() {
        assertThat(exercise10SelfCheckout.totalCalculator(new Item("Coffee", 5, 1), new Item("Milk", 3, 3))).isEqualTo(14.77);
    }

    @Test
    public void totalWithTaxThreeItem() {
        assertThat(exercise10SelfCheckout.totalCalculator(new Item("Coffee", 5, 1), new Item("Milk", 3, 3), new Item("Sugar", 4, 6))).isEqualTo(40.09);
    }
}

