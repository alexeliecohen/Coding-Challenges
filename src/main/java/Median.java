import java.util.Arrays;

public class Median {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 7, 8};
        int[] arr2 = {3, 4, 5, 6, 7, 8};
        System.out.println(findMedianSortedArrays(arr1, arr2));

    }

//    [1,2,3,3,4]
//    [1,5,7]

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int ptr1;
        int ptr2;
        int[] nums3 = new int[nums1.length + nums2.length];

        while ((i < nums1.length || j < nums2.length) && (k < nums3.length)) {

            ptr1 = i < nums1.length ? nums1[i] : Integer.MAX_VALUE;
            ptr2 = j < nums2.length ? nums2[j] : Integer.MAX_VALUE;

            if (ptr1 < ptr2) {
                nums3[k] = ptr1;
                i++;
            } else if (ptr1 > ptr2) {
                nums3[k] = ptr2;
                j++;
            } else {
                nums3[k] = ptr1;
                k++;
                nums3[k] = ptr2;
                i++;
                j++;
            }
            k++;
        }
        int median = (nums3.length - 1) / 2;
        return nums3.length % 2 == 0
                ? (double) (nums3[median] + nums3[median + 1]) / 2
                : nums3[median];
    }
}