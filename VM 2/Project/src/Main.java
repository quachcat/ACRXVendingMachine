
import java.util.Scanner;

public class Main {

	public static void print() {
		String functions = "1. For Customer\n" + "2. For Staff\n" + "3. To end";
		System.out.println(functions);
	}
	


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner scaner = new Scanner(System.in);
		int Twix=0;
		int Coke=50;
		int Water=50;
		int Sandwich=50;

		while (true) {
			// the while loop that allows the user to continuely apply functions, until they
			// choose to end
			// the service

			print();
			System.out.print("\nPlease select the service that you want to conduct:\n");
			int choice = scan.nextInt();

			System.out.println("\n");
			if (choice == 1) {

				VendingMachineInterface machineInterface = new VendingMachineInterface();

				machineInterface.displayProducts();

				String selectedProduct = scaner.nextLine();
				if(selectedProduct.equals("1")) {
					if(Twix<=0) {
						System.out.println("Sorry, this item is sold out");
					
						break;
					}
					
			
					
					
				
				}
				machineInterface.selectProduct(Integer.parseInt(selectedProduct));

				machineInterface.displayEnterCoinsMessage();

				String userEnteredCoins = scaner.nextLine();
				
				
				int[] enteredCoins = Coin.parseCoins(userEnteredCoins);
				
		
				machineInterface.enterCoins(enteredCoins);
				

				machineInterface.displayChangeMessage();

			}
			if (choice == 2) {

			}

			else if (choice == 3) {
				System.out.println("Now the service will shut off");
				break;
			}

			System.out.println("\nPlease make another choice\n");
		}
		System.out.println("System stopped.");
		scan.close();
		scaner.close();

	}
}
