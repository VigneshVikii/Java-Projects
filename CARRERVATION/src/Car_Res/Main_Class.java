package Car_Res;
import java.text.ParseException;
import java.util.*;
public class Main_Class {

	public static void main(String[] args) throws ParseException {
		ArrayList<Car> cars=new ArrayList<Car>();
		ArrayList<Booking_Car> bookings=new ArrayList<Booking_Car>();
		int input=1;
		cars.add(new Car(7371,3,false,"2 Hrs"));
		cars.add(new Car(7372,2,true,"5 Hrs"));
		cars.add(new Car(7373,6,true,"8 Hrs"));
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
				+ " 1. For Booking "+" 2. For Exit " +"\n");
		input=sc.nextInt() ;
		if(input==1) {
			System.out.println("Choice -- " +input +"\n");
			Booking_Car booking=new Booking_Car();
			if(booking.isAvailable(bookings,cars)) {
				bookings.add(booking);
				System.out.println("****** Your Booking Is Done. ****** "+"\n"
						+ "*** If You Want Another Booking Please Press 1 ***"+"\n"
						+ "                  Or "+"\n"
						+ "      ***** Press 2 For Exit *****"+"\n"
						);
				}
			else {
				System.out.println("***** Sorry Our All Cars are Busy At The Date Of "+booking.date +"******");
			}}
			else {
				System.out.println("********** Thanks For Using Us ***********");
			}
	}
	}
}
