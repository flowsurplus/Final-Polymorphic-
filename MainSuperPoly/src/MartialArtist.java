// Michael Jay Marajas Superhero Polymorphism Assignment

// COP 2800C 

// 4/21/2020

// Purpose: This class is to store a unique 'equals', 'doThis', and 'toString' method that is relevant to Martial Artists

public class MartialArtist extends Superhero{

	public MartialArtist(String name, int age, String superpower, String team) {
		super(name, age, superpower, team);
	}
	public void doThis() {
		System.out.println("I have a vast amount of knowledge in several different forms of Martial Arts ");
	}
	public void equals() {
		System.out.println("+-The Martial Artists that are in this List are: -+");
		System.out.println("|                   Daredevil                     |");
		System.out.println("|                   NightWing                     |");
		System.out.println("|                   Iron Fist                     |");
		System.out.println("+-------------------------------------------------+");
	}
	public String toString() {
		String result;
		result = super.toString() + " As a Martial Artist, I can adopt several different styles of Martial Arts and pull off physically straining moves.";
		return result;
	}
		
}