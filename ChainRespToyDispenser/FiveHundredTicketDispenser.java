package ChainRespToyDispenser;

public class FiveHundredTicketDispenser extends DispenseChain {
	private DispenseChain chain;

	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.chain = nextChain;
	}

	@Override
	public void dispense(Tickets ticket) {
		if (ticket.getAmount() >= 500) {
			int num = ticket.getAmount() / 500;
			int remainder = ticket.getAmount() % 500;
			System.out.println("You Got Soft Toys x " + num + " worth 500 tickets each");
			if (remainder != 0)
				this.chain.dispense(new Tickets(remainder));
		} else {
			this.chain.dispense(ticket);
		}
	}
}
