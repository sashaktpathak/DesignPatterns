package ChainRespToyDispenser;

public class ThousandTicketDispenser extends DispenseChain {
	private DispenseChain chain;

	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.chain = nextChain;
	}

	@Override
	public void dispense(Tickets ticket) {
		if (ticket.getAmount() >= 1000) {
			int num = ticket.getAmount() / 1000;
			int remainder = ticket.getAmount() % 1000;
			System.out.println("You Got Racing Car x " + num + " worth 1000 tickets each");
			if (remainder != 0)
				this.chain.dispense(new Tickets(remainder));
		} else {
			this.chain.dispense(ticket);
		}
	}
}
