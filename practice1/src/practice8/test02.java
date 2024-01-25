package practice8;

public class test02 {

	public static void main(String[] args) {
		
		Cat cat1 = new Cat("たま", 10);
		Dog dog1 = new Dog("しろ", 7);
		
		cat1.ShowProfile();
		dog1.ShowProfile();
		
		cat1.Sleep();
		dog1.Run();
	}

}
