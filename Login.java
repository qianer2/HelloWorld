/**
*@program:Login
*@Description:It's enter the account name and password to log in through this program
*@author:zhuojiaqian
*@date:2019.10.09
*/
public class Login{
	public static void main(String[] args){
		final String username = "text";
		final String userpassword = "123456";
		
		User user = new User();
		
		Scanner scanner = new Scanner(System.in);
		
		String usernameinput = scanner.next();
		
		if(username.equals(usernameinput)){
			System.out.println("Please input your password:");
			
			String userpasswordinput = scanner.next();
			
			if(userpassword.equals(userpasswordinput)){
				System.out.println("Welcome!");
			}
			
		}
		
	}
}