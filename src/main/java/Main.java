import javax.xml.namespace.QName;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ShopApp shopApp = new ShopApp();
        Clothing jeans = new Clothing("Amiris",1000,'M');
        Clothing shirt = new Clothing("Louie V",350,'S');
        Clothing belt = new Clothing("Hermes",250,'S');
        Clothing[] managercart = {jeans,shirt,belt};
        Manager manager1 = new Manager("Omizz",managercart,'M',.25);
        Clothing[] employeeCart = {jeans,shirt,belt};
        Employee employee1 = new Employee("Mike",employeeCart,'S',.10);


        ArrayList <Clothing> clothes = new ArrayList<>();
        clothes.add(jeans);
        clothes.add(shirt);
        clothes.add(belt);
        for (Clothing clothing : clothes){
            System.out.println(clothing);
        }


        ShopApp.printEmployeeName(manager1);
        ShopApp.printEmployeeName(employee1);
        System.out.println(ShopApp.calcTotal(managercart));
        System.out.println("the" + jeans + "is" + shopApp.isAFit(manager1,jeans));
        System.out.println("the" + jeans + "is" + ShopApp.isAFit(employee1,shirt));
        System.out.println(shopApp.calcTotal(managercart));







    }


}
