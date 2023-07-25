package String.stringbuffer;

public class q2sb {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		StringBuffer sb =new StringBuffer("it is used to_at the specified index position");
		String s2="insert text";
	int index=sb.indexOf("_");
	sb.insert(index,s2);
	System.out.println(sb);
	}

}
