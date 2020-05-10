package ProgString;

public class Deletecharacter {
	public static void main(String args[]) {
	      String str = "this is Java";
	      System.out.println("Original-- "+str);
	      System.out.println("New-- "+removeCharAt(str, 3));
	      
	   }
	   public static String removeCharAt(String s, int pos) {
	      return s.substring(0, pos) + s.substring(pos + 1);
	   }
}
