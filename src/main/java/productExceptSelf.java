import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class productExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] product = new int[nums.length];
        int count =1;
        for (int i = 0; i < nums.length ; i++) {
            product [i] = count;
            count *= nums[i];
        }
        count = 1;
        for (int i = nums.length -1; i >= 0 ; i--) {
            product[i] *= count;
            count *= nums[i];
        }
        return product;
    }
}
