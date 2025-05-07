package problem4;

public class problem4 {

	    public static void main(String[] args) {
	        String s = "Harigaran";
	        String result = removeDuplicates(s);
	        System.out.println("Result = " + result);
	    }

	    public static String removeDuplicates(String s) {
	        String result = "";
	        for (int i = 0; i < s.length(); i++) {
	            char current = s.charAt(i);
	       
	            if (result.indexOf(current) == -1) {
	                result += current;
	            }
	        }
	        return result;
	    }
	}