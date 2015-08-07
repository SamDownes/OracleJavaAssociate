public abstract class SmartDevice {

	String manufacturer;
	String model;

	
	public SmartDevice(String manufacturer, String model){
		this.manufacturer = manufacturer;
		this.model = model;
		
	}

	// This Super constructor will return the manufacturer and model of each SmartDevice Object we create
	public String toString(){
		return this.manufacturer + this.model;
	}


}// End of SmartDevice
