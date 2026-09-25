class User{
	int Userid;
	String UserName;
	long MobileNo;

	User(int id, String name, long no){
		Userid=id;
		UserName=name;
		MobileNo=no;
	}

	void displayUserdetails(){
		System.out.println("User Id: "+ Userid);
		System.out.println("User Name: "+ UserName);
		System.out.println("Mobile Number: "+ MobileNo);	
	}
}

class Customer extends User{
	String Address;
	int OrderId;

	Customer(int id, String name, long no, String add, int orderid){
		super(id, name, no);
		Address=add;
		OrderId=orderid;
	}
}

class PremiumCustomer extends Customer{
	String MemberShiptype;
	double percentage;

	PremiumCustomer(int id, String name, long no, String add, int orderid, String type,double percent){
		super(id, name, no, add, orderid);
		MemberShiptype=type;
		percentage=percent;
	}

	void CalculateDiscount(double amt){
		double disamt;

		disamt=(amt*percentage)/100;
		System.out.println("Discount Amt: "+ disamt);
		double finalamt=amt-disamt;
		System.out.println("Final Bill: "+ finalamt);
	}	

	void displayPremiumCustomer(){
		System.out.println("Address: "+ Address);
		System.out.println("Order Id: "+ OrderId);
		System.out.println("MemberShip Type: "+ MemberShiptype);
		System.out.println("Discount Percentage: "+ percentage);
	}
}

class OnlineShoppingSystem{
	public static void main(String cp[]){
		PremiumCustomer pc=new PremiumCustomer(201, "Rahul", 90011800, "Bandra W", 411, "Diamond", 20);
		pc.displayUserdetails();
		pc.displayPremiumCustomer();
		pc.CalculateDiscount(6000);
	}
}