package Model;

public class Event {
	String title;
	int availableTickets;
	
	Event(String title, int availableTickets){
		this.title=title;
		this.availableTickets= availableTickets;
	}
	boolean isAvailable() {
		return true;
	}
	void setAvailableTickets(int n) {
		availableTickets-=n;
	}
}
