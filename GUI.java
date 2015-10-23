package gui;

/**
 * Created by Eric Bittner
 * Kris Michelsen
 * George Archbold
 * 
 * boolean input error
 * can't edit the objects once they've been created
 * couldn't get the scroll pane to work on textAreas
 * 
 * go back goes all the way to the beginning instead of just 1 screen back
 * ^ did this to avoid creating 10+ go back buttons
 */

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.ListIterator;

import javax.swing.*;
import javax.swing.border.LineBorder;

import frys.*;


public class GUI extends JFrame {
	
	public static void createGUI(JFrame f) {

		final JPanel panelOriginal = new JPanel();

		final JTextArea txt = new JTextArea(30, 45);
		final LineBorder lineBorder = new LineBorder(Color.gray, 5, true);
		txt.setBorder(lineBorder);
		txt.setEditable(false);

		final JTextArea txt2 = new JTextArea(30, 45);
		txt2.setBorder(lineBorder);
		txt2.setEditable(false);
		//final JScrollPane scroll = new JScrollPane(txt2);
		//scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		//scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

		f.add(panelOriginal);
		f.validate();

		final JLabel label = new JLabel("Welcome to Fry's electronics, "
				+ "what would you like to access today?");
		final JLabel label2 = new JLabel(
				"What electronic would you like to check?");
		final JLabel label3 = new JLabel(
				"What computer would you like to check?");
		final JLabel label4 = new JLabel(
				"What non-electronic item would you like to check?");
		final JLabel label5 = new JLabel("What item would you like to add?");

		final JLabel nameLabel = new JLabel("Name of item");
		final JLabel priceLabel = new JLabel("Enter price $");
		final JLabel saleLabel = new JLabel("Is it on sale (use true or false)");
		final JLabel numLabel = new JLabel("Number in stock");
		final JLabel wattsLabel = new JLabel("How many watts?");
		final JLabel notebookLabel = new JLabel(
				"Is it a notebook? (use true or false)");
		final JLabel driverLabel = new JLabel("Driver size");
		final JLabel monitorLabel = new JLabel(
				"Does it include a monitor? (use true or false");
		final JLabel digitalLabel = new JLabel(
				"Is it digital? (use true or false");
		final JLabel blurayLabel = new JLabel(
				"Is it bluray? (use true or false)");
		final JLabel inchLabel = new JLabel("Number of Inches");
		final JLabel genreLabel = new JLabel("Genre");
		final JLabel yearLabel = new JLabel("Year released");
		final JLabel artistLabel = new JLabel("Artist(s) name");
		final JLabel consoleLabel = new JLabel(
				"Is it a console game? (use true or false)");
		final JLabel searchLabel = new JLabel("Enter a keyword");
		final JLabel removeLabel = new JLabel(
				"What is the name of the item you want to remove?");
		final JLabel errorLabel = new JLabel();

		final String[] adding = { "Laptop", "Desktop", "Camera", "TV", "Movie",
				"CD", "Game" };
		final JComboBox addBox = new JComboBox(adding);
		
		final JButton btnElect = new JButton("Electronics");
		final JButton btnNonElect = new JButton("Non-Electronics");
		final JButton btnSeeAll = new JButton("See full inventory");
		final JButton btnGoBack = new JButton("Go back");
		final JButton compButton = new JButton("Computers");
		final JButton tvButton = new JButton("Televison");
		final JButton camButton = new JButton("Cameras");
		final JButton cdButton = new JButton("CD's");
		final JButton dvdButton = new JButton("DVD's");
		final JButton gamesButton = new JButton("Games");
		final JButton moviesButton = new JButton("Movies");
		final JButton labButton = new JButton("Laptops");
		final JButton deskButton = new JButton("Desktops");
		final JButton searchButton = new JButton("Search");
		final JButton deleteButton = new JButton("Delete Item");
		final JButton addButton = new JButton("Add Item");
		final JButton continueButton = new JButton("Continue");
		final JButton finalizeButton = new JButton("Finalize");
		final JButton searchButton2 = new JButton("Continue");
		final JButton deleteButton2 = new JButton("Continue");

		final JTextField nameTextField = new JTextField(35);
		final JTextField priceTextField = new JTextField(35);
		final JTextField saleTextField = new JTextField(30);
		final JTextField numInStockTextField = new JTextField(32);
		final JTextField wattsTextField = new JTextField(35);
		final JTextField notebookTextField = new JTextField(28);
		final JTextField driverTextField = new JTextField(30);
		final JTextField monitorTextField = new JTextField(19);
		final JTextField digitalTextField = new JTextField(27);
		final JTextField inchTextField = new JTextField(35);
		final JTextField blurayTextField = new JTextField(27);
		final JTextField genreTextField = new JTextField(43);
		final JTextField yearTextField = new JTextField(40);
		final JTextField artistTextField = new JTextField(39);
		final JTextField consoleTextField = new JTextField(25);
		final JTextField searchTextField = new JTextField(25);

		//JScrollPane scrollPane = new JScrollPane(txt);
		//JScrollPane scrollPane2 = new JScrollPane(txt2);

		panelOriginal.add(label);
		panelOriginal.add(btnSeeAll);
		panelOriginal.add(btnElect);
		panelOriginal.add(btnNonElect);
		panelOriginal.validate();

		btnElect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setVisible(false);
				btnElect.setVisible(false);
				btnNonElect.setVisible(false);
				btnSeeAll.setVisible(false);

				label2.setVisible(true);
				compButton.setVisible(true);
				tvButton.setVisible(true);
				camButton.setVisible(true);
				compButton.setEnabled(true);
				tvButton.setEnabled(true);
				camButton.setEnabled(true);

				panelOriginal.add(label2);
				panelOriginal.add(compButton);
				panelOriginal.add(tvButton);
				panelOriginal.add(camButton);

				tvButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						compButton.setEnabled(false);
						camButton.setEnabled(false);
						label2.setVisible(false);

						txt2.setVisible(true);
						btnGoBack.setVisible(true);
						addButton.setVisible(true);

						panelOriginal.add(txt2);
						panelOriginal.add(addButton);
						panelOriginal.add(btnGoBack);
						panelOriginal.validate();

						String print;
						txt2.setText(null);

						for (int i = 0; i < FrysProducts.list.size(); i++) {
							if (FrysProducts.list.get(i) instanceof TV)
								txt2.setText(txt2.getText()
										+ FrysProducts.list.get(i) + "\n");
						}
					}
				});
				camButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						tvButton.setEnabled(false);
						compButton.setEnabled(false);
						label2.setVisible(false);

						txt2.setVisible(true);
						btnGoBack.setVisible(true);
						addButton.setVisible(true);

						panelOriginal.add(txt2);
						panelOriginal.add(btnGoBack);
						panelOriginal.add(addButton);
						panelOriginal.validate();

						String print;
						txt2.setText(null);

						for (int i = 0; i < FrysProducts.list.size(); i++) {
							if (FrysProducts.list.get(i) instanceof Cameras)
								txt2.setText(txt2.getText()
										+ FrysProducts.list.get(i) + "\n");
						}
					}
				});

				compButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						label2.setVisible(false);
						tvButton.setVisible(false);
						camButton.setVisible(false);
						compButton.setVisible(false);

						label3.setVisible(true);
						labButton.setVisible(true);
						deskButton.setVisible(true);

						panelOriginal.add(label3);
						panelOriginal.add(labButton);
						panelOriginal.add(deskButton);

						labButton.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								// txt2.setVisible(true);
								label2.setVisible(false);

								txt2.setVisible(true);
								btnGoBack.setVisible(true);
								addButton.setVisible(true);

								panelOriginal.add(txt2);
								panelOriginal.add(btnGoBack);
								panelOriginal.add(addButton);
								panelOriginal.validate();

								String print;
								txt2.setText(null);

								for (int i = 0; i < FrysProducts.list.size(); i++) {
									if (FrysProducts.list.get(i) instanceof Laptop)
										txt2.setText(txt2.getText()
												+ FrysProducts.list.get(i)
												+ "\n");
								}
							}
						});

						deskButton.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								label2.setVisible(false);

								txt2.setVisible(true);
								btnGoBack.setVisible(true);
								addButton.setVisible(true);

								panelOriginal.add(txt2);
								panelOriginal.add(btnGoBack);
								panelOriginal.add(addButton);
								panelOriginal.validate();

								String print;
								txt2.setText(null);

								for (int i = 0; i < FrysProducts.list.size(); i++) {
									if (FrysProducts.list.get(i) instanceof Desktop)
										txt2.setText(txt2.getText()
												+ FrysProducts.list.get(i)
												+ "\n");
								}
							}
						});
					}

				});// end of compButton action Listener

			}
		});//end of electronic action listener

		btnNonElect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label.setVisible(false);
				btnElect.setVisible(false);
				btnNonElect.setVisible(false);
				btnSeeAll.setVisible(false);

				label4.setVisible(true);
				cdButton.setVisible(true);
				cdButton.setEnabled(true);
				dvdButton.setVisible(true);
				dvdButton.setEnabled(true);

				panelOriginal.add(label4);
				panelOriginal.add(cdButton);
				panelOriginal.add(dvdButton);

				cdButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dvdButton.setEnabled(false);
						label4.setVisible(false);

						txt2.setVisible(true);
						btnGoBack.setVisible(true);
						addButton.setVisible(true);

						panelOriginal.add(txt2);
						panelOriginal.add(btnGoBack);
						panelOriginal.add(addButton);
						panelOriginal.validate();

						String print;
						txt2.setText(null);

						for (int i = 0; i < FrysProducts.list.size(); i++) {
							if (FrysProducts.list.get(i) instanceof CD)
								txt2.setText(txt2.getText()
										+ FrysProducts.list.get(i) + "\n");
						}
					}
				});// end of cdButton AL

				dvdButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						label2.setVisible(false);
						cdButton.setVisible(false);
						dvdButton.setVisible(false);

						label4.setVisible(true);
						gamesButton.setVisible(true);
						moviesButton.setVisible(true);

						panelOriginal.add(label4);
						panelOriginal.add(gamesButton);
						panelOriginal.add(moviesButton);

						moviesButton.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								label4.setVisible(false);

								txt2.setVisible(true);
								btnGoBack.setVisible(true);
								addButton.setVisible(true);

								panelOriginal.add(txt2);
								panelOriginal.add(btnGoBack);
								panelOriginal.add(addButton);
								panelOriginal.validate();
								String print;
								txt2.setText(null);

								for (int i = 0; i < FrysProducts.list.size(); i++) {
									if (FrysProducts.list.get(i) instanceof Movies)
										txt2.setText(txt2.getText()
												+ FrysProducts.list.get(i)
												+ "\n");
								}
							}
						});// end of movies AL

						gamesButton.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								label4.setVisible(false);

								txt2.setVisible(true);
								btnGoBack.setVisible(true);
								addButton.setVisible(true);

								panelOriginal.add(txt2);
								panelOriginal.add(btnGoBack);
								panelOriginal.add(addButton);
								panelOriginal.validate();
								String print;
								txt2.setText(null);

								for (int i = 0; i < FrysProducts.list.size(); i++) {
									if (FrysProducts.list.get(i) instanceof Games)
										txt2.setText(txt2.getText()
												+ FrysProducts.list.get(i)
												+ "\n");
								}

							}
						});// end of games AL
					}
				});// end of DVD AL

			}
		});//end of non-elect AL

		btnSeeAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String print = "Type:		Name:		Number In Stock:\n\n";
				String type = null;

				label.setVisible(false);

				btnElect.setVisible(false);
				btnNonElect.setVisible(false);
				btnSeeAll.setVisible(false);

				searchButton.setVisible(true);
				deleteButton.setVisible(true);
				addButton.setVisible(true);

				txt.setVisible(true);
				btnGoBack.setVisible(true);

				panelOriginal.add(txt);
				panelOriginal.add(btnGoBack);
				panelOriginal.add(searchButton);
				panelOriginal.add(addButton);
				panelOriginal.add(deleteButton);
				panelOriginal.validate();

				for (int i = 0; i < FrysProducts.list.size(); i++) {

					if (FrysProducts.list.get(i) instanceof Cameras) {
						type = "Camera		";
					}
					if (FrysProducts.list.get(i) instanceof Movies) {
						type = "Movie		";
					}
					if (FrysProducts.list.get(i) instanceof Games) {
						type = "Game		";
					}
					if (FrysProducts.list.get(i) instanceof Desktop) {
						type = "Desktop		";
					}
					if (FrysProducts.list.get(i) instanceof Laptop) {
						type = "Laptop		";
					}
					if (FrysProducts.list.get(i) instanceof TV) {
						type = "TV		";
					}
					if (FrysProducts.list.get(i) instanceof CD) {
						type = "CD		";
					}

					if (FrysProducts.list.isEmpty() == true)
						//this doesn't do anythign since the list will never be empty
						txt.setText("No inventory at this time");
					else
						print = print
								+ type
								+ ((FrysProducts) FrysProducts.list.get(i))
										.getName()
								+ "		"
								+ ((FrysProducts) FrysProducts.list.get(i))
										.getNumInStock() + "\n";
					txt.setText(print);

				}

			}
		});//end of see all AL

		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				btnGoBack.setVisible(false);
				compButton.setVisible(false);
				tvButton.setVisible(false);
				camButton.setVisible(false);
				cdButton.setVisible(false);
				dvdButton.setVisible(false);
				gamesButton.setVisible(false);
				moviesButton.setVisible(false);
				labButton.setVisible(false);
				deskButton.setVisible(false);
				searchButton.setVisible(false);
				deleteButton.setVisible(false);
				addButton.setVisible(false);
				addBox.setVisible(false);
				continueButton.setVisible(false);
				notebookLabel.setVisible(false);
				notebookTextField.setVisible(false);
				driverLabel.setVisible(false);
				driverTextField.setVisible(false);
				monitorLabel.setVisible(false);
				monitorTextField.setVisible(false);
				digitalLabel.setVisible(false);
				digitalTextField.setVisible(false);
				inchLabel.setVisible(false);
				inchTextField.setVisible(false);
				blurayLabel.setVisible(false);
				blurayTextField.setVisible(false);
				genreLabel.setVisible(false);
				genreTextField.setVisible(false);
				yearLabel.setVisible(false);
				yearTextField.setVisible(false);
				artistLabel.setVisible(false);
				artistTextField.setVisible(false);
				consoleLabel.setVisible(false);
				consoleTextField.setVisible(false);
				searchLabel.setVisible(false);
				searchTextField.setVisible(false);
				searchButton2.setVisible(false);
				deleteButton.setVisible(false);
				deleteButton2.setVisible(false);
				removeLabel.setVisible(false);
				errorLabel.setVisible(false);

				label2.setVisible(false);
				label3.setVisible(false);
				label4.setVisible(false);
				label5.setVisible(false);
				nameLabel.setVisible(false);
				saleLabel.setVisible(false);
				numLabel.setVisible(false);
				priceLabel.setVisible(false);
				wattsLabel.setVisible(false);

				finalizeButton.setVisible(false);
				wattsTextField.setVisible(false);

				nameTextField.setVisible(false);
				priceTextField.setVisible(false);
				saleTextField.setVisible(false);
				numInStockTextField.setVisible(false);

				txt.setVisible(false);
				txt2.setVisible(false);

				label.setVisible(true);
				btnElect.setVisible(true);
				btnNonElect.setVisible(true);
				btnSeeAll.setVisible(true);
				addBox.setEnabled(true);

				panelOriginal.add(label);
				panelOriginal.add(btnSeeAll);
				panelOriginal.add(btnElect);
				panelOriginal.add(btnNonElect);
				panelOriginal.validate();

			}
		});//end of goback button
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				compButton.setVisible(false);
				tvButton.setVisible(false);
				camButton.setVisible(false);
				cdButton.setVisible(false);
				dvdButton.setVisible(false);
				gamesButton.setVisible(false);
				moviesButton.setVisible(false);
				labButton.setVisible(false);
				deskButton.setVisible(false);
				searchButton.setVisible(false);
				deleteButton.setVisible(false);
				addButton.setVisible(false);
				notebookLabel.setVisible(false);
				notebookTextField.setVisible(false);
				driverLabel.setVisible(false);
				driverTextField.setVisible(false);
				monitorLabel.setVisible(false);
				monitorTextField.setVisible(false);
				digitalLabel.setVisible(false);
				digitalTextField.setVisible(false);
				inchLabel.setVisible(false);
				inchTextField.setVisible(false);
				blurayLabel.setVisible(false);
				blurayTextField.setVisible(false);
				genreLabel.setVisible(false);
				genreTextField.setVisible(false);
				yearLabel.setVisible(false);
				yearTextField.setVisible(false);
				artistLabel.setVisible(false);
				artistTextField.setVisible(false);
				consoleLabel.setVisible(false);
				consoleTextField.setVisible(false);
				searchLabel.setVisible(false);
				searchTextField.setVisible(false);
				searchButton2.setVisible(false);
				deleteButton.setVisible(false);
				deleteButton2.setVisible(false);
				removeLabel.setVisible(false);
				errorLabel.setVisible(false);

				label2.setVisible(false);
				label3.setVisible(false);
				label4.setVisible(false);
				nameLabel.setVisible(false);
				saleLabel.setVisible(false);
				numLabel.setVisible(false);
				priceLabel.setVisible(false);
				wattsLabel.setVisible(false);
				txt.setVisible(false);
				txt2.setVisible(false);

				label5.setVisible(true);
				addBox.setVisible(true);
				continueButton.setVisible(true);

				panelOriginal.add(label5);
				panelOriginal.add(addBox);
				panelOriginal.add(continueButton);
				panelOriginal.add(btnGoBack);
				panelOriginal.validate();

			}
		});//end of addButton

		continueButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				continueButton.setVisible(false);
				nameTextField.setVisible(true);
				priceTextField.setVisible(true);
				saleTextField.setVisible(true);
				numInStockTextField.setVisible(true);
				nameLabel.setVisible(true);
				saleLabel.setVisible(true);
				numLabel.setVisible(true);
				priceLabel.setVisible(true);
				finalizeButton.setVisible(true);
				addBox.setEnabled(false);

				finalizeButton.setEnabled(true);

				panelOriginal.add(finalizeButton);

				panelOriginal.add(nameLabel);
				panelOriginal.add(nameTextField);
				panelOriginal.add(priceLabel);
				panelOriginal.add(priceTextField);
				panelOriginal.add(saleLabel);
				panelOriginal.add(saleTextField);
				panelOriginal.add(numLabel);
				panelOriginal.add(numInStockTextField);

				panelOriginal.validate();
				switch (addBox.getSelectedIndex()) {
				case 0:
					wattsLabel.setVisible(true);
					wattsTextField.setVisible(true);
					notebookLabel.setVisible(true);
					notebookTextField.setVisible(true);
					driverLabel.setVisible(true);
					driverTextField.setVisible(true);

					panelOriginal.add(wattsLabel);
					panelOriginal.add(wattsTextField);
					panelOriginal.add(driverLabel);
					panelOriginal.add(driverTextField);
					panelOriginal.add(notebookLabel);
					panelOriginal.add(notebookTextField);

					break;
				case 1:
					wattsLabel.setVisible(true);
					wattsTextField.setVisible(true);
					monitorLabel.setVisible(true);
					monitorTextField.setVisible(true);
					driverLabel.setVisible(true);
					driverTextField.setVisible(true);

					panelOriginal.add(wattsLabel);
					panelOriginal.add(wattsTextField);
					panelOriginal.add(driverLabel);
					panelOriginal.add(driverTextField);
					panelOriginal.add(monitorLabel);
					panelOriginal.add(monitorTextField);
					break;
				case 2:
					wattsLabel.setVisible(true);
					wattsTextField.setVisible(true);
					digitalLabel.setVisible(true);
					digitalTextField.setVisible(true);

					panelOriginal.add(wattsLabel);
					panelOriginal.add(wattsTextField);

					panelOriginal.add(digitalLabel);
					panelOriginal.add(digitalTextField);
					break;
				case 3:
					wattsLabel.setVisible(true);
					wattsTextField.setVisible(true);
					inchLabel.setVisible(true);
					inchTextField.setVisible(true);

					panelOriginal.add(wattsLabel);
					panelOriginal.add(wattsTextField);

					panelOriginal.add(inchLabel);
					panelOriginal.add(inchTextField);
					break;
				case 4:
					blurayLabel.setVisible(true);
					blurayTextField.setVisible(true);
					genreLabel.setVisible(true);
					genreTextField.setVisible(true);
					yearLabel.setVisible(true);
					yearTextField.setVisible(true);

					panelOriginal.add(yearLabel);
					panelOriginal.add(yearTextField);
					panelOriginal.add(genreLabel);
					panelOriginal.add(genreTextField);
					panelOriginal.add(blurayLabel);
					panelOriginal.add(blurayTextField);
					break;
				case 5:
					artistLabel.setVisible(true);
					artistTextField.setVisible(true);

					panelOriginal.add(artistLabel);
					panelOriginal.add(artistTextField);
					break;
				case 6:
					blurayLabel.setVisible(true);
					blurayTextField.setVisible(true);
					consoleLabel.setVisible(true);
					consoleTextField.setVisible(true);

					panelOriginal.add(blurayLabel);
					panelOriginal.add(blurayTextField);
					panelOriginal.add(consoleLabel);
					panelOriginal.add(consoleTextField);
				}

			}
		});//end of continue button

		finalizeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					switch (addBox.getSelectedIndex()) {
					case 0:
						Laptop laptop = new Laptop(nameTextField.getText(),
								Double.valueOf(priceTextField.getText()),
								Boolean.valueOf(saleTextField.getText()),
								Integer.valueOf(numInStockTextField.getText()),
								Integer.valueOf(wattsTextField.getText()),
								Integer.valueOf(driverTextField.getText()),
								Boolean.valueOf(notebookTextField.getText()));
						FrysProducts.list.add(laptop);
						break;
					case 1:
						Desktop desktop = new Desktop(nameTextField.getText(),
								Double.valueOf(priceTextField.getText()),
								Boolean.valueOf(saleTextField.getText()),
								Integer.valueOf(numInStockTextField.getText()),
								Integer.valueOf(wattsTextField.getText()),
								Integer.valueOf(driverTextField.getText()),
								Boolean.valueOf(monitorTextField.getText()));
						FrysProducts.list.add(desktop);
						break;
					case 2:
						Cameras camera = new Cameras(nameTextField.getText(),
								Double.valueOf(priceTextField.getText()),
								Boolean.valueOf(saleTextField.getText()),
								Integer.valueOf(numInStockTextField.getText()),
								Integer.valueOf(wattsTextField.getText()),
								Boolean.valueOf(digitalTextField.getText()));
						FrysProducts.list.add(camera);
						break;
					case 3:
						TV tv = new TV(nameTextField.getText(), Double
								.valueOf(priceTextField.getText()), Boolean
								.valueOf(saleTextField.getText()), Integer
								.valueOf(numInStockTextField.getText()),
								Integer.valueOf(wattsTextField.getText()),
								Integer.valueOf(inchTextField.getText()));
						FrysProducts.list.add(tv);
						break;
					case 4:
						Movies movie = new Movies(nameTextField.getText(),
								Double.valueOf(priceTextField.getText()),
								Boolean.valueOf(saleTextField.getText()),
								Integer.valueOf(numInStockTextField.getText()),
								Boolean.valueOf(blurayTextField.getText()),
								genreTextField.getText(), Integer
										.valueOf(yearTextField.getText()));
						FrysProducts.list.add(movie);
						break;
					case 5:
						CD cd = new CD(nameTextField.getText(), Double
								.valueOf(priceTextField.getText()), Boolean
								.valueOf(saleTextField.getText()), Integer
								.valueOf(numInStockTextField.getText()),
								artistTextField.getText());
						FrysProducts.list.add(cd);
						break;
					case 6:
						Games games = new Games(nameTextField.getText(), Double
								.valueOf(priceTextField.getText()), Boolean
								.valueOf(saleTextField.getText()), Integer
								.valueOf(numInStockTextField.getText()),
								Boolean.valueOf(blurayTextField.getText()),
								Boolean.valueOf(consoleTextField.getText()));
						FrysProducts.list.add(games);

						break;

					}
					finalizeButton.setEnabled(false);
					errorLabel.setVisible(false);
					addBox.setEnabled(true);
					
					String print = "Type:		Name:		Number In Stock:\n\n";
					String type = null;
					
					nameTextField.setVisible(false);
					priceTextField.setVisible(false);
					saleTextField.setVisible(false);
					numInStockTextField.setVisible(false);
					blurayTextField.setVisible(false);
					consoleTextField.setVisible(false);
					artistTextField.setVisible(false);
					genreTextField.setVisible(false);
					yearTextField.setVisible(false);
					inchTextField.setVisible(false);
					digitalTextField.setVisible(false);
					wattsTextField.setVisible(false);
					monitorTextField.setVisible(false);
					driverTextField.setVisible(false);
					notebookTextField.setVisible(false);
					
					nameLabel.setVisible(false);
					saleLabel.setVisible(false);
					numLabel.setVisible(false);
					priceLabel.setVisible(false);
					nameLabel.setVisible(false);
					priceLabel.setVisible(false);
					saleLabel.setVisible(false);
					numLabel.setVisible(false);
					wattsLabel.setVisible(false);
					notebookLabel.setVisible(false);
					driverLabel.setVisible(false);
					monitorLabel.setVisible(false);
					digitalLabel.setVisible(false);
					blurayLabel .setVisible(false);
					inchLabel.setVisible(false);
					genreLabel .setVisible(false);
					yearLabel .setVisible(false);
					artistLabel .setVisible(false);
					consoleLabel .setVisible(false);
					searchLabel .setVisible(false);
					removeLabel .setVisible(false);
					errorLabel .setVisible(false);
					label5.setVisible(false);
					finalizeButton.setVisible(false);
					
					addBox.setVisible(false);
					

					searchButton.setVisible(true);
					deleteButton.setVisible(true);
					addButton.setVisible(true);

					txt.setVisible(true);
					btnGoBack.setVisible(true);

					panelOriginal.add(txt);
					panelOriginal.add(btnGoBack);
					panelOriginal.add(searchButton);
					panelOriginal.add(addButton);
					panelOriginal.add(deleteButton);
					panelOriginal.validate();

					for (int i = 0; i < FrysProducts.list.size(); i++) {

						if (FrysProducts.list.get(i) instanceof Cameras) {
							type = "Camera		";
						}
						if (FrysProducts.list.get(i) instanceof Movies) {
							type = "Movie		";
						}
						if (FrysProducts.list.get(i) instanceof Games) {
							type = "Game		";
						}
						if (FrysProducts.list.get(i) instanceof Desktop) {
							type = "Desktop		";
						}
						if (FrysProducts.list.get(i) instanceof Laptop) {
							type = "Laptop		";
						}
						if (FrysProducts.list.get(i) instanceof TV) {
							type = "TV		";
						}
						if (FrysProducts.list.get(i) instanceof CD) {
							type = "CD		";
						}

						if (FrysProducts.list.isEmpty() == true)
							txt.setText("No inventory at this time");
						else
							print = print
									+ type
									+ ((FrysProducts) FrysProducts.list.get(i))
											.getName()
									+ "		"
									+ ((FrysProducts) FrysProducts.list.get(i))
											.getNumInStock() + "\n";
					}			
					txt.setText(print);
				} catch (Exception e2) {
					errorLabel.setText("Please enter all of the data correctly");
					finalizeButton.setEnabled(true);
					errorLabel.setVisible(true);
					panelOriginal.add(errorLabel);
					
					panelOriginal.validate();
				}

			}
		});//end of finalize

		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt.setVisible(false);
				searchButton.setVisible(false);
				addButton.setVisible(false);
				deleteButton.setVisible(false);

				searchLabel.setVisible(true);
				searchTextField.setVisible(true);
				searchButton2.setVisible(true);

				panelOriginal.add(searchLabel);
				panelOriginal.add(searchTextField);
				panelOriginal.add(searchButton2);

			}
		});//end of search
		searchButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				searchLabel.setVisible(false);
				txt2.setVisible(true);
				panelOriginal.add(txt2);

				for (int i = 0; i < FrysProducts.list.size(); i++) {
					if (searchTextField.getText().isEmpty()
							|| !(searchTextField.getText())
									.equals(((FrysProducts) FrysProducts.list
											.get(i)).getName())) {
						txt2.setText("No such item can be found");
						break;
					}
				}

				for (int i = 0; i < FrysProducts.list.size(); i++) {

					if (searchTextField.getText()
							.equals(((FrysProducts) FrysProducts.list.get(i))
									.getName())) {

						txt2.setText(FrysProducts.list.get(i).toString());
					}

				}

				searchTextField.setVisible(false);
				searchButton.setVisible(false);
				searchButton2.setVisible(false);
			}
		});//end of search2

		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				txt.setVisible(false);
				searchButton.setVisible(false);
				addButton.setVisible(false);
				deleteButton.setVisible(false);

				panelOriginal.add(removeLabel);
				panelOriginal.add(searchTextField);
				panelOriginal.add(deleteButton2);

				removeLabel.setVisible(true);
				searchTextField.setVisible(true);
				deleteButton2.setVisible(true);
			}
		});//end of delete

		deleteButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelOriginal.add(txt2);
				txt2.setVisible(true);

				for (int i = 0; i < FrysProducts.list.size(); i++) {
					if (searchTextField.getText().isEmpty()
							|| !(searchTextField.getText())
									.equals(((FrysProducts) FrysProducts.list
											.get(i)).getName())) {
						txt2.setText("No such item can be found");
						break;
					}
				}

				for (int i = 0; i < FrysProducts.list.size(); i++) {

					if (searchTextField.getText().equals(((FrysProducts) FrysProducts.list.get(i)).getName())) 
					{

						txt2.setText(((FrysProducts) FrysProducts.list.get(i))
								.getName() + " has been deleted");
						FrysProducts.list.remove(i);
					}

				}

				/**
				 * we tried the iterator but it didn't end up working so we went with the previous method
				 * 
				 * Iterator<Object> iter = FrysProducts.list.iterator(); String
				 * s= ((FrysProducts) iter.next()).getName();
				 * 
				 * while (iter.hasNext()) { if
				 * (s.equals(searchTextField.getText())) iter.remove(); else
				 * iter.next(); }
				 **/
			}
		});// end of delete2
	}
}
