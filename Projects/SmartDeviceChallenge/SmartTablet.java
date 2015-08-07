
public class SmartTablet extends SmartDevice{
	
	String wifiWord;
	
	
	public SmartTablet(String manufacturer, String model, String wifiWord){
		super(manufacturer, model);
		this.wifiWord = wifiWord;
	}
	
	// This will return our Super constructor and the wifiWord specific to each SmartTablet Object
	public String toString(){
		return super.toString() + wifiWord;
	}
	

}// End of SmartTablet
