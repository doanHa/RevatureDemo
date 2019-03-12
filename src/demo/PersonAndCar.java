package demo;

interface employee{
	void work();
}

public class PersonAndCar {
	public static void main(String[] args) {
		
	}
}

class Address {
	int streetNumber;
	String streetName, city, state;
	int zipcode;
	Address(int streetNum, String streetname, String cityName, String stateName, int zipcodeNum){
		streetNumber = streetNum;
		streetName = streetname;
		city = cityName;
		state = stateName;
		zipcode = zipcodeNum;
	}
}

class Human{
	String name;
	Address address;
	long[] phoneNumber;
}

class Developers implements employee{
	public void work() {
		System.out.println("Coding...");
	}
}

class Testers implements employee{
	public void work() {
		System.out.println("Testing...");
	}
}