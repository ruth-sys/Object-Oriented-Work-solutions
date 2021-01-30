package labtest2_1700229;

public class Car extends Vehicle{
	@SuppressWarnings("unused")
	private int option;
	
	public Car(int lp, int ez,int wh, String gas)
	{
		 LicenseNum=lp;
		 EngineSize=ez;
		 NumOfWheels=wh;
		 GasType=gas;
	}


	public void VehicleDescription(int option) 
	{
		
		System.out.println("This is a Car");
		
		if(option==1)
		{
			System.out.println("This is a Sudan");
		}
		else if(option==2)
		{
			System.out.println("This is a HatchBack");
		}
	}


	@Override
	public void VehicleDescription() {
		// TODO Auto-generated method stub
		
	}


	

}