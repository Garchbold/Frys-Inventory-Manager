package frys;

public class Cameras extends Electronics implements Discountable{
	
	boolean digital;
	
	public Cameras (String name, double price, boolean sale, int numInStock, int watts, boolean digital)
	{
		this.name=name;
		this.price=price;
		this.sale=sale;
		this.numInStock=numInStock;
		this.watts=watts;
		this.digital=digital;
		
	}

	public boolean getDigital()
	{
		return digital;
	}

	public void setDigital(boolean d)
	{
		digital=d;
	}
	@Override
	public String toString() {
		return "Name: " + name +"\n"+ "Digital: "+ digital +"\n"+ "Watts: " + watts +"\n"+  "Price: " + price 
				+"\n"+"Number in Stock: " + numInStock + "\n"+"Sale: "
				+ sale + "\n";
	}

	@Override
	public void onSale() {
		sale = true;
		
	}

	
	
}

