import java.text.NumberFormat;
import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<Item> items = new ArrayList<>();
    int counter = 0;
    double total = 0;
    double shipping = 0.00F;
    static double SALESTAX = 0.1;
    NumberFormat nf = NumberFormat.getCurrencyInstance();


    public ShoppingCart() {
    }

    public ShoppingCart(double shipping) {
        this.shipping = shipping;
    }



    public void addItem(Item item) {
        items.add(item);
    }

    public void calculateTotal() {
        for(Item i : items){
            total += i.price * i.quantity;
        }
        total += total * SALESTAX;
    }

    public String getTotal() {
        return nf.format(total);
    }
}
