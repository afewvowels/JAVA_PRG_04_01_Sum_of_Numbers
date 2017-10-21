/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_04_01_sum_of_numbers;

import javax.swing.JOptionPane;
/**
 *
 * @author bluebackdev
 * Write a program that asks the user for a positive nonzero integer value. The
 * program should use a loop to get the sum of all the integers from 1 up to
 * the number entered. For example, if the user enters 50, the loop will find
 * the sum of 1, 2, 3, 4, ...50.
 */
public class JAVA_PRG_04_01_Sum_of_Numbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declare variables to hold user inputs and sum of numbers
        int intUserValue;
        int intSum = 0;
        
        String strUserValue;
        
        // Loop while !valid user input
        do {
            strUserValue = JOptionPane.showInputDialog("Please enter a nonzero\n"
                + "positive integer vlaue.");
            intUserValue = Integer.parseInt(strUserValue);
        } while (intUserValue <= 0 || intUserValue >= 1000);
        
        // Run validated number through this loop
        // to sum up all the values
        for(int i = 0 ; i <= intUserValue ; i++) {
            intSum += i;
        }
        
        // Output calculated sum total to user
        JOptionPane.showMessageDialog(null, "The sum of those\n" 
            + "numbers is " + intSum + ".");
        
        // For user with JOptionPane
        System.exit(0);
    }
    
}
