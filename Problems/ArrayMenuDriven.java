import java.util.Scanner;

public class ArrayMenuDriven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[50]; 
        int size = 0;
        int choice;

        do {
            System.out.println("\n===== ARRAY OPERATIONS MENU =====");
            System.out.println("1. Insert Element");
            System.out.println("2. Delete Element");
            System.out.println("3. Display Elements");
            System.out.println("4. Search Element");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("\nEnter number to insert: ");
                    int num = sc.nextInt();
                    arr[size] = num;
                    size++;
                    System.out.println("Element inserted successfully.");
                    break;

                case 2:
                    System.out.print("\nEnter element to delete: ");
                    int del = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < size; i++) {
                        if (arr[i] == del) {
                            for (int j = i; j < size - 1; j++) {
                                arr[j] = arr[j + 1];
                            }
                            size--;
                            found = true;
                            System.out.println("Element deleted successfully.");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Element not found.");
                    }
                    break;

                case 3:
                    System.out.println("\nElements in Array:");
                    if (size == 0) {
                        System.out.println("Array is empty.");
                    } else {
                        for (int i = 0; i < size; i++) {
                            System.out.print(arr[i] + " ");
                        }
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.print("\nEnter element to search: ");
                    int search = sc.nextInt();
                    boolean exists = false;

                    for (int i = 0; i < size; i++) {
                        if (arr[i] == search) {
                            exists = true;
                            System.out.println("Element found at position: " + (i + 1));
                            break;
                        }
                    }

                    if (!exists) {
                        System.out.println("Element not found.");
                    }
                    break;

                case 5:
                    System.out.println("\nExiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
