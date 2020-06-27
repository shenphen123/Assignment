package core.task4;
import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		int[] array_nums = {5, 7, 2, 4, 9};
		System.out.println("Original Array: "+Arrays.toString(array_nums)); 
		int max = array_nums[0];
		int min = array_nums[0];
		int x = array_nums[0];
		for(int i = 1; i < array_nums.length; i++)
		{
			x += array_nums[i];
			if(array_nums[i] > max)
				max = array_nums[i];
			else if(array_nums[i] < min)
				min = array_nums[i];
		}
		int sum = (x-max-min);
		System.out.println("The sum of array excluding highest and lowest " + sum);

}
}