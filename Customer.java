class Customer{
    String customer_name;
    String email;
    String phoneNumber;

Customer(){}
Customer(String customer_name, String email , String phoneNumber){
    this.customer_name = customer_name;
    this.email = email;
    this.phoneNumber = phoneNumber;
}

public String getCustomer_name(){
    return customer_name;
}
public void setCustomer_name( String customer_name){
    this.customer_name = customer_name;
}

public  String getEmail(){
    return email;
}
public void setEmail( String email){
    this.email= email;
}
public  String getphonenumber(){
    return phoneNumber;
}
public void setVenueName( String phoneNumber){
    this.phoneNumber = phoneNumber;
}

public void display_customer_details(){
    System.out.println("customer_name : " + customer_name + " " + " email : " + email + " "+ "phoneNumber : " + phoneNumber);
}

}
