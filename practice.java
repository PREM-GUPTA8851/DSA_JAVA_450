// 6. Union of 2 arrays and return in Sorted order
class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        // we use Tree_set for union of 2 arrays
        TreeSet<Integer> ans = new TreeSet<>();
        // now add elements in tree_set
        for(int num: a) ans.add(num);
        for(int num: b) ans.add(num);
        
        return new ArrayList<>(ans);
    }
}

// 5.Java program to Move all negative numbers
// to beginning and positive to end

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
