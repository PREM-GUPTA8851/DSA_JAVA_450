import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);

        List<int[]> ans=new ArrayList<>();

        for(int[] it:intervals){
            if(ans.isEmpty() || ans.get(ans.size()-1)[1]<it[0]){
                ans.add(it);
            }else{
                ans.get(ans.size()-1)[1]=Math.max(ans.get(ans.size()-1)[1],it[1]);
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }

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
