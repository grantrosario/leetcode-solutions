package algorithm.solutions;
import java.util.*;

public class Q1 {
	
	    public int[] twoSum(int[] nums, int target) {
	    	
	    Map<Integer, Integer> map = new HashMap<>();
	    
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        
	        if (map.containsKey(complement)) {
	            return new int[] { map.get(complement), i };
	            }
	        
	        map.put(nums[i], i);
	        }
	    
	    throw new IllegalArgumentException("No two sum solution");
	    }

	public static void main(String[] args) {
		Q1 q1 = new Q1();
		int[] input = {2, 7, 11, 15};
		int target = 9;
		
		System.out.println(Arrays.toString(q1.twoSum(input, target)));
	}

}
