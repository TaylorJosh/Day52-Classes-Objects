public class Product {
    double productCost;
    double quantityPurchased;
    String productName;

    public Product(double productCost, double quantityPurchased,
    String productName){
        this.productCost = productCost;
        this.quantityPurchased = quantityPurchased;
        this.productName = productName;
    }

    public void totalCost(){
        System.out.println("The total cost is: $" + (this.productCost * this.quantityPurchased));
        
    }

    public void printProduct(){
        System.out.println("Cost of: " + this.productName + " is $" + this.productCost + "/ea\nYou have " + this.quantityPurchased + " pieces.");
        
    }

}
