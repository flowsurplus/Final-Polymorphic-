// Michael Jay Marajas Polymorphism Assignment

// COP 2800C 

// 4/14/2020

// Purpose: This class is to create a super class called Person.

	public class Person{
		String name;
		int age;
		public Person(String name, int age) {
			setName(name);
			setAge(age);
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String toString() {
			String result;
			result = "My name is " + name + ".";
			return result;
		}
		//Very important to have a doThis method in the super and root classes so it can be overridded
		public void doThis() {
			System.out.println("I have a superpower");
		}
		
		public void equals() {
			System.out.println("For Equals Class");
		}
	}