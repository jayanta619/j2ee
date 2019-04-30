package day3;

public class Varargs {
	public void summ(int... num) {
		int sum = 0;
		for (int j = 0; j < num.length; j++)

			sum += num[j];
	}

	public void summ(int n, int... num) {
		int sum = 0;
		for (int j = 0; j < num.length; j++)

			sum += num[j];
		System.out.println(sum);
	}

	public void summ(float n, int... num) {
		float sum = 0;
		for (int j = 0; j < num.length; j++)

			sum += num[j];
		System.out.println(sum);
	}
}
