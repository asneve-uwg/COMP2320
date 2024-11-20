package hospital.entities;

public class Person {
	 private String name;
	 private int age;
	 private int id;
	

	    /**
	     * Constructor for the Person class
	     *
	     * @param name the name of the person
	     * @param age the age of the person
	     * @param birthDate the birth date of the person
	     */
	public Person(String name, int age, int id){
	        this.name = name;
	        this.age = age;
	        this.id = id;
	}
	        

	 public void displayInfo(){
	        System.out.println("Name: " + this.name);
	        System.out.println("Age: " + this.age);
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}





}




