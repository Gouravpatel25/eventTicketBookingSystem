package service;
import model.User;
import model.Attendee;
import model.Organizer;
import model.Event;
import model.Ticket;
import exceptions.InvalidBookingException;

public class EventBookingSystem {
	
	private List<Attendee> attendees = new ArrayList<>();
    private List<Organizer> organizers = new ArrayList<>();
    private List<Event> events = new ArrayList<>();
    private List<Ticket> tickets = new ArrayList<>();
 
    public void registerUser(User user) {
        if (user instanceof Attendee) {
            attendees.add((Attendee) user);
        } else if (user instanceof Organizer) {
            organizers.add((Organizer) user);
        }
    }

    public void addEvent(Event event) {
        events.add(event);
    }

    public void bookTicket(String attendeeId, String eventName) throws InvalidBookingException {
        Attendee attendee = attendees.stream()
                .filter(a -> a.id.equals(attendeeId))
                .findFirst()
                .orElseThrow(() -> new InvalidBookingException("Attendee not found"));

        Event event = events.stream()
                .filter(e -> e.getTitle().equals(eventName) && e.isAvailable())
                .findFirst()
                .orElseThrow(() -> new InvalidBookingException("Event not found or sold out"));

        Ticket ticket = new Ticket(attendee, event);
        tickets.add(ticket);
        event.setAvailableTickets(event.getAvailableTickets() - 1);
    }

    public void showEvents() {
        events.forEach(event -> System.out.println("Event: " + event.getTitle() + ", Tickets: " + event.isAvailable()));
    }
}
