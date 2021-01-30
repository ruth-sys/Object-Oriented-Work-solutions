package labtest2_1700229;

public class Truck extends Vehicle {
	
	public Truck (int lp, int ez, int wh, String gas){
		LicenseNum = lp;
		EngineSize = ez;
		NumOfWheels = wh;
		GasType = gas;
	}
	
	public void VehicleDescription(){
		System.out.println("This is a Truck. ");
	}

	public void VehcileDescription() {
		// TODO Auto-generated method stub
		
	}

	
}
