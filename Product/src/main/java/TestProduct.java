public class TestProduct {
    
    public static void main(String[] args) {
        
        Product product = new Product("Tinapay", 10, "Medyo masarap lang");
        
        System.out.println("Product Info:");
        product.displayProductInfo();
        
        double discountPrice = product.applyDiscount(10);
        System.out.println("\nDiscounted Price: " + discountPrice);
        
    }
}