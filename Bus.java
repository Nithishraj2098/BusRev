/*This is the main program that connects both Booking and Businfo*/

import java.util.Scanner;
import java.util.ArrayList;
public class Bus{
	public static void main(String[] agrs){
		ArrayList<Businfo> buses = new ArrayList<Businfo>();
		ArrayList<Booking> bookings= new ArrayList<Booking>();
		buses.add(new Businfo(1,true,2));
		buses.add(new Businfo(2,false,42));
		buses.add(new Businfo(3,true,30));
		buses.add(new Businfo(4,false,60));

		for(Businfo b:buses) {
			b.displaybusinformation();
		}



		String userinput ="y";
		Scanner sc=new Scanner(System.in);

		while(userinput.equals("y")){
		System.out.println(" \n Yes=y\n No=n\n       Enter y to Booking n to cancel ");
        userinput=sc.nextLine();
        if(userinput.equals("y")){
        	Booking book=new Booking();
        	if(book.isAvailable(bookings,buses)){
        		bookings.add(book);
        		System.out.println("your BOOKING id CONFIRM.....Thank you for choosing our Service..Have a safe Journey");

        	}
        	else{
        		System.out.println("Sorry!!! Bus is Full ...Try another Bus or date..\nThank you for choosing our Service");
        	}

        }
	}

	}
}