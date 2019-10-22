package co.grandcircus;

import java.util.Scanner;

public class ValidateNames {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("A example of a Email you can use is Bryan@gmail.com");
		System.out.println("Please Enter a Email!!!");
		

		String email = scan.next();
		System.out.println("The E-mail ID is: " + email);
		System.out.println("Is the E-mail address entered valid: " + emailValid(email));
		
		System.out.println("Please Enter a Valid Phone Number!");
		System.out.println("Ex. of Working Phone number 313-545-6734");
		String phoneNum = scan.next();
		System.out.println("Is the entered phone number valid?: " + phoneValid(phoneNum));
		
		scan.close();
		
	}

	static boolean emailValid(String email) {
		String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		return email.matches(regex);
	}
	static boolean phoneValid(String phoneNum) {
		String regex = "^[2-9]\\d{2}-\\d{3}-\\d{4}$";
		return phoneNum.matches(regex);	
		
	}
	static boolean nameValid(String name) {
		String regex = "/^[a-z ,.'-]+$/i";
		return name.matches(regex);	
	}
}