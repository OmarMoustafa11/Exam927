public class Employee extends Customer{
private final double Discount = .10;

    public Employee(String name,Clothing[] clothes, char size, double discount) {
        super(name);
    }

    public double getDiscount() {

        return getPrice() * Discount + getPrice();
    }


}
