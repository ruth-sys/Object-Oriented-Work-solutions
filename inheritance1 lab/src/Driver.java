
public class Driver {

	public static void main(String[] args) {
		Animal A = new Animal();
		Bird B = new Bird(4, 5.5f);
		cow c = new cow (2.4f, 3.8f);
		
		A.Eat();
		System.out.println( A.Age);
		
		B.Eat();
		B.Fly();
		B.Display();
		
		c.Eat();
		c.walk();
		c.Display();
		
		Shark S = new Shark (5, 8);
		S.Eat();
		S.swim();
		S.Display();
		
		
		

	}

}
