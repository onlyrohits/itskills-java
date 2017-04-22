/**
 * 
 */
package com.itskills;

/**
 * @author Rohit
 * Java Class
 *
 */
public class Bicycle {

	
	final String manufacturerName; // Single line comment 
	final float bicycleHeight, bicycleWeight;
	final int[] gears;
	
	// the Bicycle class has
    // three fields
    public int cadence;
    public int gear;
    public int speed;
        
    // the Bicycle class has
    // one constructor
    public Bicycle(int startCadence, int startSpeed, int startGear, String manufacturerName, float bicycleHeight, float bicycleWeight, int[] gears) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
        
        this.manufacturerName = manufacturerName; 
        this.bicycleHeight = bicycleHeight;
        this.bicycleWeight = bicycleWeight;
        this.gears = gears;
        
    }
        
    int currentGear;
    float currentSpeed, currentDistance; // Single line declaration
    
    public void changeGear(){ 
    	currentGear = gears[(int )(Math. random() * gears.length + 1)]; 
    	setGear(currentGear);
    }
    
    // the Bicycle class has
    // four methods
    public void setCadence(int newValue) {
        cadence = newValue;
    }
        
    public void setGear(int newValue) {
        gear = newValue;
    }
        
    public void brake(int decrement) {
        speed -= decrement;
    }
        
    public void accelerate(int increment) {
        speed += increment;
        System.out.println("New speed : " + speed);
    }

}
