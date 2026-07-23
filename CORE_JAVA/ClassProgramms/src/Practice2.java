class Dog{
	private String name, breed;

	//getter method
	public String getName() {
		return name;
	}

	//SETTER METHOD
	public void setName(String name) {
		this.name = name;
	}
	//getter method
	public String getBreed() {
		return breed;
	}

	//SETTER METHOD
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	
}
public class Practice2 {

	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		
		d1.setName("max");
		d1.setBreed("Bull Dog");
		
		d1.setName("Rocky");
		d1.setBreed("Germen Sheperd");
		
		System.out.println("Name : " + d1.getName() + ", Breed : " + d1.getBreed());
		
		d2.setName("Echo");
		d2.setBreed("Pomaranian");
		
		d2.setName("Charlie");
		d2.setBreed("Shis Tzu");
		
		System.out.println("Name : " + d2.getName() + ", Breed : " + d2.getBreed());

	}

}
