package String.stringbuffer;

public class q1StringBuilder {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("Hello");
		sb.append(" ");
		sb.append("World");
		sb.insert(5, ",");
		sb.reverse();
		String result = sb.toString();
		System.out.println(result);
	}
	
}
