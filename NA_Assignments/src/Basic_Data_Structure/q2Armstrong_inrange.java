package Basic_Data_Structure;

import java.util.Scanner;

public class q2Armstrong_inrange {
static void arm(int a,int b) {
	for(int i=a;i<=b;i++) {
		
		int n=i;
		int res=0;
        
		while(n>0) {
		int	rem=n%10;
			res+=Math.pow(rem, 3);
			n=n/10;
		}
		if(res== i) {
			   System.out.println(res);
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter range");
int a=sc.nextInt();
int b=sc.nextInt();
q2Armstrong_inrange.arm(a, b);

	}

}
