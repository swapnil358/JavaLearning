package MyPractice;

public class test {

	public static void main(String[] args) {

		parent p = new Child(); // output ----only parent class method will be called
		p.Parentdisplay();

//		
//		Child p1 = new parent(); // Down casting is not possible--throws compile time error
//		p1.childMethod();

		
		parent p2 = new parent(); // Output ----only parent class method will be called
		p2.Parentdisplay();

		Child p3 = new Child(); // output -----Both parent and child method will be called since child class extend parent class					
		p3.childMethod();
		p3.Parentdisplay();

	}
}
