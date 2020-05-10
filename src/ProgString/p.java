package ProgString;

public class p {
public static void main(String[] args) {
	//-----------------------
	System.out.println("Reverse String");
	String a="ABCDEFG";
	System.out.print(a);
	char[] p=a.toCharArray();
	for(int i=p.length-1;i>=0;i--)
		System.out.print(p[i]);
	System.out.println();
	//---------------------------------------
	System.out.println("\nConcate String");
	String s1="Ujjwala";
	String s2="Chaudhari";
	String s3=s1.concat(s2);
	System.out.println(s3);
	//---------------------------------------
	System.out.println("\nUppercase String");
	String x="ujjwala";
	String y=x.toUpperCase();
	System.out.println(y);
	//---------------------------------------
	System.out.println("\nLowercase String");
	String z="UJJWALA";
	String w=z.toLowerCase();
	System.out.println(w);
	//--------------------------------------
	System.out.println("Replace Character");
	String q="Hello Java";
	System.out.println(q.replaceFirst("H","S"));	
	System.out.println(q.replaceAll("Hello","Core"));
	System.out.println(q.replace("a","T"));
	//-------------------------------------------
	System.out.println("Palindrome");
	int no=123;
	int temp=no,digit=0,sum=0;
	while(no>0) {
		digit=no%10;
		sum=(sum*10)+digit;
		no=no/10;
	}
	if(temp==sum)
			System.out.println("no is palindrome");
	else
		System.out.println("no is not palindrome");
	//-------------------------------------------------------
	System.out.println("Add 3 digit no");
	int no1=123;
	int digit1=0,sum1=0;
	while(no1>0)
	{
		digit1=no1%10;
		sum1=sum1+digit1;
		no1=no1/10;
	}
	System.out.println(sum1);
	//-------------------------------------------------------
		System.out.println("Armster number");
		int c=406;
		int t=c;
		int d=0,s=0;
		while(c>0)
		{
			d=c%10;
			s=s+(d*d*d);
			c=c/10;
		}
		if(t==s)
			System.out.println("no is Armster no");
	else
		System.out.println("no is not Armster no");
	
}
}
