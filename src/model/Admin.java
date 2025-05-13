package model;

import java.util.Iterator;
import java.util.List;
import java.util.*;

import annotations.RoleRequired;

public class Admin extends User{
	
	@RoleRequired(role = "Admin")
	public Admin(String id, String name) {
		super(id,name);
	}
	
	public void removeEvent(List<Event> events, String title) {
		Iterator<Event> iteration = events.iterator();
		while(iteration.hasNext()) {
			Event event = iteration.next();
			
			if(event.getTitle().equals(title)) {
				iteration.remove();
				System.out.println(title+" Event is successfully removed");
				return;
			}
		}
		
		System.out.println(title+" event not found");
	}

}