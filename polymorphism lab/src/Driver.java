//AnimalDriver to demonstrate polymorphism
public class Driver {
	public static void ProcessSound(Animal oRef) {
		oRef.MakeSound();
	}

	

	public static void main(String[] args) {
//object variable can reference parent class Animal
//and its child classes
		Animal obj;
		//obj = new Animal();
		//obj.MakeSound();
		obj = new Bird();
		obj.MakeSound();
		obj = new Dog();
		obj.MakeSound();
		obj = new Horse();
		obj.MakeSound();
	}
	
	public static void main1(String[] args) {
		Animal obj;
		obj = new Bird();
		ProcessSound(obj);
		obj = new Dog();
		ProcessSound(obj);
		obj = new Horse();
		ProcessSound(obj);
	}

}