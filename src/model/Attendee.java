package model;

public class Attendee extends User{

	Attendee(String id, String name) {
		super(id, name);
	}

	@Override
	void showProfile() {
		System.out.println("Name: "+this.name+"\t"+"ID: "+this.id);
	}
	
}
