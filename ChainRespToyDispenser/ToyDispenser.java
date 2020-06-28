package ChainRespToyDispenser;

import java.util.Scanner;

public class ToyDispenser {

	private DispenseChain c1;

	public ToyDispenser() {
		this.c1 = new ThousandTicketDispenser();
		DispenseChain c2 = new FiveHundredTicketDispenser();
		DispenseChain c3 = new HundredTicketDispenser();

		c1.setNextChain(c2);
		c2.setNextChain(c3);
	}

	public static void main(String[] args) {
		ToyDispenser atmDispenser = new ToyDispenser();
		while (true) {
			int amount = 0;
			System.out.println("Enter amount of tickets");
			Scanner input = new Scanner(System.in);
			amount = input.nextInt();
			if (amount % 100 != 0) {
				System.out.println("Sorry,  Tickets should be a multiple of 100!! Please play more Games.");
				return;
			}
			atmDispenser.c1.dispense(new Tickets(amount));
		}

	}
}
