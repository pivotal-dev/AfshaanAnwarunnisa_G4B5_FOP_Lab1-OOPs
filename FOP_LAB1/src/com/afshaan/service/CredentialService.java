package com.afshaan.service;
import java.util.*;
import com.afshaan.employee.*;
public class CredentialService {

	public CredentialService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String generatePassword() {
		String capLetters ="ABCDEFGHIJKLMNOPQRSTUVXYZ";
		String smallLetters="abcdefghijklmnopqrstuvwxyz";
		String numbers="0123456789";
		String specialCharacters = "!@#$%^&*()_?><+=-/";

		String pwd="";
/*		String values = capLetters + smallLetters + numbers + specialCharacters;
		Random r = new Random();

		for(int i=0;i<8;i++){
			pwd += String.valueOf(values.charAt(r.nextInt(values.length())));
		}
*/
		pwd += getRandomChar(capLetters,capLetters.length());
		pwd += getRandomChar(smallLetters,smallLetters.length());
		pwd += getRandomChar(specialCharacters,specialCharacters.length());
		pwd += getRandomChar(numbers,numbers.length());
		return pwd;

	}
	
	public String generateEmailAddress(String firstName , String lastName , String dept) {
		String email="";
		email = firstName + lastName + "@" + dept + ".abc.com";
		return email;
	}
	
	public void showCredentials(Employee e) {
		System.out.println("Dear "+e.getFirstName()+" Your Credentials are as follows");
		System.out.println("Email\t\t--->"+e.getEmail());
		System.out.println("Password\t--->"+e.getPassword());
		
	}
	
	public String getRandomChar(String s , int len)
	{
		Random r = new Random();
		String ch ="";
		
		ch += String.valueOf(s.charAt(r.nextInt(len)));
		ch += String.valueOf(s.charAt(r.nextInt(len)));
		return ch;
	}

}
