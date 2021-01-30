import java.util.Scanner;
public class Driver {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
			
		Circle c = new Circle("" , 0); 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the color of the Circle:");
		c.Color= input.nextLine();
		Scanner input1 = new Scanner (System.in);
		System.out.println("Enter the Radius of the Circle:");
		c.Radius = input1.nextDouble();
		c.Area();
		c.display();
		
		Square s = new Square ("", 0);
		Scanner input2 =new Scanner (System.in);
		System.out.println("Enter the color of the Square:");
		s.Color = input2.nextLine();
		Scanner input3 = new Scanner(System.in);
		System.out.println("Enter the length of the Square:");
		s.length = input3.nextDouble();
		s.Area();
		s.display();
		
		
		Triangle t = new Triangle ("", 0, 0, 0);
		Scanner input4 = new Scanner (System.in);
		System.out.println("Enter the Colour of the Triangle");
		t.Color = input4.nextLine();
		Scanner input5 = new Scanner (System.in);
		System.out.println("Enter the side of the Triangle");
		t.Perimeter(input5.nextDouble());
		t.Area();
		t.Display();
		
			
		
	}

}
