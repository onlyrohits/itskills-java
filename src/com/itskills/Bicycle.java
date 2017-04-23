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

	
	final String manufacturerName = ""; // Single line comment 
	final float bicycleHeight = 0.0f, bicycleWeight = 0.0f;
	final int[] gears = {};
	
	static int _VERSION = 1;
	
	
	// the Bicycle class has
    // three fields
    private int cadence;
    private int gear;
    private int speed;
        
    
    
    protected Bicycle() {
		super();
	}
    
    

	// the Bicycle class has
    // one constructor
 /*  public Bicycle(int startCadence, int startSpeed, int startGear, String manufacturerName, float bicycleHeight, float bicycleWeight, int[] gears) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
        
       // this.manufacturerName = manufacturerName; 
        //this.bicycleHeight = bicycleHeight;
        //this.bicycleWeight = bicycleWeight;
        //this.gears = gears;
        
    }
        
    public Bicycle(int currentGear, float currentSpeed, float currentDistance) {
		super();
		this.currentGear = currentGear;
		this.currentSpeed = currentSpeed;
		this.currentDistance = currentDistance;
	}

*/

	int currentGear;
    public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getCurrentGear() {
		return currentGear;
	}

	public void setCurrentGear(int currentGear) {
		this.currentGear = currentGear;
	}

	public float getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(float currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	public float getCurrentDistance() {
		return currentDistance;
	}

	public void setCurrentDistance(float currentDistance) {
		this.currentDistance = currentDistance;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public float getBicycleHeight() {
		return bicycleHeight;
	}

	public float getBicycleWeight() {
		return bicycleWeight;
	}

	public int[] getGears() {
		return gears;
	}

	public int getCadence() {
		return cadence;
	}

	public int getGear() {
		return gear;
	}



	float currentSpeed, currentDistance; // Single line declaration
    
    public void changeGear(){ 
    	//currentGear = gears[(int )(Math. random() * gears.length + 1)]; 
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
