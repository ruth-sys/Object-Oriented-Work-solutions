
public class Bird extends Animal {
	private int NumberEggsLaid;
	
	public Bird (int nel , float ag) {
		NumberEggsLaid= nel;
		Age = ag;
		
	}
	
	public void Fly() {
		System.out.println("This animal can fly");
	}
	
	public void Display() {
		System.out.println("this bird has laid"+NumberEggsLaid+"eggs");
		System.out.println("This birs is"+Age+"years old");
	}

}
