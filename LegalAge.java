package training;
import java.util.Scanner;

public class LegalAge {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		if(input.hasNextInt()){
			int userAge=input.nextInt();
			if(userAge >= 18){
				System.out.println("You are of a valid age, Please proceed with casting your vote");
			}
			else{
				System.out.println("You are not of a valid age. Please retry once you are 18+");
			}
		}
		else{
			System.out.println("Age entered is not an integer, Please try again.");
		}
		input.close();
			
	}

}
