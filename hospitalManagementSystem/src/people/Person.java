package people;

public class Person {
	 protected String name;
	 protected int age;
	

	    /**
	     * Constructor for the Person class
	     *
	     * @param name the name of the person
	     * @param age the age of the person
	     * @param birthDate the birth date of the person
	     */
	public Person(String name, int age){
	        this.name = name;
	        this.age = age;
	}
	        

	 public void displayInfo(){
	        System.out.println("Name: " + this.name);
	        System.out.println("Age: " + this.age);
	 }


	public String getName() {
		return name;
	}




	public int getAge() {
		return age;
	}
}




