import java.util.ArrayList;
import java.util.List;

public class Main {

    /** Method 'main'
     * Meaning: outputs information (empty array, average, negative numbers) about an array 'nums'
     * Exceptions: EmptyArray if 'nums' is empty
     */
    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5};
        AvgResult result;
        try {
            result = avg(nums);
            if (result.getNegativeIndices().size() > 0) {
                result.getNegativeIndices().stream()
                                .map(index -> "The " + (index + 1) + getSuffix(index) +" number " + nums[index] + " is invalid")
                                .forEach(System.out::println);
            } else {
                System.out.println(result.getAverage());
            }
        } catch (EmptyArray e) {
            System.out.println("The array is empty or null.");
        }
}
    /**
     * Method 'getSuffix'
     * Meaning: determines the appropriate suffix for cardinal number
     * Parameter n: integer from negativeIndices ArrayList
     * Precondition: none
     * Postcondition: Returs a String representating parameter n in a printed list (index 0 === "1st")
     * Exceptions: none
     */

    public static String getSuffix(int n) {
        String[] suffixes = new String[] { "st", "nd", "rd", "th" };
        int index = (n % 100 > 10 && n % 100 < 14) ? 3 : n % 10;
        return suffixes[index];
    }

    /**
     * Method 'avg'
     * Meaning: Calculates the average of integers in parameter 'nums' and if 'nums' contains negative numbers, 
     * creates a list of indices of said numbers. Returns an AvgResult object with above information.
     * Parameter nums: Array of integers 
     * Precondition: none 
     * Postcondition: Creates and returns an AvgResult object 
     * Exceptions: If 'nums' is empty, throws EmptyArray
     */
            
    public static AvgResult avg(int[] nums) throws EmptyArray {
        int sum = 0;
        List<Integer> negativeIndices = new ArrayList();
        if (nums == null || nums.length == 0) {
            throw new EmptyArray();
        }
        for(int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (n < 0) {
                negativeIndices.add(i);
            }
            else {
            sum += n;
            }
        }
        float average = (float) sum / nums.length;
        return new AvgResult(average, negativeIndices);
    }
}

class EmptyArray extends Exception {}

/**
 * class 'AvgResult'
 * Meaning: holds and passes on information about the parameter Array of avg-method
 */

class AvgResult {
private float average;
private List<Integer> negativeIndices;

    public AvgResult(float average, List<Integer> negativeIndices) {
        this.average = average;
        this.negativeIndices = negativeIndices;
    }

    public float getAverage() {
        return average;
    }

    public List<Integer> getNegativeIndices() {
        return negativeIndices;
    }
}
