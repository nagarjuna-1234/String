package Com.String;

public class ConstuctorUnderstanding {

	public ConstuctorUnderstanding() {
		// TODO Auto-generated constructor stub
		System.out.println(" default constructor");
	}
	
	public ConstuctorUnderstanding(int i) {
		// TODO Auto-generated constructor stub
		System.out.println(" one arg constructor");
	}
	
	public static void main(String[] args) {
		new ConstuctorUnderstanding();
		new ConstuctorUnderstanding(5);
	}
}
