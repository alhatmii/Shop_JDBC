import java.util.Scanner;

public class ShopItemsMenu {
	public static void manageShopItems(Scanner scanner) {
		int shopItemsChoice = 0;
		do {
			System.out.println("Shop Items Menu:");
			System.out.println("1- Add Items");
			System.out.println("2- Delete Items");
			System.out.println("3- Change Item Price");
			System.out.println("4- Report All Items");
			System.out.println("5- Go Back");

			System.out.print("Enter your choice: ");
			shopItemsChoice = scanner.nextInt();
			switch (shopItemsChoice) {
			case 1:
				// Add Items option
				System.out.println("Add Items selected.");
				// Add your implementation here to add items and save/serialize them
				break;
			case 2:
				// Delete Items option
				System.out.println("Delete Items selected.");
				// Add your implementation here to delete items
				break;
			case 3:
				// Change Item Price option
				System.out.println("Change Item Price selected.");
				// Add your implementation here to change the price of an item
				break;
			case 4:
				// Report All Items option
				System.out.println("Report All Items selected.");
				// Add your implementation here to report all items
				break;
			case 5:
				// Go Back option
				System.out.println("Returning to the main menu...");
				break;
			default:
				System.out.println("Invalid choice. Please select a number from 1 to 5.");
				break;
			}
		} while (shopItemsChoice != 5);
	}
}
