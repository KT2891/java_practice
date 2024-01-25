package practice8;

public class test04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Animal[] Mypets = new Animal[4];
		
		for(int i = 0; i < 4; i++) {
			if ((i % 2) == 0) {
				Mypets[i] = new Cat("たま", 5);
			} else {
				Mypets[i] = new Dog("シロ", 6);
			}
		}
		
		for( Animal Pet : Mypets )
			Pet.Speak();
	}

}
