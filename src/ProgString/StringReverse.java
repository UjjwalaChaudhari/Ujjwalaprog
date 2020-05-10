package ProgString;

public class StringReverse {
public static void main(String[] args) {
	String input="Ujjwala";
	char[] x=input.toCharArray();
	
	for(int i=x.length-1;i>=0;i--)
		System.out.print(x[i]);
		
}
}
