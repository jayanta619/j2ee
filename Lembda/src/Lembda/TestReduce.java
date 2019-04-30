package Lembda;


import java.util.Arrays;

public class TestReduce {

	public static void main(String[] args) {
		String[] myArray = { "this", "is", "a", "sentence" };
//[0, 1, 2, 3].reduce( function( accumulator, currentValue, currentIndex, array ){}, [ initialValue ])


		String result = Arrays.stream(myArray).reduce("", (a, b) -> a + b + " ");
		
		System.out.println(result);

		Integer[] nums = { 1, 2, 3, 4, 5 };
		Integer sum = Arrays.stream(nums).reduce(0, (a, b) -> a + b);
		System.out.println(sum);
		double [] minus = {0,4,3,2,1};
		double result1=Arrays.stream(minus).reduce(50, ( prev, curr ) -> prev - curr ) ;
		System.out.println(result1);
		
		
		
		double [] mul = {9,4,3,2,1};
		double result2=Arrays.stream(mul).reduce(50, ( prev, curr ) -> prev *curr ) ;
		System.out.println(result);
	}
}