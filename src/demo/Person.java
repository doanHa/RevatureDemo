package demo;

enum Gender{
	M, F
}

public class Person {
	String _firstName;
	String _lastName;
	Gender _gender;
	String _phoneNumber;
	int _age;
	
	Person(String firstName, String lastName, Gender gender, String phoneNumber){
		_firstName = firstName;
		_lastName = lastName;
		if(gender == Gender.M || gender == Gender.F)
			_gender = gender;
		else
			{
				System.out.println("Invalid Input for gender");
				System.exit(0);
			}
		_phoneNumber = phoneNumber;
	}
	
	void setFirstName(String firstName) {
		_firstName = firstName;
	}
	void setLastName(String lastName) {
		_lastName = lastName;
	}
	void setGender(Gender gender) {
		if(gender == Gender.M || gender == Gender.F)
			_gender = gender;
	}
	void setPhoneNumber(String phoneNumber) {
		_phoneNumber = phoneNumber;
	}
	
	String getFirstName() {
		return _firstName;
	}
	String getLastName() {
		return _lastName;
	}
	Gender getGender() {
		return _gender;
	}
	String getPhoneNumber() {
		return _phoneNumber;
	}
	String getFullName() {
		return _firstName + " " + _lastName;
	}
	int calculateAge(int yearBorn) {
		_age = 2019 - yearBorn;
		return _age;
	}
	
	void showDetails() {
		System.out.print("Name: " + _firstName + " " + _lastName + " is a ");
		if(_gender == Gender.M)
			System.out.print("male");
		else
			System.out.print("female");
		System.out.println(" and phone number is " + _phoneNumber);
		System.out.println("This person is " + _age
				+ " years old and the full name is " + getFullName());
	}
}
