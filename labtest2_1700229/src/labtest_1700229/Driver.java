package labtest_1700229;
import java.io.*;
import java.util.Scanner;
import javax.tools.FileObject;
public class Driver {
	
	public void Vehicle(Vehicle oref){
		oref.VehcileDescription();
		Vehicle obj;
	}
	
	public void Display(){
		System.out.println("Licsend Number: ");
		System.out.println("Engine Size: ");
		System.out.println("Number of wheels: ");
		System.out.println("Gas Type: ");
	}
	
	public void SaveVehicleInfo(Vehicle obj){
		try{
			FileWriter fileObject = new FileWriter("VehcileInfo.txt", true);
			fileObject.write (obj.LicenseNum+"");
			fileObject.write (obj.EngineSize +"");
			fileObject.write (obj.NumOfWheels +"");
			fileObject.write (obj.GasType +"");
			fileObject.write ("/n");
			
			fileObject.close();	
		}catch(IOException e){
			System.err.println("File could open");
		}
		
	}
	
	public void ReadVehicleInfo(){
		Scanner input = new Scanner(System.in);
		boolean IsVehicleFound = false;
		int VehicleNum = 0;
		System.out.println("Enter a License Number :");
		VehicleNum = input.nextInt();
		try{
			Scanner fileObject = new Scanner(new File ("Vehcile.txt"));
			while(fileObject.hasNext()){
				int lNum = fileObject.nextInt();
				int Eg = fileObject.nextInt();
				int NumW = fileObject.nextInt();
				String Type = fileObject.next();
				
				if (VehicleNum == lNum){
					 int LicenseNum = lNum;
					int EngineSize = Eg;
					int NumberOfWheels = NumW;
					String GasType = Type;
					break;
				}
				
				
			}
			if(IsVehicleFound== false){
				System.out.println("Sorry Vehicle not found");
			}else{
				System.out.println("Vehicle Found");
				Display();
			
			}
			fileObject.close();
		}catch (FileNotFoundException e){
			System.err.println("Sorry File not Found");
		}
		
		
	}

	public static void main(String[] args) {
		Vehicle Obj;
		
		Obj = new Car(1234, 2000, 4, "90");
		Obj = new Truck(9876, 8000, 18, "Diesel");
		
		Obj.SaveVehicleInfo();
		Obj.ReadVehicleInfo();
		
		
		

	}

}
