package frys;
import java.util.ArrayList;
import java.util.LinkedList;


public abstract class FrysProducts {

	public static ArrayList<Object> list=new ArrayList <Object>();
	
	String name;
	double price; 
	int numInStock;
	boolean sale;
	
	public String getName()
	{
		return name;
	}
	public double getPrice()
	{
		return price;
	}
	public int getNumInStock()
	{
		return numInStock;
	}
	public boolean getSale()
	{
		return sale;
	}
	
	public void setName(String n)
	{
		name=n;
	}
	public void setPrice(double p)
	{
		price=p;
	}
	public void setNumInStock(int n)
	{
		numInStock=n;
	}
	public void setSale(boolean s)
	{
		sale=s;
	}


}
