
public class MountainBike extends Bicycle {
	
	// This subclass has two fields
	private int seatHeight;
	private int startHeight;
	
	// This subclass inherits the constructor from the superclass
	public MountainBike(int startCadence, int startGear, int startSpeed) {
		super(startCadence, startGear, startSpeed);
		seatHeight = startHeight;
	}

	// This method allows the seatHeight to be set
	public void setHeight(int newSeatHeight){
		seatHeight = newSeatHeight;
	}
	

}// End of MountainBike
