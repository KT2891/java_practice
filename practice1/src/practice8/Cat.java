package practice8;

public class Cat extends Animal {
	
	public Cat( String nm, int age) {
		super(nm, age);
	}
	
	public void Sleep() {
		System.out.println("スースー");
	}
	
	public void Speak() {
		System.out.println("ニャー");
	}

}
