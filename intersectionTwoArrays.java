import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        // Iterate through nums1 and add each element to the set
        for (int num : nums1) {
            set.add(num);
        }

        Set<Integer> intersect = new HashSet<>();
        // Iterate through nums2 and check if each element exists in the set
        // If it does, add it to the intersect set
        for (int num : nums2) {
            if (set.contains(num)) {
                intersect.add(num);
                set.remove(num); // Remove the element from set to ensure uniqueness
            }
        }

        // Convert the intersect set to an array
        int[] result = new int[intersect.size()];
        int index = 0;
        for (int num : intersect) {
            result[index++] = num;
        }
        
        return result;
    }
}
