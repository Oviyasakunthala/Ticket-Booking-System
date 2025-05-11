import java.util.Scanner;
import java.sql.*;
public class EventDemo {
    public static void main(String[] args) throws SQLException, ClassNotFoundException  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a Event Details :");
    Event event = new Event(input.next(),input.next(),input.next(),input.next(),input.nextInt(),input.nextInt(),input.nextDouble());
    event.displayEventDetails();
    System.out.println("Total Tickets : " + event.getBookedNoOfTickets());
    event.bookTickets(10);
    System.out.println("Available seats after Booking : " + event.getAvailableSeats());
    event.cancelBooking(5);
    System.out.println("Available seats after Cancellation : " + event.getAvailableSeats());
    event.displayEventDetails();

    venue Venue = new venue(input.next(),input.next());
    Venue.displayVenueDetails();
    
    Customer customer = new Customer(input.next(),input.next(),input.next());
    customer.display_customer_details();
    
    //Mysql connection
    
//    Class.forName("com.mysql.cj.jdbc");
//    Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Ticket_bookings","root","root");
//    Statement statement = con.createStatement();
//    ResultSet rs = statement.executeQuery("select * from Ticket_bookings");
//    while(rs.next()) {
//    	System.out.println(rs.getString(1)+" " + rs.getString(2));
//    }
    
    
    	
        // Establish MySQL connection
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/ticket_booking", "root", "2257@anand");
         
        // Insert Event data
        Statement statement = con1.createStatement();
        String eventInsertQuery = "INSERT INTO Ticket_bookings (Person_Name, Event_date, Event_Time, Venue_name, Total_seats, Available_seats , Ticket_price) " +
                                 "VALUES ('" + event.getEventName() + "', '" + event.getEventDate() + "', '" + event.getEventTime() + "', '" + event.getVenueName() + "', " +
                                 event.getTotalSeats() + ", " + event.getAvailableSeats() + ", " + event.getTicketPrice() + ")";
        statement.executeUpdate(eventInsertQuery);
        
        
        // Insert Venue data
        
        String venueInsertQuery = "INSERT INTO Venue (Venue_name, Venue_address) " +
                                  "VALUES ('" + venue.getVenueName() + "', '" + venue.getAddress()+ "')";
        statement.executeUpdate(venueInsertQuery);
        
        // Insert Customer data
        
        String customerInsertQuery = "INSERT INTO Customer (Customer_name , Customer_email, Customer_phoneno) " +
                                     "VALUES ('" + customer.getCustomer_name() + "', '" + customer.getEmail() + "', '" + customer.getphonenumber() + "')";
        statement.executeUpdate(customerInsertQuery);
        statement.close();
        
        con1.close();
        
    
    
}
}


