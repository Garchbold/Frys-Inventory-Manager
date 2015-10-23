package frys;


public class Games extends DVD implements Discountable{

//public static ArrayList<Games> gamesList = new ArrayList<Games>();

boolean console;


public boolean getConsole(){

return console;

}


public Games(String name, double price, boolean sale, int stock, boolean bluray, boolean console) {

super(name, price, sale, stock, bluray);

this.console = console;

}


@Override
public String toString() {
	return "Name: " + name + "\n"+ "Bluray: " + bluray + "\n"+ "Console: " + console +"\n"+ "Price: " + price
			+ "\n"+ "Number in stock: " + numInStock +"\n"+ "Sale: " + sale +"\n";
}


@Override
public void onSale() {
	sale = true;
	
}
}

