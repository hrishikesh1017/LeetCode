class Solution {
    public int maxArea(int[] height) {
        int right = height.length-1;
        int left = 0;
        int max = 0;
        while(left<right){
        int x = (height[left]<height[right])?height[left]:height[right];
        if(max<(right-left)*x)
            max = (right-left)*x;
            if(x==height[left]){
                left++;
            }
            else{
                right--;
            }
        }
    return max;    
    }
}