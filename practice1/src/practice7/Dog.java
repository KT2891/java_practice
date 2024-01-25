package practice7;

public class Dog {

	private String Name;
	private int Age;
	private String Kind;
	
	public Dog( String kind) {
		Kind = kind;
	}
	
	public void SetName( String nm ) {
		Name = nm;
	}
	
	public void SetAge( int age) {
		Age = age;
	}
	
	public void ShowProfile() {
		System.out.println( "犬種:" + Kind );
		System.out.println( "名前:" + Name );
		if (Age != 0)
			System.out.println( "年齢:" + Age );
	}

}
