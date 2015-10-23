package frys;

public abstract class Computer extends Electronics{

	
	int driverSize;
	
	public Computer (String name, double price, boolean sale, int numInStock, int watts,
			int driverSize)
	{
		this.name=name;
		this.price=price;
		this.sale=sale;
		this.driverSize=driverSize;
		this.numInStock=numInStock;
		this.watts=watts;
	}
	

	public int getDriver()
	{
		return driverSize;
	}
	public void setDriver (int d)
	{
		driverSize=d;
	}

}

