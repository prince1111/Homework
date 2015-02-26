/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java;

import java.util.Scanner;

/**
 *
 * @author anualli
 */
public class Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        String city;
        // Ask the user's favorite city.
        try ( //  Create a Scanner object for keyboard input.
                Scanner keyboard = new Scanner(System.in)) {
            // Ask the user's favorite city.
            System.out.println("Enter the name of your city: ");
            city = keyboard.nextLine();
            // close stream
        }
       
          // Show the number of characters.
         System.out.println("Number of characters: " + city.length());
         
           //Show the city name in uppercase characters.
        System.out.println(city.toUpperCase());
        
            // Show the city name in lowercase characters.
          
        System.out.println(city.toLowerCase());
        
        // Show the first character in the city name.
         
        System.out.println(city.charAt(0));
    }
    
}
