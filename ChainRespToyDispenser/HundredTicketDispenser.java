package ChainRespToyDispenser;

public class HundredTicketDispenser extends DispenseChain {
	private DispenseChain chain;

	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.chain = nextChain;
	}

	@Override
	public void dispense(Tickets ticket) {
		if (ticket.getAmount() >= 100) {
			int num = ticket.getAmount() / 100;
			int remainder = ticket.getAmount() % 100;
			System.out.println("You Got Board Game x " + num + " worth 100 tickets each");
			if (remainder != 0)
				this.chain.dispense(new Tickets(remainder));
		} else {
			this.chain.dispense(ticket);
		}
	}

}
