package model;

public class Organiser extends User{

	boolean active= true;
	Organiser(String id, String name) {
		super(id, name);
	}
	boolean isActive() {
		return this.active;
	}
	void setActive(boolean active) {
		active= true;
	}
	@Override
	void showProfile() {
		System.out.println("Name: "+this.name+"\t"+"ID: "+this.id+"\t"+"Status: "+this.active);
	}
	
}
