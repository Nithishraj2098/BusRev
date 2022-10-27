// This is for booking
import java.util.*;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class Booking{
	
	String passengerName;
	int busNo;
	Date date;
	Booking(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name : ");
		passengerName=sc.nextLine();
		System.out.println("Enter the Bus number that u want to travell : " );
		busNo=sc.nextInt();
		System.out.println("Enter the date in dd-mm-yyyy format : ");
		String dateinput=sc.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

		try{
		 date=dateFormat.parse(dateinput);
		}
		catch(ParseException e)
		{
			e.printStackTrace();
		}


	
	}
	
	public boolean isAvailable(ArrayList<Booking> bookings , ArrayList<Businfo> buses){
		int capacity=0;
		for(Businfo bus:buses){
			if(bus.getBusno()==(busNo))
				capacity=bus.getCapacity();
		}
		int booked=0;
		for(Booking b:bookings){
			if(b.busNo ==busNo &&b.date.equals(date))
				booked++;
		}
		return booked<capacity?true:false;

	}
	}



 