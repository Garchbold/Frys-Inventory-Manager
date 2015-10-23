package frys;

public class CD extends NonElectronics{



String artist;


public String getArtist() {

return artist;

}

public void setArtist(String artist)
{
	this.artist=artist;
}

public CD(String name, double price, boolean sale, int stock, String artist) {

super( name, price, sale, stock);
this.artist=artist;

}

@Override
public String toString() {
	return "Name: " + name + "\n"+ "Artist: " + artist +"\n"+ "Price: " + price
			+ "\n"+ "Number in stock: " + numInStock +"\n"+ "Sale: " + sale +"\n";
}

}