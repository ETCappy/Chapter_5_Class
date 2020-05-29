import java.util.Scanner;
public class Loop_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		System.out.print("How many grades would you like to enter: ");
		
		int times = scan.nextInt();
		int sumOfGrades = 0; //outside the loop so condition does not get set to 0
		//every time the loop iterates
		
		for (int i = 0; i <= times;i++) {
			
			System.out.println("Enter grade " + i + "-->");
			int grade = scan.nextInt();//inside the loop-consistent to this grade only
			//sumOfGrades = sumOfGrades + grade;
			sumOfGrades += grade;
			
		}
		
		System.out.println("The sum of the grades is:: " + sumOfGrades);
			
			
		}
		
		

	}


