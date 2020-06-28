package ChainRespToyDispenser;

public abstract class DispenseChain {

	abstract void setNextChain(DispenseChain nextChain);

	abstract void dispense(Tickets ticket);
}
