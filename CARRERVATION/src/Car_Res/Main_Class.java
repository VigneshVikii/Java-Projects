package Car_Res;
import java.text.ParseException;
import java.util.*;
public class Main_Class {
	public void def() {
		  System.out.println("*** If You Want A New BOOKING Please Press 1 ***"+"\n"
                	+ "                  Or "+"\n"
					+ "***** Press 2 For TRACK Your Ticket *****"+"\n"
					+ "                  Or "+"\n"
					+ "***** Press 3 For CANCEL Your Ticket *****");   
	}
	public static void main(String[] args) throws ParseException {
		Main_Class mn=new Main_Class();
		ArrayList<Car> cars=new ArrayList<Car>();
		ArrayList<Booking_Car> bookings=new ArrayList<Booking_Car>();
		int input=1;
		cars.add(new Car(7371,1,false,"2 Hrs"));
		cars.add(new Car(7372,1,true,"5 Hrs"));
		cars.add(new Car(7373,1,true,"8 Hrs"));
		System.out.println("************ Welcome To Hari Cabs ************");
		System.out.println("NOTE :: \n ******* Route No--7371 For Pattukkottai To Trichy ******* "
                + "\n ******* Route No--7372  For Pattukkottai To Vilupuram *******"
                +"\n ******* Route No--7373 For Pattukkottai To Chennai *******");
		System.out.println();
		System.out.println("**************************************************************************");
		for(Car c:cars) {
			c.Displaycarinfo();
		}
		System.out.println("**************************************************************************");
	Scanner sc=new Scanner(System.in);
	while(input==1) {
		System.out.println("****** Please Enter Your Choice ******"+"\n"
				+ " 1. BOOKING Your Ticket \n 2. TRACK Your Booking \n 3. CANCEL Your Booking \n 4. EXIT");
		int input1=sc.nextInt();
		switch(input1) {
		case 1:
			System.out.println(" Ticket--Booking");
			Booking_Car booking=new Booking_Car();
			if(booking.isAvailable(bookings,cars)) {
				bookings.add(booking);
				System.out.println("**************************************************************************");
				System.out.println("****** Your Booking Is Done. ****** "+"\n"
						+ "*** If You Want Another BOOKING Please Press 1 ***");		
				break;
				}
			else {
				System.out.println("***** Sorry Our All Cars Are Busy At The Date Of "+booking.date +"******");
			}
		    case 2:
		    	System.out.println("**** Tracking--Booking ****");
		    	Display display=new Display();
				if(display.display(bookings)) {
				System.out.println("****** Your Bookings Details Is Below ****** ");
			    }
		    	else {
		    		System.out.println("**** Your Details Is Not In Our DataBase ****");
					System.out.println("**** Please Enter The Correct Details ****");
				}
				break;
		    case 3:
		    	System.out.println("**** Booking--Cancelation ****");
		    	Cancellation cancel=new Cancellation();
				if(cancel.cancellation(bookings)==true) { 
				System.out.println("****** Your Cancelation Is Done. ****** ");
				}
		    	else {
					System.out.println("**** Your Details Is Not In Our DataBase ****");
					System.out.println("**** Please Enter The Correct Details ****");
				}
		    	continue;
			default :
				System.out.println("***** Please Enter The Valid Option *****");
				System.out.println("************| 1 / 2 / 3 / 4 |************");
	}
		if(input1==4) {
			break;
		}
		}
	System.out.println("********** Thanks For Using Us ***********");
	System.out.println("**************************************************************************");
	System.out.println("--------------------- Developed By -- Mr.VIGNESH SELVAM -------------------");
	System.out.println("**************************************************************************");
	}
	
}
	

