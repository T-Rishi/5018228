
public class InventoryManagementSystem {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Add products
        Product product1 = new Product("1", "Laptop", 10, 999.99);
        Product product2 = new Product("2", "Phone", 20, 499.99);
        inventory.addProduct(product1);
        inventory.addProduct(product2);

        // Display inventory
        System.out.println("---Inventory---");
        inventory.displayInventory();

        // Update product
        Product updatedProduct = new Product("1", "Laptop", 8, 950.00);
        inventory.updateProduct("1", updatedProduct);

        // Display inventory after update
        System.out.println("\nInventory after update:");
        inventory.displayInventory();

        // Delete product
        inventory.deleteProduct("2");

        // Display inventory after deletion
        System.out.println("\nInventory after deletion:");
        inventory.displayInventory();
    }
}
