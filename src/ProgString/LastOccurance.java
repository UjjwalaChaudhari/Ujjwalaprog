package ProgString;

public class LastOccurance {

	public static void main(String[] args) {
		/*Using Function
		 * String t1 = "Tutorialspoint"; int index = t1.lastIndexOf("n");
		 * System.out.println(index);
		 */   
		String strOrig ="Hello world,Hello Reader";
	      int lastIndex = strOrig.lastIndexOf("x");
	      
	      if(lastIndex == - 1){
	         System.out.println("Not found");
	      } else {
	         System.out.println("Last occurrence of Hello is at index "+ lastIndex);
	      }
		
	}

}
