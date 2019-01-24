package Exercise10;

public class Item {

//    private String itemName;
    private int itemPrice;
    private int itemQuantity;

    Item(String itemName, int itemPrice, int itemQuantity) {
//        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }


}
