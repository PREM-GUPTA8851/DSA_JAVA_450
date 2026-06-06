
    public static void main(String[] args) {
        int[][] intervals={{1,3},{2,6},{8,10},{15,18}};

        Solution obj=new Solution();
        int[][] ans=obj.merge(intervals);

        System.out.print("[");
        for(int i=0;i<ans.length;i++){
            System.out.print(Arrays.toString(ans[i]));
            if(i<ans.length-1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
class Solution {
    public int search(int[] nums, int target) {
        int low=0,high=nums.length-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(nums[mid]==target) return mid;

            if(nums[low]<=nums[mid]){
                if(target>=nums[low] && target<nums[mid])
                    high=mid-1;
                else
                    low=mid+1;
            }else{
                if(target>nums[mid] && target<=nums[high])
                    low=mid+1;
                else
                    high=mid-1;
            }
        }
        return -1;
    }
}
