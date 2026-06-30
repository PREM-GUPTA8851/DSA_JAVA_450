// Java Code to print duplicate characters 
// and their counts using Hashing
import java.util.*;

class GfG {

    // Function to print duplicate characters with their count
    public static void printDuplicates(String s) {

        // Hash map to store frequency of each character
        HashMap<Character, Integer> freq = new HashMap<>();

        // Count frequency of each character
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // Traverse the map and print characters with count > 1
        for (Map.Entry<Character, Integer> it : freq.entrySet()) {
            if (it.getValue() > 1) {
                System.out.print("['" + it.getKey() + "', " + it.getValue() + "], ");
            }
        }
    }

    public static void main(String[] args) {

        String s = "geeksforgeeks";

        printDuplicates(s);
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
class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        if(nums1.size()>nums2.size()) return findMedianSortedArrays(nums2,nums1);

        int m=nums1.size(),n=nums2.size();
        int low=0,high=m;

        while(low<=high){
            int cut1=(low+high)/2;
            int cut2=(m+n+1)/2-cut1;

            int l1=(cut1==0)?INT_MIN:nums1[cut1-1];
            int l2=(cut2==0)?INT_MIN:nums2[cut2-1];
            int r1=(cut1==m)?INT_MAX:nums1[cut1];
            int r2=(cut2==n)?INT_MAX:nums2[cut2];

            if(l1<=r2 && l2<=r1){
                if((m+n)%2==0)
                    return (max(l1,l2)+min(r1,r2))/2.0;
                return max(l1,l2);
            }
            else if(l1>r2) high=cut1-1;
            else low=cut1+1;
        }
        return 0.0;
    }
};

class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        if(nums1.size()>nums2.size()) return findMedianSortedArrays(nums2,nums1);

        int m=nums1.size(),n=nums2.size();
        int low=0,high=m;

        while(low<=high){
            int cut1=(low+high)/2;
            int cut2=(m+n+1)/2-cut1;

            int l1=(cut1==0)?INT_MIN:nums1[cut1-1];
            int l2=(cut2==0)?INT_MIN:nums2[cut2-1];
            int r1=(cut1==m)?INT_MAX:nums1[cut1];
            int r2=(cut2==n)?INT_MAX:nums2[cut2];

            if(l1<=r2 && l2<=r1){
                if((m+n)%2==0)
                    return (max(l1,l2)+min(r1,r2))/2.0;
                return max(l1,l2);
            }
            else if(l1>r2) high=cut1-1;
            else low=cut1+1;
        }
        return 0.0;
    }
};            
class Solution {
    public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE; 
        int maxProfit = 0;

        for (int price : prices) {
            // price --> 7, 1, 5, 3, 6
            minPrice = Math.min(minPrice, price);
            // minPrice = min(max, 7) --> 7
            // minPrice = min(1,2) --> 1
            maxProfit = Math.max(maxProfit, price - minPrice);
            //maxprofit = max(0, 7 - 7)--> 0
            // maxProfit = max(0, 1-1) --> 0
        }
        return maxProfit;
        // 5
    }
}

	
	

        
