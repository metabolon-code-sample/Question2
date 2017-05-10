
public class Question2Routine {

	// Assigns contents of command line arguments to Question2Class's x and y and displays the sum.
	public static void main(String[] args){
		Question2Class.x = Integer.parseInt(args[0]);
		Question2Class.y = Integer.parseInt(args[1]);
		
		System.out.println("The sum is: " + Question2Class.GetSum());
	}
}
