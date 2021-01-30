
public class Triangle extends Shape{
	
	protected double Base;
	protected double Height;
	protected double Hypotenuse;
	protected double peri;

	
	public Triangle (String st, double ba, double he, double hypo ) {
		Color = st;
		Base = ba;
		Height = he;
		Hypotenuse= hypo;
	}
	

	public void Perimeter (double side ) {
		
			peri = 3* side;
		}
	
	public void Perimeter (double bot, double ang, double cat  ) {
			peri = bot+ ang+ cat;
		
		}
	public void Area() {
		A = 0.5 * Base * Height;
		
	}
	
	public void Display () {
		System.out.println("The  traingle is "+Color);
		System.out.println("The  perimeter of equaliterial triangle is "+peri);
		System.out.println("The perimeter of the traingle is "+peri);
		System.out.println("The area of the traingle is "+A);
		
	}


	
	
		

}


