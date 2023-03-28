package com.afshaan.main;
import com.afshaan.employee.*;
import com.afshaan.service.*;
import java.util.*;
public class Application {

	public static void main(String[] args)
	{
		Employee e = new Employee("Afshaan" , "Anwarunnisa");
		CredentialService cs = new CredentialService();
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		
		String generatedEmail="";
		String generatedpassword="";
		switch (option) {
		case 1 :	//Technical
			generatedEmail = cs.generateEmailAddress(e.getFirstName().toLowerCase(), e.getLastName().toLowerCase(), "tech");
			generatedpassword = cs.generatePassword();
			break;
		case 2 :	//Admin
			generatedEmail = cs.generateEmailAddress(e.getFirstName().toLowerCase(), e.getLastName().toLowerCase(), "admin");
			generatedpassword = cs.generatePassword();
			break;
		case 3 :	//Human Resource
			generatedEmail = cs.generateEmailAddress(e.getFirstName().toLowerCase(), e.getLastName().toLowerCase(), "hr");
			generatedpassword = cs.generatePassword();
			break;
		case 4 :	//Legal
			generatedEmail = cs.generateEmailAddress(e.getFirstName().toLowerCase(), e.getLastName().toLowerCase(), "legal");
			generatedpassword = cs.generatePassword();
			break;
		default:
			System.out.println("Please enter a valid option between 1 - 4");
			sc.close();
			return;
			
		}
		
		e.setEmail(generatedEmail);
		e.setPassword(generatedpassword);
		cs.showCredentials(e);
		sc.close();
		
	}

}
