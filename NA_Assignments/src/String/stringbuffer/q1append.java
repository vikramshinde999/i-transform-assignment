package String.stringbuffer;

public class q1append {
	public static void main(String[] args) {
		StringBuffer sb =new StringBuffer();
		sb.append("StringBuffer");
		sb.append("is a peer class of String");
		sb.append("that provides much of");
		sb.append("the functionality of strings");
		
		String result=sb.toString();
		System.out.println(result);
	}


}
