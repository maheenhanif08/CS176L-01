
public class Person {
	/**
   A person is represented by the name and a birth year.
   You must enter the class name, instance variable(s), and constructor below
*/
	public String name;
	public int birthYear;
	
	public Person() {
		name = "";
		birthYear = 0;
	}
	public Person (String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}



/**
      Returns the string representation of the object.
      @return a string representation of the object
*/
   public String toString()
   {
      return "Person[name=" + name + ",birthYear=" + birthYear + "]";
   }
}