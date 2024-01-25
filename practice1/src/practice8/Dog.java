package practice8;

public class Dog extends Animal {
	
	public Dog(String nm, int age) {
		super(nm, age);
	}
	
	public void Run() {
		System.out.println("トコトコ");
	}
	
	public void Speak() {
		System.out.println("ワンワン");
	}

}
