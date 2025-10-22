public class InventoryManager {

    // Duplicates zeros in place
    public static void duplicateZeros(int[] inventory) {
        int zeros = 0;
        int length = inventory.length;

        // Step 1: Count zeros
        for (int num : inventory) {
            if (num == 0) zeros++;
        }
        
        System.out.println("zero count: " + zeros);
        System.out.println("length count: " + length);
        // Step 2: Work backwards
        for (int i = length - 1; i >= 0; i--) {
            int newPos = i + zeros;
            
            System.out.println("i: " + i);
            System.out.println("newPos: " + newPos);
            // If within bounds, copy value
            if (newPos < length) {
                inventory[newPos] = inventory[i];
                System.out.println("inventory[newPos]: " + inventory[newPos]); 
            }
        
            // If zero, duplicate it
            if (inventory[i] == 0) {
                zeros--;
                if (i + zeros < length) {
                    inventory[i + zeros] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] inventory = {4, 0, 1, 3, 0, 2, 5, 0};
        duplicateZeros(inventory);

        for (int i : inventory) {
            System.out.print(i + " ");
        }
        
        System.out.println("");
        int[] inventory2 = {3,2,1};
        duplicateZeros(inventory2);

        for (int i : inventory2) {
            System.out.print(i + " ");
        }
        // Output: 4 0 0 1 3 0 0 2
    }
}
