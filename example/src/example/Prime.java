package example;

public class Prime {

	public static void main(String[] args) {
	        int num = 29;
	    	int temp =0;
	        for(int i = 2; i <= num/2; ++i)
	        {
	       
	            if(num % i == 0)
	            {
	             temp ++;
	                break;
	            }
	        }
	        if (temp ==0)
	            System.out.println(num + " is a prime number.");
	        else
	            System.out.println(num + " is not a prime number.");
	    }
	}

	


