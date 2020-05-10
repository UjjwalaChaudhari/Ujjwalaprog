package ProgString;

import java.util.Scanner;

public class Searchprog {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a[]= {1,2,3,4,5};
	int tosearch,found = 0;
	
	System.out.println("Enter the no");
	tosearch=sc.nextInt();
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==tosearch) {
		found=1;
		break;
		}
	}
	if(found==1) {
		System.out.println("found");
	}else {
		System.out.println("Not found");}
}
}
