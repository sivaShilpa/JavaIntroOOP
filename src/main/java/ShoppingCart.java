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

    public String shipOrder(String name, String strAdd, String city, String state, int zipCode){
        var invoice = "Ship to: \n\t" + name + "\n\t" + strAdd + "\n\t" + city + ", " + state + " " + zipCode +
                "\n\nItems\n-----\n";

        for(Item i : items){
           invoice += i.description + " " + nf.format(i.price) + " " + "\t(" + i.quantity + ")\t" + nf.format(i.price*i.quantity) + "\n";
        }
        invoice += "\n" + "Shipping: ";
        if(total <= 10.00){
            invoice += nf.format(5.00);
        }
        else{
            invoice += "Free\n";
        }
        invoice += "\nTotal Cost\n---------\n" + nf.format(total);
        return invoice;
    }
}
