package code;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello");
		int T = sc.nextInt();
		for(int t=0; t<T; t++){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    int v = sc.nextInt();
		    int a[] = new int[n];
		    double sum = 0;
		    for(int i=0; i<n; i++){
		        a[i] = sc.nextInt();
		        sum += a[i];
		    }
		    double x = ((v*(n+k))-sum)/k;
		    int x_int = (int)x;
		    double x_fraction = x - x_int;
		    if(x>0 && x_fraction==0.0)
		        System.out.println(x_int);
		    else
		         System.out.println("-1");
		    		     
		}
	}
}