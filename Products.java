
package secretaria.java;


public class Products {
    Product[] productList = new Product[100];

   
    public void addProduct(Product product) {
        
    }
    
    public void displayAllProducts() {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s%n",
                "ID", "Name", "Sold", "Stock", "Price", "Profit", "Status", "TEP");
        for (Product product : productList) {
            product.viewProduct();
        }
    }
}
   
      
    

    
   

    

