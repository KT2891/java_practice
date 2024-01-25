package practice7;

public class Dog {

	private String Name;
	private int Age;
	
	public void SetName( String nm ) {
		Name = nm;
	}
	
	public void SetAge( int age) {
		Age = age;
	}
	
	public void ShowProfile() {
		System.out.println( "名前は" + Name + "です。" );
		if (Age != 0)
			System.out.println( "年齢は" + Age + "です。" );
	}

}
