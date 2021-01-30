
public class cow extends Animal{
	private float MilkProduced;
	
	public cow (float mp, float ag) {
		MilkProduced = mp;
		Age = ag;
	}
	
	public void walk () {
		System.out.println("This cow can walk");
	}
	
	public void Display () {
		System.out.println("This cow produced"+MilkProduced+"of Mlik");
		System.out.println("This animal is"+Age+"years old");
	}

}
