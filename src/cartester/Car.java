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
        + "passengers (including the driver) Car 01 can hold"));
    }
    public String toString() {
        return  "----------------"+ "\n"
                + "Model: " + model + "\n"
                + "Make: " + make + "\n"
                + "Year: " + year + "\n"
                + "Price: "+ price+ "\n"
                + "Colour: "+colour+"\n"
                + "Capacity: "+passengerLoad;
    }
}
