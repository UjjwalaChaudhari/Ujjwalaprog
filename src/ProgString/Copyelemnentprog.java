package ProgString;

import java.util.Arrays;
import java.util.Scanner;

public class Copyelemnentprog {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Array a="+Arrays.toString(a));
		
		int b[] = Arrays.copyOf(a,10);
		System.out.println("Array b="+Arrays.toString(b));
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
