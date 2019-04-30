package example;

public class Pow {
	public static void main(String [] args) {
	
        int base = 3, exponent = 4;

        long res = 1;

        while (exponent != 0)
        {
            res *= base;
            --exponent;
        }

        System.out.println("Answer = " + res);
    }
}
