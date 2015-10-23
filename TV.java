package frys;

public class TV extends Electronics {
	
	int inch;

public TV (String name, double price, boolean sale, int numInStock, int watts, int inch)
	{
		this.name=name;
		this.price=price;
		this.sale=sale;
		this.numInStock=numInStock;
		this.watts=watts;
		this.inch=inch;
	
	}

	public int getInch()
	{
		return inch;
	}
	public void setInch(int i)
	{
		inch=i;
	}
	@Override
	public String toString() {
		return "Name: " + name +"\n"+ "Inch: "+ inch +"\n"+ "Watts: " + watts +"\n"+  "Price: " + price 
				 +"\n"+"Number in Stock: " + numInStock + "\n"+"Sale: "
				+ sale + "\n";
	}
	
}