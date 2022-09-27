public class HourlyEmployee extends Employee implements Discountable{
    private double price;


    public HourlyEmployee(String name, Clothing[] clothes, char size, double discount, double price) {
        super(name, clothes, size, discount);
        this.price = price;
    }

    @Override
    public double calcDiscount() {
        return getPrice() * getDiscount();

}


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
