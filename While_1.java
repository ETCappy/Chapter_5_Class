//Increment by 1 steps of a while loop
public class While_1 {

	public static void main(String[] args) {
		
		int i = 1; //always initialize outside of the loop- 1
		while(i <= 5) {  //2 says where the loop ends conditional
			
			i++;  //3 counts up increment
			System.out.println( i + "");
	
			//i++;  //3 counts up below print stmt normal
			
		}


	
	}
	
	

}
//iteration below the print stmt-normal output
/*i          output
1			1
2			2
3			3
4			4
5			5 */

//iteration above the print stmt-
/*i          output
1			
2			2
3			3
4			4
5			5 
6			6*/