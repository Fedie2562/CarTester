/*
 * Ferris D.
 * 01/10/2018
 * 
 */

package cartester;

import javax.swing.JOptionPane;

/**
 *
 * @author fedie2562
 */
public class CarTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        Car car1 = new Car();
        Car car2 = new Car("Civic", "Honda", 2003, 5);
        Car car3 = new Car(JOptionPane.showInputDialog("Please enter the colour of Car 03"));
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
    }
    
}
