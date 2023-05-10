import java.util.Scanner;
class NameAndPassword{
	public static void main(String[] args){
		//screating a scanner
	Scanner s = new Scanner(System.in);
	//screating a username and password
	String name = "Shubha";
	String password = "Shubha1234";

	while(true){
		//what the user entered the name
		System.out.println("Enter name");
		String iname = s.next();
        //what the user entered the password
		System.out.println("Enter password");
		String ipassword = s.next();
        //if the username = Shubha and password = Shubha1234 it is correct and it will stop the loop
		if(iname.equals(name) && ipassword.equals(password)){
			System.out.println("Correct!");
			break;
		}
		else{
			//if it is not correct it is wrong and it will stop the loop
		System.out.println("Wrong!");
		break;
		}
	}
	}
}