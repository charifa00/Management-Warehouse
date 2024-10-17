package Inventory;

public class Food extends Product{
   public String expirationDate;
//Constructor
    public Food(String name, double price, int quantity, String expirationDate) {
        super(name, price, quantity);
        this.expirationDate = expirationDate;
    }
//Getters and setters

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
   public void displayInfo(){
       System.out.println("product name :"+getName());
       System.out.println("product price:"+getPrice());
       System.out.println("product quantity :"+getQuantity());
       System.out.println("product expirationDate :"+expirationDate);
   }
}
