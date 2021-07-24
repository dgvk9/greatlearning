

public class Hello{
	public static void main(String args[]){
		

Attendee[] arr = new Attendee[100];

		
		Attendee obj1 = new Attendee();
		obj1.name= "Amit";
		obj1.city = "Bangalore";
		obj1.programmingExp = 2.3;
		System.out.println(obj1.display(10));
		arr[0]= obj1;
Attendee obj2 = new Attendee();
		obj1.name= "Amit";
		obj1.city = "Bangalore";
		obj1.programmingExp = 2.3;
		System.out.println(obj2.display());
		arr[1]= obj2;

	}
}

class Attendee{

	String name;
	double programmingExp;
	String city;

	public  String display(){

		return "The name is "+ name + ", the programmingExp is "+programmingExp+
		" and city is "+city;

	}
	

}	

