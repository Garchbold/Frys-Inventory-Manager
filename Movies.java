package frys;

public class Movies extends DVD implements Discountable{



String genre;

int year;


public String getGenre() {

return genre;

}



public int getYear() {

return year;

}



public Movies(String name, double price, boolean sale, int stock,  boolean bluray, String genre, int year) {

super(name, price, sale, stock, bluray);

this.genre = genre;

this.year = year;


}

@Override
public String toString() {
	return "Name: " + name + "\n"+ "Bluray: " + bluray  +"\n"+ "Price: " + price
			+ "\n"+ "Number in stock: " + numInStock +"\n"+ "Year: " +year +"\n"+ "Genre: " + genre+"\n"+ "Sale: " + sale +"\n";
}







@Override
public void onSale() {
	sale = true;
	
}


}


