package practice8;

public class test03 {

	public static void main(String[] args) {
		
		Cat cat = new Cat("たま", 7);
		Dog dog = new Dog("しろ", 6);
		
		cat.ShowProfile();
		dog.ShowProfile();
		
		cat.Speak();
		dog.Speak();

	}

}
