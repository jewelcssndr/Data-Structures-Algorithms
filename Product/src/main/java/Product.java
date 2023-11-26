class Product {
    
    private String name;
    private double price;
    private String description;

    public Product(String name, double price, String description) {
        this.name = name;
        this.setPrice(price);
        this.description = description;
    }

    public void displayProductInfo() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Description: " + description);
    }

    public double applyDiscount(double discountPercentage) {
        double discount = (discountPercentage / 100) * price;
        return price - discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Cannot be negative.");
        }
    }

    public void setPrice(int price) {
        this.setPrice((double) price);
    }

    public void setPrice(float price) {
        this.setPrice((double) price);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
