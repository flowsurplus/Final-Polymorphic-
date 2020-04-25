// Michael Jay Marajas Superhero Polymorphism Assignment

// COP 2800C 

// 4/21/2020

// Purpose: This class is to store a unique 'equals', 'doThis', and 'toString' method that is relevant to Gadgeteers

public class Gadgeteer extends Superhero{

	public Gadgeteer(String name, int age, String superpower, String team) {
		super(name, age, superpower, team);
	}
	public void doThis() {
		System.out.println("I have unique gadgets that help me in certain situations.");
	}
	public void equals() {
		System.out.println("+-The Gadgeteer that are in this List are: -+");
		System.out.println("|               Iron-Man                    |");
		System.out.println("|               Spider-Man                  |");
		System.out.println("|                Batman                     |");
		System.out.println("|              Green Arrow                  |");
		System.out.println("|             Green Lantern                 |");
		System.out.println("+-------------------------------------------+");
	}
	public String toString() {
		String result;
		result = super.toString() + " As a Gadgeteer, I have great tinkering and mechanical skills.";
		return result;
	}
		
}
