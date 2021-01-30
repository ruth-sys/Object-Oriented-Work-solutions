
public class Circle extends Shape{
	protected double Radius;
	
	public Circle (String sh, double rad) {
		Color = sh;
		Radius = rad;
	}
	
	public void Area () {
		A = 3.142 * Radius * Radius;
	}
	
	public void display()
	{
		System.out.println("The colour of the shape is "+Color);
		System.out.println("The area of the shape is "+A);
	}
	

}
