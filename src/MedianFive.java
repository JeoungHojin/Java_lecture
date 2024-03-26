import java.util.Arrays;
import java.util.Scanner;

public class MedianFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] array = new int[5];
		for (int i=0;i<5;i++) {
			array[i] = input.nextInt();
		}
		Arrays.sort(array);
		System.out.println(array[2]);
	}
}
