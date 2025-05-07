package problem3;

public class problem3 {

	    public static void main(String[] args) {
	        int[] arr = {20, 50, 30, 40, 60, 70};
	        System.out.println("Second largest: " + findSecondLargest(arr));
	    }

	    public static int findSecondLargest(int[] arr) {
	        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
	        for (int num : arr) {
	            if (num > first) {
	                second = first;
	                first = num;
	            } else if (num > second && num != first) {
	                second = num;
	            }
	        }
	        return second == Integer.MIN_VALUE ? -1 : second;
	    }
	}

