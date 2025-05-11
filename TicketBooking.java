import java.util.*;
public class TicketBooking {
	public static void main(String args[]) {
	Scanner input = new Scanner(System.in);
	System.out.println("Ticket Booking :");
	Event event = new Event(input.next(),input.next(),input.next(),input.next(),input.nextInt(),input.nextInt(),input.nextDouble());
	event.displayEventDetails();
	
	Movie movie = new Movie(input.next(),input.next(),input.next(),input.next(),input.next(),input.next(),input.next(),input.nextInt(),input.nextInt(),input.nextDouble());
	movie.display_event_details();
	
	Concert concert = new Concert(input.next(),input.next(),input.next(),input.next(),input.next(),input.next(),input.nextInt(),input.nextInt(),input.nextDouble());
	concert.display_event_details();


	Sports sports= new Sports(input.next(),input.next(),input.next(),input.next(),input.next(),input.next(),input.nextInt(),input.nextInt(),input.nextDouble());
	sports.display_event_details();
}
}
