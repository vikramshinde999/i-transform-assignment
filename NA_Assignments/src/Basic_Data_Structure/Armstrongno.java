package Basic_Data_Structure;

import java.util.Scanner;

public class Armstrongno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int n=153;
int org;
org=n;
int rem;
int res=0;

while(org>0) {
	rem=org%10;
	res+=Math.pow(rem, 3);
	org=org/10;
}
if(res== n) {
	   System.out.println("this is amstrong no");
}
else {
	   System.out.println("not");
}
	}

}
