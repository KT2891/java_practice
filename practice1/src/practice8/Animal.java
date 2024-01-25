package practice8;

public class Animal {

	public String Name;
	public int Age;
	
	public Animal(String nm, int age) {
		Name = nm;
		Age = age;
	}
	
	public void ShowProfile() {
		System.out.println( "名前は" + Name + "," + Age + "歳です。" );
	}
	
	public void Speak() {
		System.out.println("......");
	}
}
