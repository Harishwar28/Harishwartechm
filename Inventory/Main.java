package Inventory;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Inventory[] inventories = new Inventory[4];
        for (int i = 0; i < 4; i++) {
            String inventoryId = scanner.nextLine();
            int maximumQuantity = scanner.nextInt();
            int currentQuantity = scanner.nextInt();
            int threshold = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character
            inventories[i] = new Inventory(inventoryId, maximumQuantity, currentQuantity, threshold);
        }

        int limit = scanner.nextInt();
        scanner.close();

        Inventory[] result = Solution.replenish(inventories, limit);

        for (Inventory inventory : result) {
            System.out.print(inventory.getInventoryId() + " ");
            if (inventory.getThreshold() > 75) {
                System.out.println("Critical Filling");
            } else if (inventory.getThreshold() >= 50 && inventory.getThreshold() <= 75) {
                System.out.println("Moderate Filling");
            } else {
                System.out.println("Non-Critical Filling");
            }
        }
    }
}
