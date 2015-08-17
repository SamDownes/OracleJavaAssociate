
public class Bicycle {

	
	// The bicycle has three fields or variables
	private int cadence;
	private int gear;
	private int speed;
	
	// Initialise an id an class variable for numberOfBicycles
	private int id;
	private static int numberOfBicyles = 0;
	
	
	
	// This constructor allows assigns the value of start to each of the fields
	public Bicycle(int startCadence, int startGear, int startSpeed){
		cadence = startCadence;
		gear = startGear;
		speed = startSpeed;
		id = ++numberOfBicyles; // This will increment the id for each new Bicycle object
	}
	
	
	public static int getNumberOfBicycles(){
		return numberOfBicyles;
	}
	
	
	public int getCadence(){
		return cadence;
	}
	
	
	// This class has four methods 
	public void setCadence(int newCadence){
		cadence = newCadence;
	}
	
	
	public int getGear(){
		return gear;
	}
	
	
	// The void specifies no return type 
	public void setGear(int newGear){
		gear = newGear;
	}
	
	
	public int getSpeed(){
		return speed;
	}
	
	
	public void applyBrake(int decreaseSpeed){
		speed -= decreaseSpeed; 
	}
	
	
	public void speedUp(int increaseSpeed){
		speed += increaseSpeed; 
	}
	
	
}// End of Bicycle 
