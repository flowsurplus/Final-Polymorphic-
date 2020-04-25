// Michael Jay Marajas Superhero Polymorphism Assignment

// COP 2800C 

// 4/21/2020

// Purpose: This class is to store a unique 'equals', 'doThis', and 'toString' method that is relevant to Elementalists

public class Elementalist extends Superhero{

	public Elementalist(String name, int age, String superpower, String team) {
		super(name, age, superpower, team);
	}
	public void doThis() {
		System.out.println("I have immense control of the elementals and the environment. I can warp reality to my will.");
	}
	public void equals() {
		System.out.println("+-The Elementals that are in this List are: -+");
		System.out.println("|                   Storm                    |");
		System.out.println("|               Dr. Manhattan                |");
		System.out.println("|                    Thor                    |");
		System.out.println("|             The Human Torch                |");
		System.out.println("|                  Aquaman                   |");
		System.out.println("+--------------------------------------------+");
	}
	public String toString() {
		String result;
		result = super.toString() + " As an elementalist, I have great power to bend various surroundings.";
		return result;
	}
		
}
