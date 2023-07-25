package Basic_Data_Structure;

import java.util.Scanner;

public class q4Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
System.out.println("enter 3 sub marks");
int m1=sc.nextInt();
int m2=sc.nextInt();
int m3=sc.nextInt();

if(m1>60 && m2>60 && m3>60) {
	System.out.println("result:Passed");
}
else if((m1>60 && m2>60)||(m1>60 && m3>60)||(m2>60 && m3>60)) {
System.out.println("result:Promoted");	
}
else if(m1>60 || m2>60 || m3>60 ||(m1<60 && m2<60 && m3<60)) {
	System.out.println("result :faild");
}
	}

}
