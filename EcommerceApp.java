
class Product{
    String name;
    double price;
    int stock;

    //generate constructor
    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    boolean isAvailable(int quantity){
        return stock >= quantity;
    }

    void reduceStock(int quantity){
        stock -= quantity;
    }
}

class Order{
    Product product;
    int quantity;

    //constructor
    public Order(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    double calculateTotal(){
        return product.price * quantity;
    }

    void placeOrder(){
        if (product.isAvailable(quantity)){
            product.reduceStock(quantity);
            System.out.println("Order placed successfully");
            System.out.println("Product: " + product.name);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total Amount: " + calculateTotal());
        }else {
            System.out.println("sorry! Not enough stock for " + product.name);
        }
    }
}

public class EcommerceApp {
    public static void main(String[] args) {
        Product laptop = new Product("Dell Laptop", 55000,5);

        //user places on order for 2 laptops
        Order order1 = new Order(laptop,2);
        order1.placeOrder();

        //Another user places an order for 4 laptops(not enough stock)

        Order order2 = new Order(laptop,4);
        order2.placeOrder();

    }
}
