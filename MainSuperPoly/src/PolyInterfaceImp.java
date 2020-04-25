// Michael Jay Marajas Superhero Polymorphism Assignment

// COP 2800C 

// 4/21/2020

// Purpose: This class is to define all the Abstract methods placed in PolyInterfaces.

public class PolyInterfaceImp implements openingMessage, detailList, sortList{

	
	public void listSort() {
		System.out.println("These groups are sorted by their Type. ");
	}

	
	public void listDetails() {
		System.out.println("These superheroes are unique in their abilities and team formations. ");
		
	}

	
	public void openMess() {
		System.out.println("Welcome to the Superhero Main Menu! ");
		
	}

}
