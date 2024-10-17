package Inventory;

public class Electronics extends Product {
    public String brand;
    public int warranty;
//Constructor
    public Electronics(String name, double price, int quantity, String brand, int warranty) {
        super(name, price, quantity);
        this.brand = brand;
        this.warranty = warranty;
    }



    //Getters and setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    @Override
    public void displayInfo(){
        System.out.println("product name :"+getName());
        System.out.println("product price:"+getPrice());
        System.out.println("product quantity :"+getQuantity());
        System.out.println("product BRAND :"+brand);
        System.out.println("product warranty :"+warranty);

    }
}
