public class Manager extends Employee implements Discountable{
    public Manager(String name,Clothing[] clothes,char size,double discount) {
        super(name,clothes,size,discount);
    }
    private final double Discount = .25;

    @Override
    public double getDiscount() {
        return Discount;
    }

    @Override
    public double calcDiscount() {

        double price = 0;
        return price * Discount + price;
    }

}
