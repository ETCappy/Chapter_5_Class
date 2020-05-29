//for loops run a fixed number of times
//strings have a fixed length beginning at 1.  ending place is the length.  beginning is the index.
//index is always one less than the length and begins at 0.  

public class Loop_String {

	public static void main(String[] args) {
		
		String word = "Marist";
		
		for(int i = 0; i < word.length();i++)
			System.out.print(word.charAt(i));  //will print out each individual character

	}

}


/*  123456 length
	Marist
	012345 index
	
	i	output
	____________
	0		M
	1		a
	2		r
	3		i
	4		s
	5		t

iteration takes place after the first print stmt.

*/