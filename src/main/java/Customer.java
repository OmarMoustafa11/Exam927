import java.util.ArrayList;

public abstract class Customer extends Person{
private Clothing [] clothes;
    private char size;
    private double price;

    public double getPrice() {
        return price;
    }

    public Customer(String name, Clothing[] clothes) {
        super(name);
        this.clothes = clothes;
    }

    public Customer(String name, double price) {
        super(name);
        this.price = price;
    }

    public Customer(String name, char size) {
        super(name);
        this.size = size;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "size=" + size +
                ", price=" + price +
                ", clothes=" + clothes +
                '}';
    }

    public Clothing[] getClothes() {
        return clothes;
    }

    public Customer(String name) {
        super(name);
    }

    public char getSize() {
        return size;
    }



}
