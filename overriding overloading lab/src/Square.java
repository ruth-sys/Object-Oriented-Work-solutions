
public class Square extends Shape {
	protected double length;
	
	public Square (String col, double len) {
		Color = col;
		length = len;
	}
	
	public void Area() {
		
		A = length * length;
	}
	
	public void display()
	{
		System.out.println("The colour of the shape is "+Color);
		System.out.println("The area of the shape is "+A);
	}
	
}
