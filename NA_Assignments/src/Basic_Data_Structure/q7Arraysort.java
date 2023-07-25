package Basic_Data_Structure;

import java.util.Arrays;
import java.util.Scanner;

public class q7Arraysort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
Scanner scanner = new Scanner(System.in);

System.out.print("Enter the number to search in the array: ");
int number = scanner.nextInt();
//i/p 19
Arrays.sort(arr);

int index=Arrays.binarySearch(arr,number);// If the number is found in the array, the binarySearch method returns the index of the number. If the number is not found, it returns a negative value. 
if(index>=0) {
	System.out.println(number+" no is present in array");
}else {
	System.out.println("number is not present");
}
	}

}
