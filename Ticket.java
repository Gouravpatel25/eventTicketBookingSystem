package Model;

public class Ticket {
	Attendee attendee;
	Event event;
	String status;
	public Ticket(Attendee attendee, Event event, String status) {
		this.attendee = attendee;
		this.event = event;
		this.status = "booked";
	}
	void cancel() {
		this.status="cancelled";
	}
	String getStatus() {
		return "Event Name: "+event.title+"\t"+"Tickets available: "+event.availableTickets; 
	}
	String ticketDetails() {
		return "Attendee name: "+attendee.name+"\t"+"ID: "+attendee.id+"\t"+"Event Name: "+event.title+"\t"+"Status: "+this.status;
	}
}
