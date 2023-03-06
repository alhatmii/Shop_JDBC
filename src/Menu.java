import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("Application Main Menu:");
			System.out.println("1- Shop Settings");
			System.out.println("2- Manage Shop Items");
			System.out.println("3- Create New Invoice");
			System.out.println("4- Report: Statistics");
			System.out.println("5- Report: All Invoices");
			System.out.println("6- Search (1) Invoice");
			System.out.println("7- Program Statistics");
			System.out.println("8- Exit");

			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				// Shop Settings option
				System.out.println("Shop Settings selected.");
				// Add your implementation here
				ShopSettingsMenu.shopSettings(scanner);
				break;
			case 2:
				// Manage Shop Items option
				System.out.println("Manage Shop Items selected.");
				// Add your implementation here
				break;
			case 3:
				// Create New Invoice option
				System.out.println("Create New Invoice selected.");
				// Add your implementation here
				break;
			case 4:
				// Report: Statistics option
				System.out.println("Report: Statistics selected.");
				// Add your implementation here
				break;
			case 5:
				// Report: All Invoices option
				System.out.println("Report: All Invoices selected.");
				// Add your implementation here
				break;
			case 6:
				// Search (1) Invoice option
				System.out.println("Search (1) Invoice selected.");
				// Add your implementation here
				break;
			case 7:
				// Program Statistics option
				System.out.println("Program Statistics selected.");
				// Add your implementation here
				break;
			case 8:
				// Exit option
				System.out.print("Are you sure you want to exit? (Y/N): ");
				String exitChoice = scanner.next();
				if (exitChoice.equalsIgnoreCase("Y")) {
					System.out.println("Exiting the program...");
					System.exit(0);
				} else {
					System.out.println("Returning to the main menu...");
				}
				break;
			default:
				System.out.println("Invalid choice. Please select a number from 1 to 8.");
				break;
			}
		} while (choice != 8);
	}
}
