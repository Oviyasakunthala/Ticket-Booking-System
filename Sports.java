
public class Sports extends Event{
	String SportName;
	String TeamsName;
	
	Sports(){}
	Sports(String SportName,String TeamsName,String event_name, String event_date, String event_time, String venue_name, Integer total_seats, Integer available_seats, double ticket_price){
		super(event_name,event_date,event_time,venue_name,total_seats,available_seats,ticket_price);
		this.SportName = SportName;
		this.TeamsName = TeamsName;
		}
	public String getSportName() {
		return SportName;
	}
	public void setArtist(String SportName) {
		this.SportName = SportName;
	}
	public String getTeamsName() {
		return TeamsName;
	}
	public void setType(String TeamsName) {
		this.TeamsName = TeamsName;
	}
	
	public void display_event_details() {
		 System.out.println("Event_name : " + event_name + " " + "Event_date : "+ event_date +  " " + "Event_time : " + event_time + " " + "venue_name : " + venue_name + " " + "total_seats : "+ total_seats + " " + "available_seats : " +available_seats +" " + "ticket_price : " + ticket_price + " " + "SportName: " + SportName + " " + "TeamsName : " +TeamsName);
	}
}
