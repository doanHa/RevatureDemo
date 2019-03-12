package demo;

public class PersonMain {

	public static void main(String[] args) {
		Person personA = new Person("Doan", "Ha Nguyen", Gender.M, "2227771111");
		personA.calculateAge(1996);
		personA.showDetails();		
	}

}
