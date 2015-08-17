
public class TenBicycle extends Bicycle {
	
	
	private float gearRatio = 5f;
	private float wheelRPM;
	
	// This method will allow a new value to be passed into gearRatio
	public void setGearRatio(float newGearRatio){
		this.gearRatio = newGearRatio;
	}
	
	// Notice no local gearRatio, this value will be assigned using the setGearRatio() method 
	public void pedalRPM(float newPedalRPM){
		this.wheelRPM = newPedalRPM * gearRatio;
	}
	
	public float getWheelRPM(){
		return this.wheelRPM;
	}
	
	
}// End of TenBicycle
