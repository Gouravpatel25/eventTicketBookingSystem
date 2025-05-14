package exceptions;

public class InvalidBookingException extends Exception{
	
	static String message = "The booking is invalid";
	
	public InvalidBookingException(){
		System.out.println(message);
	}
	
}
