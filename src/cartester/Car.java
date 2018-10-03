/*
 * 
 */

package cartester;

import javax.swing.JOptionPane;

/**
 *
 * @author fedie2562
 */
public class Car {
    String model, make, colour;
    int year, passengerLoad;
    double price;
    public Car(){
        model = JOptionPane.showInputDialog("Please enter the model of Car 01");
        make = JOptionPane.showInputDialog("Please enter the make of Car 01");
        year = Integer.parseInt(JOptionPane.showInputDialog("Please enter the year of Car 01"));
        price = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of Car 01"));
        colour = JOptionPane.showInputDialog("Please enter the colour of Car 01");
        passengerLoad = Integer.parseInt(JOptionPane.showInputDialog("Please enter the amount of "
        + "people (including the driver) Car 01 can hold"));
    }
    public Car(String make2, String model2, int year2, int load){
        make = make2;
        model = model2;
        colour = JOptionPane.showInputDialog("Please enter the colour of Car 02");
        year = year2;
        passengerLoad = load;
        price = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of Car 02"));
    }
    public Car(String dColour){
        make = "Honda";
        model = "Civic";
        colour = dColour;
        year = 2003;
        price = 2499.99;
        passengerLoad = 5;
    }
    public String toString() {
        return    "Model: " + model+"\n"
                + "Make: " + make + "\n"
                + "Year: " + year + "\n"
                + "Price: "+ price+ "\n"
                + "Colour: "+colour+"\n"
                + "Capacity: "+passengerLoad+
                "\n----------------";
    }
    public void honk(){
        System.out.println("Beep! Beep!");
    }
}
