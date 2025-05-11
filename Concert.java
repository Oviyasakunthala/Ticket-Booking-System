
public class Concert extends Event {
	String Artist;
	String Type;

Concert(){}

Concert(String Artist, String Type ,String event_name,String event_date, String event_time, String venue_name, Integer total_seats, Integer available_seats, double ticket_price){
	super(event_name,event_date,event_time,venue_name,total_seats,available_seats,ticket_price);
	this.Artist = Artist;
	this.Type = Type;
}
public String getArtist() {
	return Artist;
}
public void setArtist(String Type) {
	this.Type = Artist;
}
public String getType() {
	return Type;
}
public void setType(String Type) {
	this.Type = Type;
}


public void display_event_details() {
	 System.out.println("Event_name : " + event_name + " " + "Event_date : "+ event_date +  " " + "Event_time : " + event_time + " " + "venue_name : " + venue_name + " " + "total_seats : "+ total_seats + " " + "available_seats : " +available_seats +" " + "ticket_price : " + ticket_price + " " + "Artist : " +Artist + " " + "Type : " +Type);
}

}