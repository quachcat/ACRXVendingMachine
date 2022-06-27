
public class VendingMachineController {

	private Calculator calculator = new Calculator();

	public CoinBundle calculateChange(VendingMachineRequest request) {
		int total = calculator.calculateTotal(request.enteredCoins);
		int totalChange = total - request.product.getPrice();
		if(totalChange<0) {
			return calculateChange1(request);
		}
	//	System.out.println("a");
		return calculator.calculateChange(totalChange) ;
	}
	
	public boolean calculateChange1(VendingMachineRequest request) {
		int total = calculator.calculateTotal(request.enteredCoins);
		int totalChange = total - request.product.getPrice();
		if(totalChange<0) {
			return false;
		}
	//	System.out.println("a");
		return calculator.calculateChange(totalChange) ;
	}
	

	public CoinBundle calculateRemainingChange(VendingMachineRequest request, int remaining) {
		int total = calculator.calculateTotal(request.enteredCoins);
		int totalChange = total - remaining;
	//	System.out.println("b");
		return calculator.calculateChange(totalChange);
	}

	public int calculateRemaining(VendingMachineRequest request) {
		int total = calculator.calculateTotal(request.enteredCoins);
		return total;
	}
}
