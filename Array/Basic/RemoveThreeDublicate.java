
class Solution {
    public int removeDuplicates(int[] nums) {
      int count=0;
      for(int i=0;i<nums.length-2;i++){
        if(nums[i]==nums[i+1] && nums[i+1]==nums[i+2]){
            count++;
            
        }
      }
      int ans =nums.length-count;
    
        return ans;
    }
}
public class RemoveThreeDublicate {
    public static void main(String[] args) {
        int []nums ={1,1,1,2,2,3};
        Solution obj =new Solution();
        int result=obj.removeDuplicates(nums);
        System.out.println("count  " + result);
        int nums2[] =new int[result];
      for(int i=0;i<result;i++){
        nums2[i]=nums[i];
    }
    for(int i=0;i<nums2.length;i++){
        System.out.println(nums[i]);
    }
}
}
