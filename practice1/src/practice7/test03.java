package practice7;

public class test03 {

	public static void main(String[] args) {
		Dog dog3_1 = new Dog("土佐犬");
		Dog dog3_2 = new Dog("秋田犬");
		dog3_1.SetName("アイ");
		dog3_2.SetName("ウエ");
		dog3_1.SetAge(4);
		dog3_2.SetAge(6);
		dog3_1.ShowProfile();
		dog3_2.ShowProfile();
	}

}
