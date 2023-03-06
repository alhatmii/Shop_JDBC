import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class ShopSettingsMenu {
	public static void shopSettings(Scanner scanner) {

		String url = "jdbc:sqlserver://localhost:1433;" + "databaseName=Shop;" + "encrypt=true;"
				+ "trustServerCertificate=true";
		String user = "sa";
		String pass = "root";
		Connection con = null;

		int shopSettingsChoice = 0;
		do {
			System.out.println("Shop Settings Menu:");
			System.out.println("1- Load Data (Items and Invoices)");
			System.out.println("2- Set Shop Name");
			System.out.println("3- Set Invoice Header (Tel/Fax/Email/Website)");
			System.out.println("4- Go Back");

			System.out.print("Enter your choice: ");
			shopSettingsChoice = scanner.nextInt();
			switch (shopSettingsChoice) {
			case 1:
				// Load Data option
				System.out.println("Load Data selected.");
				// Add your implementation here
				break;
			case 2:
				// Set Shop Name option
				System.out.print("Enter the shop name: ");
				String shopName = scanner.next();
				// Add your implementation here to save the shop name
				System.out.println("Shop name set to: " + shopName);
				break;
			case 3:
				// Set Invoice Header option
				System.out.print("Enter the Tel: ");
				String tel = scanner.next();
				System.out.print("Enter the Fax: ");
				String fax = scanner.next();
				System.out.print("Enter the Email: ");
				String email = scanner.next();
				System.out.print("Enter the Website: ");
				String website = scanner.next();

				// Add your implementation here to save the invoice header
				System.out.println("Invoice header set to: Tel: " + tel + ", Fax: " + fax + ", Email: " + email
						+ ", Website: " + website);

				// Create the Shop table if it doesn't already exist
				try {

					Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver")
							.newInstance();
					DriverManager.registerDriver(driver);
					con = DriverManager.getConnection(url, user, pass);
					Statement st = con.createStatement();
					String createTableSQL = "CREATE TABLE Shop (" + "id INT PRIMARY KEY, "
							+ "name VARCHAR(255) NOT NULL, " + "tel VARCHAR(20) NULL, " + "fax VARCHAR(20) NULL, "
							+ "email VARCHAR(255) NULL, " + "website VARCHAR(255) NULL)";

					st.executeUpdate(createTableSQL);
					System.out.println("Table is Created");
					// Insert the values into the Shop table
					String insertValuesSQL = "INSERT INTO Shop (id, name, tel, fax, email, website) "
							+ "VALUES (1, 'My Shop Name', '" + tel + "', '" + fax + "', '" + email + "', '" + website
							+ "')";
					st.executeUpdate(insertValuesSQL);
					System.out.println("Data inserted Done.");
				} catch (Exception ex) {
					System.err.println(ex);
				}
				break;
			case 4:
				// Go Back option
				System.out.println("Returning to the main menu...");
				break;
			default:
				System.out.println("Invalid choice. Please select a number from 1 to 4.");
				break;
			}
		} while (shopSettingsChoice != 4);
	}
}
