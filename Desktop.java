package frys;

public class Desktop extends Computer {

	@Override
	public String toString() {
		return "Name: " + name +"\n"+ "Driversize: "+ driverSize +"\n"+ "Watts: " + watts +"\n"+  "Price: " + price 
				+"\n"+ "With Monitor: " + withMonitor +"\n"+"Number in Stock: " + numInStock + "\n"+"Sale: "
				+ sale + "\n";
	}

	boolean withMonitor;
	
	
	
	public Desktop(String name, double price, boolean sale, int numInStock,
			int watts,int driverSize, boolean withMonitor) {
		super(name, price, sale, numInStock, watts, driverSize);
		
		this.withMonitor=withMonitor;
	

	}


	public boolean getMonitor()
	{
		return withMonitor;
	}

	public void setMonitor(boolean m)
	{
		withMonitor=m;
	}


}

