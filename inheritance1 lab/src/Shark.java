
public class Shark extends Animal {
	private int NumberOfTeeth;
	
	public Shark (int not, float ag) {
		NumberOfTeeth = not;
		Age = ag;
	}
	
	public void swim () {
		System.out.println("This Shark can swim");
		
	}
	
	public void Display() {
		System.out.println("This Shark is " +Age+ " years old");
		System.out.println("This shark has " +NumberOfTeeth+ " Teeth");
		
	}

}
