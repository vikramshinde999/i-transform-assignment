package Basic_Data_Structure;

import java.util.Scanner;

public class q9avg {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int numStudents = 3; // Change this value to the number of students you want to input

	        int[] marksA = new int[numStudents];
	        int[] marksB = new int[numStudents];
	        int[] marksC = new int[numStudents];

	        // Input marks for each student for subject A, B, and C
	        for (int i = 0; i < numStudents; i++) {
	            System.out.println("Student " + (i + 1));
	            System.out.print("Enter marks for subject A: ");
	            marksA[i] = scanner.nextInt();

	            System.out.print("Enter marks for subject B: ");
	            marksB[i] = scanner.nextInt();

	            System.out.print("Enter marks for subject C: ");
	            marksC[i] = scanner.nextInt();
	        }

	        scanner.close();

	        // Calculate and display total and average for each subject
	        int totalA = calculateTotal(marksA);
	        int totalB = calculateTotal(marksB);
	        int totalC = calculateTotal(marksC);

	        double averageA = calculateAverage(marksA);
	        double averageB = calculateAverage(marksB);
	        double averageC = calculateAverage(marksC);

	        System.out.println("Subject A - Total: " + totalA + ", Average: " + averageA);
	        System.out.println("Subject B - Total: " + totalB + ", Average: " + averageB);
	        System.out.println("Subject C - Total: " + totalC + ", Average: " + averageC);

	        // Calculate and display total and average for each student
	        for (int i = 0; i < numStudents; i++) {
	            int totalStudent = marksA[i] + marksB[i] + marksC[i];
	            double averageStudent = totalStudent / 3.0;
	            System.out.println("Student " + (i + 1) + " - Total: " + totalStudent + ", Average: " + averageStudent);
	        }
	    }

	    public static int calculateTotal(int[] marks) {
	        int total = 0;
	        for (int mark : marks) {
	            total += mark;
	        }
	        return total;
	    }

	    public static double calculateAverage(int[] marks) {
	        return calculateTotal(marks) / (double) marks.length;
	    }
	}


