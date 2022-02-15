package com.nighthawk.csa.starters.squirrel;

import java.util.ArrayList;
import java.lang.Math;

class Main {
  public static void main(String[] args){

// Write a Class Number
public class Number{

    // Instance variables
    private int squirrels;
    private int Index;

    // Number has a zero Argument constructor
    // It initializes a random number between 3 and 36, ie the number of squirrels in class
    public Number(){
        // Constructor
        squirrels = (int)(Math.random() * 34) + 3;
        System.out.println(squirrels);
        Index += 1;
    }

    // It contains a getter for the Random Number
    public int squirrelCount(){
      return squirrels;
    }

    // It contains a getter for Index, or the order it was initialized
    public int Index(){
      return Index;
    }

    // Write a tester method
    public static void main(String[] args) {

        // Create an ArrayList of Type Number, my ArrayList is called squirrels
      private ArrayList<Number> squirrels = new ArrayList<>();
        
        for(i = 0; i < 10; i++){

        // Initialize 10 squirrels of class type Number
        Number sqrl = new Number();

        // Insert Number instance into ArrayList Squirrel in least to greatest order by random number, mine required nested loops
          for(int sqrls : squirrels){
            if(sqrl.sqirrelCount() < sqrls.squirrelCount(){
              squirrels.add(sqrl);
            }


        // Print a formatted message with number of Squirrels and Index by which they were created, use enhanced for loop

        for(int sqrls : squirrels){
          System.out.print("Squirrel Count: " + sqrls.squirrelCount() + "Day: " + sqrls.Index());
        }
        
    }

}
  }
}
