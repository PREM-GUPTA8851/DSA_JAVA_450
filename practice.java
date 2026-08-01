
class Solution {
    public int search(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        // nums = [4,5,6,7,0,1,2]
        // target = 0

        while (low <= high) {

            int mid = low + (high - low) / 2;

            /*
            1st Iteration

            low = 0
            high = 6
            mid = 3

            nums[mid] = 7

            nums[low] <= nums[mid]
            4 <= 7

            Left Half = [4,5,6,7]

            target >= nums[low] && target < nums[mid]
            0 >= 4  -> false

            low = mid + 1
            low = 4
            */

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[low] <= nums[mid]) {

                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }

            } else {

                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            /*
            2nd Iteration

            low = 4
            high = 6
            mid = 5

            nums[mid] = 1

            nums[low] <= nums[mid]
            0 <= 1

            Left Half = [0,1]

            target >= nums[low] && target < nums[mid]
            0 >= 0
            0 < 1

            high = mid - 1
            high = 4
            */
        }

        /*
        3rd Iteration

        low = 4
        high = 4
        mid = 4

        nums[mid] = 0

        target mil gaya

        return 4
        */

        return -1;
    }
}
// 5.Java program to Move all negative numbers
// to beginning and positive to end.

class GfG {

    static int[] move(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {

            // increment left while arr[left]
            // is negative
            while (left < right && arr[left] < 0) {
                left++;
            }

            // decrement right while arr[right]
            // is positive
            while (right > left && arr[right] > 0) {
                right--;
            }

            // swap the two values.
            if (right > left) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int[] ans = move(arr);

        for (int num : ans) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

class Solution {
    public void sort012(int[] arr) {
        // by using dutch national flag algorithms
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while(mid <= high){
            if(arr[mid] == 0){
                // swap with arr[low]
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                mid++;
                low++;
            }
            else if(arr[mid]  == 1){
                // 1 uski correct position m h
                mid++;
            }
            else{
                // arr[mid] ==2 
                // swap with high
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {0, 1, 2, 0, 1, 2};
        sort012(arr);
    }
}


// 2.WAFP for min and max in an array .
import java.util.ArrayList;

class Main {
    public static ArrayList<Integer> findMinMax(int[] num){
        ArrayList<Integer> ans = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i: num){
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        ans.add(min);
        ans.add(max);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 1, 9};
        ArrayList<Integer> result = findMinMax(arr);
        System.out.println(result.get(0) + " " + result.get(1));
    }
}

// 1.WAFP for reverse an array 
import java.util.Arrays;

class Main{
    static void ReverseArray(int[] arr){
        // reverse an array by using swap 
        int left= 0;
        int right = arr.length -1;

        while(left < right){
            // swap from 
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};

        ReverseArray(arr);
        for(int i: arr){
            System.out.printf(i + ", ");
        }
    }
}
