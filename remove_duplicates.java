import java.util.*;
public class remove_duplicates {
    class Solution {
        public int removeDuplicates(int[] nums) {
            HashMap<Integer,Integer>h1 = new HashMap();
            for(int i=0;i<nums.length;i++){
                h1.put(nums[i],i);
            }
            return h1.keySet().size();
        }
    }
    public static void main(String[] args){ }
}
