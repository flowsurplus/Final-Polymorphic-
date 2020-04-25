// Michael Jay Marajas Superhero Polymorphism Assignment

// COP 2800C 

// 4/21/2020

// Purpose: This class is extending the Person class and is the base class from which every Type Class will be based off of. 

public class Superhero extends Person{
	String superpower;
	String team;
	public Superhero(String name, int age, String superpower, String team) {
		super(name, age);
		setSuperpower(superpower);
		setTeam(team);
	}
	public String getSuperpower() {
		return superpower;
	}
	public void setSuperpower(String superpower) {
		this.superpower = superpower;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	
	//Very important to have a doThis method in the super and root classes so it can be overridded
	public void doThis() {
		System.out.println("Superpower time");
	}
	public void equals() {
		System.out.println("For Equals Class");
	}
	
	public String toString() {
		String result;
		result = super.toString() +" I am what you call a Superhero from the team, " + team + ", and my main Super Power to"
				+ " fight crime would be " + superpower + ".";
		return result;
	}
		
}

