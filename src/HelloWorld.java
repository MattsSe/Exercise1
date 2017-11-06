import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("“Hello ASE2017 - how are you now? :)");
		System.out.println("Please enter your name: ");
		Scanner scanner = new Scanner(System.in);
		HelloUser user = new HelloUser(scanner.nextLine().trim());
		System.out.println(user.greetUser());
		
	}

}
