import java.util.*;
public class TestSorting {
     public static void main(String[] args) {
        Order[] orders = {
            new Order("1", "Alice", 250.00),
            new Order("2", "Bob", 150.50),
            new Order("3", "Charlie", 300.75),
            new Order("4", "Diana", 100.00)
        };

        // Test Bubble Sort
        Order[] bubbleSortedOrders = Arrays.copyOf(orders, orders.length);
        SortingAlgorithms.bubbleSort(bubbleSortedOrders);
        System.out.println("Bubble Sort Result:");
        for (Order order : bubbleSortedOrders) {
            System.out.println(order);
        }

        // Test Quick Sort
        Order[] quickSortedOrders = Arrays.copyOf(orders, orders.length);
        SortingAlgorithms.quickSort(quickSortedOrders, 0, quickSortedOrders.length - 1);
        System.out.println("\nQuick Sort Result:");
        for (Order order : quickSortedOrders) {
            System.out.println(order);
        }
    }
}
