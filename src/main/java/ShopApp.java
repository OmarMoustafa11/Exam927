import java.util.ArrayList;

public class ShopApp {
    public static double calcTotal(Clothing[] clothing) {
        double sum = 0;
        for (int x = 0; x < clothing.length; x++) {
            sum += clothing[x].getPrice();
        }
        return sum;

    }

    public static boolean isAFit(Customer customer, Clothing clothing) {
       if(customer.getSize() == clothing.getSize());
       return true;
    }

    public static void sortAndPrintClothingByPrice(ArrayList<Clothing> clothing) {}

    public static void printEmployeeName(Employee employee) {
        System.out.println(employee.getName());
    }


    public static void printDiscAmntOff(Discountable[] discountables,Clothing clothing){
        for(int x = 0; x < discountables.length;x++);
//            System.out.println(discountables(x).calcDiscount(clothing));
    }

}





