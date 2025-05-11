class venue {
    static String venue_name;
    static String address;
    venue(){}
    venue(String venue_name, String address){
        this.venue_name = venue_name;
        this.address = address;
    }

    public static String getVenueName(){
        return venue_name;
    }
    public void setVenueName( String venue_name){
        this.venue_name = venue_name;
    }

    public static String getAddress(){
        return address;
    }
    public void setAddress( String address){
        this.address= address;
    }

    public void displayVenueDetails(){
        System.out.println("venue_name : " + venue_name + " " + "address : " + address);
    }
}
