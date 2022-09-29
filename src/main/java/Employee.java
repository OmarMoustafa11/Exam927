public class Employee extends Customer{
private final double Discount = .10;

    public Employee(String name,Clothing[] clothes, char size, double discount) {

        super(name,clothes,size,discount);
    }

    public double getDiscount(
    ) {

        return getPrice() * Discount + getPrice();
    }


}
