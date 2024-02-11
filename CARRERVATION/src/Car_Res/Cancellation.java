package Car_Res;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Cancellation extends Main_Class {
	String passengerName;
	long phone_number;
	Date date;
 public boolean cancellation(ArrayList<Booking_Car>bookings) throws ParseException {
	 boolean bol=false;
	 Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name :");
		passengerName=sc.next();
		System.out.println("Enter The Date Of Booking "+" dd-mm-yyyy :" );
		String InputDate=sc.next();
		SimpleDateFormat Date_for=new SimpleDateFormat("dd-MM-yyyy");
	    date=Date_for.parse(InputDate);
		System.out.println("Enter Your Mobile Number :");
		phone_number=sc.nextLong();
		for(int i=0;i<bookings.size();i++) {
			if((bookings.get(i).passengerName).equalsIgnoreCase(passengerName) 
			&&bookings.get(i).date.equals(date) && bookings.get(i).phone_number==phone_number ) {
				bookings.remove(bookings.get(i));
				System.out.println("**************************************************************************");
				System.out.println(" Your Booking Is Successfully Canceled ");
				System.out.println("**************************************************************************");
				bol= true;
			}
			 }
		return bol;
	
		 }
 
}
