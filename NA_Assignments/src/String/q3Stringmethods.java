package String;

public class q3Stringmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Java String pool refers to collection of Strings which are sorted in heep memory";
	System.out.println(str.toLowerCase());
	System.out.println(str.toUpperCase());
	System.out.println(str.replace('a','$'));
	System.out.println(str.contains("collection"));
	String str2="java string pool refers to collection of strings which are sorted in heep memory";
	boolean orignalMatch=str.equalsIgnoreCase(str2);
	System.out.println(orignalMatch);
	if(!orignalMatch) {
		boolean equalsignorecase=str.equalsIgnoreCase(str2);
		System.out.println(equalsignorecase);
	}
	}

}
