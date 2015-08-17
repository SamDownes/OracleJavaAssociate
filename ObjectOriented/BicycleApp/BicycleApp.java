
public class BicycleApp {
	

	public static void main(String[] args) {
		// Create a Bicycle Object
		Bicycle b = new Bicycle();
		System.out.println("-----Welcome to the Bicycle App-----\n");
		b.pedalRPM(4);
		b.setDegreeOfTurn(4);
		System.out.println("The degree of turn for this bicycle is: " + b.getDegreeOfTurn());
		// Remember that the default value for the gear ratio in this method was 2f and the pedalRPM has been set to 4 above
		System.out.println("The wheel RPM for this bicycle is: " + b.getWheelRPM());
		
		// Create a TenBicycle Object
		TenBicycle tb = new TenBicycle();
		tb.setDegreeOfTurn(7);
		tb.setGearRatio(20);
		tb.pedalRPM(40);
		System.out.println("The ten gear bicycle has a degree of turn: " + tb.getDegreeOfTurn());
		// Notice the difference in the result, as unlike the Bicycle class this TenBicycle Object has set the gear ratio to be 10
		System.out.println("The ten gear bicycle has a wheel RPM: " + tb.getWheelRPM());
		
		
		
	}// End of Main

}// End of BicycleApp
