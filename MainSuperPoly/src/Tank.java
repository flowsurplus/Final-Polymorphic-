// Michael Jay Marajas Superhero Polymorphism Assignment

// COP 2800C 

// 4/21/2020

// Purpose: This class is to store a unique 'equals', 'doThis', and 'toString' method that is relevant to Tanks

public class Tank extends Superhero{

	public Tank(String name, int age, String superpower, String team) {
		super(name, age, superpower, team);
	}
	public void doThis() {
		System.out.println("I have immense physical strength.");
	}
	public void equals() {
		System.out.println("+-The Tanks that are in this List are: -+");
		System.out.println("|            The Thing                  |");
		System.out.println("|               Hulk                    |");
		System.out.println("|             She-Hulk                  |");
		System.out.println("|             Colossus                  |");
		System.out.println("|             Hercules                  |");
		System.out.println("+---------------------------------------+");
	}
	public String toString() {
		String result;
		result = super.toString() + " As a Tank, my strength and physique will get me through the hardest obstacles.";
		return result;
	}
		
}
