
public class Movie extends Event{
      String Gender;
      String ActorName;
      String ActorsName;
      
      Movie(){}
      Movie(String Gender,String ActorName,String ActorsName,String event_name, String event_date, String event_time, String venue_name, Integer total_seats, Integer available_seats, double ticket_price){
    	  this.Gender = Gender;
    	  this.ActorName = ActorName;
    	  this.ActorsName = ActorsName;
      }     
     public String getGender(){
    	 return Gender;
     }
     public void setGender(String Gender){
    	 this.Gender = Gender;
     }
     
     public String getActorName(){
    	 return ActorName;
     }
     public void setActorName(String ActorName){
    	 this.ActorName = ActorName;
     }
     
     public String getActorsName(){
    	 return ActorsName;
     }
     public void setActorsName(String ActorsName){
    	 this.ActorsName = ActorsName;
    }
     
     public void display_event_details() {
    	 System.out.println("Gender : " +Gender + " " + "ActorName : " +ActorName + " " + "ActorsName : " +ActorsName);
     }
	
}
