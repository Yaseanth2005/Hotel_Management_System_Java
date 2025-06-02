package hotel;

public class Customer {
	
	
	 static int idcount=1;
	 int cid;
	 String cname;
	 long contact;
	 
	 Customer(String cname,long contact) {
		 this.cid=idcount++;
		 this.cname=cname;
		 this.contact=contact;
	 }
	 
	 public void display_customer_info() {
		 System.out.println("Customer_id :"+cid);
		 System.out.println("Customer_name:"+cname);
		 System.out.println("Customer_contact:"+contact);
	 }
	

}
