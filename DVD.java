package frys;

public abstract class DVD extends NonElectronics {

	boolean bluray;

	public DVD(String name, double price, boolean sale, int stock, boolean bluray) {

		super(name, price, sale, stock);
		this.bluray=bluray;

	}

	


	
}
