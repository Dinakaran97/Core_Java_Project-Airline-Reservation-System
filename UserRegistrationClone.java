import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;





class Userclone{
	String uname,upass;
	public String name,mail,pass;
	public String mobno;
	public void userRegister() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name:");
		name=sc.nextLine();
		System.out.println("Enter your Mail id:");
		mail=sc.nextLine();
		System.out.println("Enter new password:");
		pass=sc.nextLine();
		System.out.println("Enter your Mobile number:");
		mobno=sc.nextLine();
		System.out.println();
		
		Pattern ptrn = Pattern.compile("(0/91)?[7-9][0-9]{9}"); 
		Matcher match = ptrn.matcher(mobno); 
		
		
	if(match.find() && match.group().equals(mobno)) {
		System.out.println("Registration Successful"+" "+name);
		System.out.println();
		System.out.println("Please Login with your username and password");
		
		System.out.println();
		loginvalid();
	}
		

	
	
	

else {
	System.out.println("Enter valid Mobile Number");
	System.out.println();
	System.out.println("Enter your Mobile number:");
	mobno=sc.nextLine();
	System.out.println();
	loginvalid();
	
}
		
	}
	public void loginvalid() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("                     "+"Login");
		System.out.println("Enter your Name:");
		uname=sc.nextLine();
		System.out.println("Enter password:");
		upass=sc.nextLine();
		if(uname.equalsIgnoreCase(name)&& upass.equalsIgnoreCase(pass)) {
			System.out.println("Login Successful!");
			System.out.println();
			//Reservation rs=new Reservation();
			Runnable r= new PaymentClone();
			r.run();
			//rs.reserve();
		}
		
		else {
			System.out.println("Incorrect username or  password");
			loginvalid();
		}
	}
	
}
public class UserRegistrationClone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("              "+"             "+"Air India");
		System.out.println();
		System.out.println("***********************************************************");
	
	System.out.println("Welcome to Air India");
	System.out.println();
	System.out.println(" Please Sign up before continuing");
	System.out.println();
		
		Userclone ur=new Userclone();
		ur.userRegister();
	}

}
