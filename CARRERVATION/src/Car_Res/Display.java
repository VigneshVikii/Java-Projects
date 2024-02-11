package Car_Res;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Display {
	String passengerName;
	long phone_number;
	Date date;
	public boolean display(ArrayList<Booking_Car>bookings) throws ParseException {
		boolean bol=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name :");
		passengerName=sc.next();
		System.out.println("Enter The Date Of Booking"+" dd-mm-yyyy :" );
		String InputDate=sc.next();
		SimpleDateFormat Date_for=new SimpleDateFormat("dd-MM-yyyy");
	    date=Date_for.parse(InputDate);
		System.out.println("Enter Your Mobile Number :");
		phone_number=sc.nextLong();
		for(Booking_Car b:bookings) {
			if(b.passengerName .equalsIgnoreCase(passengerName) 
			&&b.date.equals(date) && b.phone_number==phone_number ) {
				System.out.println("**************************************************************************");
				System.out.println("***** Here Is Your Booking Details *****");
				System.out.println("**************************************************************************");
				System.out.println("* Name: "+passengerName 
					+"* Conatct Number: "+phone_number+"* Date Of Booking Is "+ date);
			System.out.println("**************************************************************************");
			bol= true;
			}
		}
		return bol;
		
	}
}
