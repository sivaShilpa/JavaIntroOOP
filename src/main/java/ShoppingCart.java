import java.text.NumberFormat;
import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<Item> items = new ArrayList<>();
    int counter = 0;
    double total = 0;
    NumberFormat nf = NumberFormat.getCurrencyInstance();

    public ShoppingCart() {
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void calculateTotal() {
        for(Item i : items){
            total += i.price * i.quantity;
        }
    }

    public String getTotal() {
        return nf.format(total);
    }
}
