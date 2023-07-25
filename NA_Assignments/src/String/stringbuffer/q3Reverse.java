package String.stringbuffer;

public class q3Reverse {
	 public static String reverseString(String str) {
	       
	        StringBuffer stringBuffer = new StringBuffer(str);
	        
	        stringBuffer.reverse();
	        
	        return stringBuffer.toString();
	    }
	 public static void main(String[] args) {
	        String originalString = "This method returns the reversed object on which it was called";
	        String reversedString = reverseString(originalString);
	        System.out.println("Original String: " + originalString);
	        System.out.println("Reversed String: " + reversedString);
	    }

	   
}
