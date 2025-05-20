import Inventory.Electronics;
import Inventory.Food;
import static Inventory.Product.welcomeMessage;

public class Main {
    public static void main(String[] args) {
        welcomeMessage();
        System.out.println("");
                System.out.println("");
                        System.out.println("");


        Electronics elec1= new Electronics("PC ",10000,2,"DELL",2025);
        Food food1=new Food("lait",4,4,"11/10/2024");
        elec1.displayInfo();
        System.out.println("");
        food1.displayInfo();
    }
    
}
