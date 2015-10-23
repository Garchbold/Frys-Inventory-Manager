package gui;
import frys.*;

import javax.swing.JFrame;

public class Driver extends GUI {

	public static void main(String[] args) {
		
		//Desktop desk = new Desktop("Pham's Desktop", 2500, true,300, 750, 1000, true);
		Desktop desk = new Desktop("Dell", 2500, false,15, 750, 1000, false);
		Cameras cam = new Cameras ("Nikon", 500, false, 25, 550, true);
		Games game = new Games ("Civilizations V", 29.99, true, 50, false, false);
		CD cd = new CD ("Berzerk", 10, true, 200, "Eminem");
		TV tv = new TV ("Panasonic", 2000, false, 12, 900, 70);
		Laptop lap =  new Laptop("Alienware", 980, false, 13, 750, 500, false);
		Movies movie = new Movies ("Shrek 2", 15, true, 50, true,"Comedy", 2007);
		
		
		FrysProducts.list.add(cam);
		FrysProducts.list.add(game);
		FrysProducts.list.add(cd);
		FrysProducts.list.add(desk);
		FrysProducts.list.add(tv);
		FrysProducts.list.add(lap);
		FrysProducts.list.add(movie);
		
		
		final JFrame frame = new JFrame("Fry's Electronics");
		frame.setSize(600, 600);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setLocation(400,200);
		createGUI(frame);
		frame.setVisible(true);

	}

}
