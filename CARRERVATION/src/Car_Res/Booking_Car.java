package Car_Res;
import java.text.ParseException;
import java.text.SimpleDateFormat;  
import java.util.*;
public class Booking_Car {
String passengerName;
int car_id;
long phone_number;
Date date;
Booking_Car() throws ParseException{
	Scanner sc=new Scanner(System.in);
	System.out.println("Ente Your Name :"+"\n");
	passengerName=sc.next();
	System.out.println("Enter Your Mobile Number :"+"\n");
	phone_number=sc.nextLong();
	System.out.println("Enter The Route No : "+"\n" );
	car_id=sc.nextInt();
	System.out.println("Enter The Date to Check Availability - "+" dd-mm-yyyy :"+"\n");
	String InputDate=sc.next();
	SimpleDateFormat Date_for=new SimpleDateFormat("dd-MM-yyyy");
    date=Date_for.parse(InputDate);
}
public boolean isAvailable(ArrayList<Booking_Car>bookings,ArrayList<Car>cars) {
	int Availability=0;
	for(Car car:cars) {
		if(car.getCarid()==car_id) {
			Availability=car.getavailable();
		}
		}
		int count=0;
		for(Booking_Car b:bookings) {
			if(b.car_id==car_id && b.date.equals(date)) {
			count++;
		}

	}
	return count<Availability?true:false;
	
} 
}
