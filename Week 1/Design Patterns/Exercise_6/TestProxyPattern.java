
public class TestProxyPattern {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        // Displaying images
        System.out.println("First call to display image1:");
        image1.display(); // Loading and displaying image1

        System.out.println("\nSecond call to display image1:");
        image1.display(); // Displaying image1 from cache

        System.out.println("\nFirst call to display image2:");
        image2.display(); // Loading and displaying image2

        System.out.println("\nSecond call to display image2:");
        image2.display(); // Displaying image2 from cache
    }
    
}
