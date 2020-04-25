// Michael Jay Marajas Superhero Polymorphism Assignment

// COP 2800C 

// 4/21/2020

// Purpose: This class is to store a unique 'equals', 'doThis', and 'toString' method that is relevant to Mages

public class Mage extends Superhero{

	public Mage(String name, int age, String superpower, String team) {
		super(name, age, superpower, team);
	}
	public void doThis() {
		System.out.println("I have magical powers that get me through the obstacles.");
	}
	public void equals() {
		System.out.println("+-The Mages that are in this List are: -+");
		System.out.println("|          Doctor Strange               |");
		System.out.println("|              Zatanna                  |");
		System.out.println("|              Raven                    |");
		System.out.println("+---------------------------------------+");
	}
	public String toString() {
		String result;
		result = super.toString() + " As a Mage, I can use my magical powers and reserves to find unique solutions to any problem.";
		return result;
	}
		
}
