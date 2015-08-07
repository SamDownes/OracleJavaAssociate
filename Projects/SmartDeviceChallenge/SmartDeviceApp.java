import java.util.ArrayList;

public class SmartDeviceApp{


	public static void main(String[] args) {

		SmartDeviceApp sda = new SmartDeviceApp();
		
		sda.startProgram();

	
	}// End of Main
	
	
	public void startProgram(){

		// Create an ArrayList to store Objects of type SmartDevice
		ArrayList<SmartDevice> devices = new ArrayList<SmartDevice>();
		
		
		// Now lets add some devices to the list and print them to the console
		System.out.println("-------Welcome To The SmartDeviceApp-------");
		devices.add(new SmartPhone("HTC", " X++", " 087-4925679"));
		devices.add(new SmartPhone("Sony", " Xperia M5", " 086-9779345"));
		devices.add(new SmartPhone("Alcatel", " Flash Plus", " 087-9236781"));
		devices.add(new SmartPhone("Huawei", " Honor 4A", " 089-2356761"));
		devices.add(new SmartPhone("Amazon", " Fire Phone", " 087-1258908\n"));
		
		devices.add(new SmartTablet("iPad", " Air 2", " descartes"));
		devices.add(new SmartTablet("Samsung", " Galaxy Tab", " fahrenheit400"));
		devices.add(new SmartTablet("Google", " Nexus", " assyria530"));
		devices.add(new SmartTablet("Lenovo", " Yoga", " cambrian230"));
		devices.add(new SmartTablet("Amazon", " Kindle", " kingsransom1235"));
		
		
		// For all the Objects of type SmartDevice in the ArrayList devices print them
		for(SmartDevice sd : devices){
			System.out.println(sd);
		}
		
	
	}// End of startProgram
	
}// End of SmartDeviceApp
