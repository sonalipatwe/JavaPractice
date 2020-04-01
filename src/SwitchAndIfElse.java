import java.util.Scanner;

public class SwitchAndIfElse {

	
	public static void main(String args[]) {
		Scanner answer = new Scanner(System.in);
		System.out.println("Are you working from home?");
		String ans = answer.next();
		if(ans.equals("yes")){
			System.out.println("You are safe..");
		}else{
			System.out.println("Please be at home.");
		}
		switch(ans){
		case "yes" : System.out.println("Well done!");
		case "no" : System.out.println("You need to take care.");
		}
		
	}
}



