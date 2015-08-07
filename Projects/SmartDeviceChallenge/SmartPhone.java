
public class SmartPhone extends SmartDevice{
	
	String phoneNumber;
	
	
	public SmartPhone(String manufacturer, String model, String phoneNumber){
		super(manufacturer, model);
		this.phoneNumber = phoneNumber;
	}
	
	// This will return our Super constructor as well as the phoneNumber for each SmartPhone Object
	public String toString(){
		return super.toString() + this.phoneNumber;
	}
	

}// End of SmartPhone
