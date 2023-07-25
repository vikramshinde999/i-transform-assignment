package oops;


	public final class Singleton {
	    private static Singleton instance;

	    // Private constructor to prevent instantiation from outside the class
	    private Singleton() {
	        // Initialization code here (if needed)
	    }

	    // Static method to return the Singleton instance
	    public static Singleton getInstance() {
	        if (instance == null) {
	            instance = new Singleton();
	        }
	        return instance;
	    }

	    // Other methods and properties (if needed)
	}



