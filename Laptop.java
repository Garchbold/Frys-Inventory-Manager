package frys;

public class Laptop extends Computer{

	boolean notebook;
	
	public Laptop(String name, double price, boolean sale, int numInStock,
			int watts, int driverSize, boolean notebook) {
		super(name, price, sale, numInStock, watts, driverSize);
		this.notebook=notebook;
	
	}


	public boolean getNotebook()
	{
		return notebook;
	}

	public void setNotebook (boolean n)
	{
		notebook=n;
	}
	
	@Override
	public String toString() {
		return "Name: " + name +"\n"+ "Driversize: "+ driverSize +"\n"+ "Watts: " + watts +"\n"+  "Price: " + price 
				+"\n"+ "Notebook: " + notebook +"\n"+"Number in Stock: " + numInStock + "\n"+"Sale: "
				+ sale + "\n";
	}
}

