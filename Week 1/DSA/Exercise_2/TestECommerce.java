public class TestECommerce {
     public static void main(String[] args) {
        Product[] products = {
            new Product("1", "Laptop", "Electronics"),
            new Product("2", "Shirt", "Clothing"),
            new Product("3", "Phone", "Electronics"),
            new Product("4", "Shoes", "Footwear")
        };

        // Test linear search
        Product foundProduct = SearchAlgorithms.linearSearch(products, "Phone");
        System.out.println("Linear Search Result: " + (foundProduct != null ? foundProduct : "Product not found"));

        // Test binary search
        foundProduct = SearchAlgorithms.binarySearch(products, "Phone");
        System.out.println("Binary Search Result: " + (foundProduct != null ? foundProduct : "Product not found"));
    }
}
