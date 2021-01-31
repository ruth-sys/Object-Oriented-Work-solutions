import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class StockItem {
	private int PartNumber;
	private String Description;
	private double Price;

	public StockItem() {
		PartNumber = 1234;
		Description = "Banana";
		Price = 55.0;
	}

	public StockItem(int partNumber, String description, double price) {
		PartNumber = partNumber;
		Description = description;
		Price = price;
	}

	public void DisplayStockItem() {
		System.out.println("Part Number: " + PartNumber);
		System.out.println("Description: " + Description);
		System.out.println("Price: " + Price);
	}

	public void GetStockItemFromUser() {
		try {
			Scanner in = new Scanner(System.in);

			System.out.println("Enter Part Number: ");
			PartNumber = in.nextInt();

			System.out.println("Enter Description: ");
			Description = in.next();

			System.out.println("Enter Price: ");
			Price = in.nextDouble();
		} catch (InputMismatchException e) {
			System.err.println("Wrong input type entered");
			}
	}
	
	
	public void SaveStockItem() {
		try {
			// File Writer will create the file if it does not exist
			// True will append data to the file
			FileWriter fileobject = new FileWriter("StockItems.txt", true);

			// Each attribute is separated by a space
			// Each Record is separated by a new line
			fileobject.write(PartNumber + " ");
			fileobject.write(Description + " ");
			fileobject.write(Price + " ");
			fileobject.write("\n");
			fileobject.close();

			// FileWriter might throw IOException, since it is a checked exception, must
			// handle it
		} catch (IOException e) {
			System.err.println("Could not open file");
		}
	}
		
	
	public void RetrieveStockItem() {
		Scanner in = new Scanner(System.in);

		// Boolean allows us to check if the record was found after iterating over
		// everything
		boolean IsPartNumberFound = false;
		int SearchPartNumber = 0;

		System.out.println("Search for Part Number: ");
		SearchPartNumber = in.nextInt();

		try {
			// Pass file into scanner
			Scanner fileobject = new Scanner(new File("StockItems.txt"));

			// Iterate through records in file
			while (fileobject.hasNext()) {

				// Read file values into temporary variables
				int PNum = fileobject.nextInt();
				String Desc = fileobject.next();
				double Pr = fileobject.nextDouble();

				if (SearchPartNumber == PNum) {
					PartNumber = PNum;
					Description = Desc;
					Price = Pr;
					IsPartNumberFound = true;
					break;
				}
			}

			// If record was not found
			if (IsPartNumberFound == false) {
				PartNumber = 0;
				Description = "";
				Price = 0.0;
				System.out.println("Item was not found");
			} else {
				System.out.println("Item found");
				DisplayStockItem();
			}

			// Close file object
			fileobject.close();
		} catch (FileNotFoundException e) {
			System.err.println("Sorry File was not found");
		}
	}

	public double RetrievePrice() {
		Scanner in = new Scanner(System.in);
		boolean IsPartNumberFound = false;
		int SearchPartNumber = 0;
		double ReturnVal = -1.0;
		System.out.println("Search for Part Number: ");
		SearchPartNumber = in.nextInt();
		try {
			Scanner fileobject = new Scanner(new File("StockItems.txt"));

			while (fileobject.hasNext()) {
				int PNum = fileobject.nextInt();
				String Desc = fileobject.next();
				double Pr = fileobject.nextDouble();

				if (SearchPartNumber == PNum) {
					ReturnVal = Pr;
					IsPartNumberFound = true;
					break;
				}
			}
			if (IsPartNumberFound == false) {
				System.out.println("Item was not found");
			}
			fileobject.close();
		} catch (FileNotFoundException e) {
			System.err.println("Sorry File was not found");
		}
		return ReturnVal;
	}

	public String RetrieveDescription() {
		Scanner in = new Scanner(System.in);
		boolean IsPartNumberFound = false;
		int SearchPartNumber = 0;
		String ReturnVal = "-1.0";
		System.out.println("Search for Part Number: ");
		SearchPartNumber = in.nextInt();
		try {
			Scanner fileobject = new Scanner(new File("StockItems.txt"));

			while (fileobject.hasNext()) {
				int PNum = fileobject.nextInt();
				String Desc = fileobject.next();
				double Pr = fileobject.nextDouble();

				if (SearchPartNumber == PNum) {
					ReturnVal = Desc;
					IsPartNumberFound = true;
					break;
				}
			}
			if (IsPartNumberFound == false) {
				System.out.println("Item was not found");
			}
			fileobject.close();
		} catch (FileNotFoundException e) {
			System.err.println("Sorry File was not found");
		}
		return ReturnVal;
	}

	public void DisplayAllItems() {
		try {
			Scanner fileobject = new Scanner(new File("StockItems.txt"));
			System.out.println("Part Number\t Description\t Price\t");
			System.out.println("------------\t -----------\t -------\t");
			while (fileobject.hasNext()) {
				int PNum = fileobject.nextInt();
				String Desc = fileobject.next();
				double Pr = fileobject.nextDouble();

				System.out.println(PNum + "\t\t" + Desc + "\t\t" + Pr);
			}
			fileobject.close();
		} catch (FileNotFoundException e) {
			System.err.println("Sorry File was not found");
		}
	}
}
