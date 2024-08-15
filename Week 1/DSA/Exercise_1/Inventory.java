
import java.util.*;

public class Inventory {
    private Map<String, Product> products;

    public Inventory() {
        products = new HashMap<>();
    }

    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
    }

    public void updateProduct(String productId, Product updatedProduct) {
        products.put(productId, updatedProduct);
    }

    public void deleteProduct(String productId) {
        products.remove(productId);
    }

    public Product getProduct(String productId) {
        return products.get(productId);
    }

    public void displayInventory() {
        for (Product product : products.values()) {
            System.out.println("ID: " + product.getProductId() +
                               ", Name: " + product.getProductName() +
                               ", Quantity: " + product.getQuantity() +
                               ", Price: $" + product.getPrice());
        }
    }
}
