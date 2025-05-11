class Event{
     String event_name;
     String event_date;
     String event_time;
     String venue_name;
     Integer total_seats;
     Integer available_seats;
     Double ticket_price;
    Event(){
        //this("Anandan","06-09-2024","12:00","vijay",300,50,200.0);
        //System.out.println("Default value");
    }

    Event( String event_name, String event_date, String event_time, String venue_name, Integer total_seats, Integer available_seats, double ticket_price){
        
        this.event_name = event_name;
        this.event_date = event_date;
        this.event_time = event_time;
        this.venue_name = venue_name;
        this.total_seats = total_seats;
        this.available_seats = available_seats;
        this.ticket_price = ticket_price;
    }
    public String getEventName() {
        return event_name;
    }

    public void setEventName(String eventName) {
        this.event_name = eventName;
    }

    public String getEventDate() {
        return event_date;
    }
    
    public void setEventDate(String eventDate) {
        this.event_date= eventDate;
    }

    public String getEventTime() {
        return event_time;
    }

    public void setEventTime(String eventTime) {
        this.event_time= eventTime;
    }

    public String getVenueName() {
        return venue_name;
    }

    public void setVenueName(String venueName) {
        this.venue_name = venueName;
    }

    public int getTotalSeats() {
        return total_seats;
    }

    public void setTotalSeats(int totalSeats) {
        this.total_seats = totalSeats;
    }

    public int getAvailableSeats() {
        return available_seats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.available_seats = availableSeats;
    }

    public double getTicketPrice() {
        return ticket_price;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticket_price = ticketPrice;
    }

    public double calculateTotalRevenue() {
        return ticket_price * (total_seats - available_seats);
    }

    public int getBookedNoOfTickets() {
        return total_seats - available_seats;
    }

    public void bookTickets(int numTickets) {
        if (numTickets <= available_seats) {
            available_seats -= numTickets;
            System.out.println("Successfully booked " + numTickets + " tickets.");
        } else {
            System.out.println("Not enough seats available. Only " + available_seats + " seats are left.");
        }
    }

    public void cancelBooking(int numTickets) {
        available_seats += numTickets;
        System.out.println("cancelBooking Seats :" + available_seats);
    }

    public void displayEventDetails(){
        System.out.println("Event_name : " + event_name + " " + "Event_date : "+ event_date +  " " + "Event_time : " + event_time + " " + "venue_name : " + venue_name + " " + "total_seats : "+ total_seats + " " + "available_seats : " +available_seats +" " +"ticket_price : " + ticket_price);
    }
    
   
}