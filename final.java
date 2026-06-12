// // // // // ================================(Array)===========================
// 1.Reverse the Array 
/*
Input: arr[] = [1, 4, 3, 2, 6, 5]  
Output:  [5, 6, 2, 3, 4, 1]
Explanation: The first element 1 moves to last position, the second element 4 moves to second-last and so on.

Input: arr[] = [4, 5, 1, 2]
Output: [2, 1, 5, 4]
Explanation: The first element 4 moves to last position, the second element 5 moves to second last and so on.
*/

// import java.util.Arrays;

// class save{
//     public static void reverseArray(int[] arr){
//         // reverse krna h ab two pointer method k use krke krte h ab
//         int i = 0, j = arr.length -1 ;
//         while(i <= j){
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//             i++; 
//             j--;
//         }
//     }
//     public static void main(String[] args){
//         int[] arr = { 1, 4, 3, 2, 6, 5};

//         reverseArray(arr);
//         for(int i = 0; i < arr.length; i++){
//             System.out.printf(arr[i] + " ");
//         }
//     }
// }

//2.Find the max and min element in an array
/*
Input: arr[] = [3, 5, 4, 1, 9]
Output: [1, 9]
// Explanation: The minimum element is 1, and the maximum element is 9.

// Input: arr[] = [22, 14, 8, 17, 35, 3]
// Output: [3, 35] 
// Explanation: The minimum element is 3, and the maximum element is 35.
// // */

// // import java.util.ArrayList;

// class GfG {
//     public static ArrayList<Integer> findMinMax(int[] arr) {
//         int mini = Integer.MAX_VALUE;
//         int maxi = Integer.MIN_VALUE;
        
//         // Find minimum and maximum
//         for (int num : arr) {
//             if (num < mini) mini = num;
//             if (num > maxi) maxi = num;
//         }
        
//         ArrayList<Integer> result = new ArrayList<>();
//         result.add(mini);
//         result.add(maxi);
//         return result;
    
// }

//     public static void main(String[] args) {
//         int[] arr = {3, 5, 4, 1, 9};
//         ArrayList<Integer> result = findMinMax(arr);
//         System.out.println(result.get(0) + " " + result.get(1));
//           }
// }

// 3.Kth Smallest
class Solution {
    public int kthSmallest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }
}

//4.sort 0s,1s and 2s
class Solution {
    public void sort012(int[] arr) {
        int c0 = 0, c1 = 0, c2 = 0;

        for(int x : arr){
            if(x == 0) c0++;
            else if(x == 1) c1++;
            else c2++;
        }

        int i = 0;

        while(c0-- > 0) arr[i++] = 0;
        while(c1-- > 0) arr[i++] = 1;
        while(c2-- > 0) arr[i++] = 2;
    }
}

//5. program to Move all negative numbers to beginning and positive to end
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
// 6. wap to find the union of two arrays
class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
         // so we used treeset in java it prevents duplicacy and always stored result's in sorted order 
        TreeSet<Integer> set = new TreeSet<>();
            // dono array se element nikalne h aur tree set m store krne h
        for(int x: a) set.add(x);
        for(int x: b) set.add(x);

        return new ArrayList<Integer>(set);
            
    }
}


// 24.Find the longest consecutive sequence in an array
class Solution {
    public int longestConsecutive(int[] arr) {
        Arrays.sort(arr);
        // 1 2 3 4 5 6 9
        int count = 1;
        int maxi = 1;

        for(int i = 0; i < arr.length - 1; i++) {
            // if duplicates skip them --> 
            if(arr[i] == arr[i + 1])
                continue;
            if(arr[i] + 1 == arr[i + 1])
                count++;
            // i --> 0 -->1 + 1 = 2 c --> 2
            // i --> 1 -->2 + 1 = 3 c --> 3
            // i --> 2 -->3 + 1 = 4 c --> 4
            // i --> 3 -->4 + 1 = 5 c --> 5
            // i --> 4 -->5 + 1 = 6 c --> 6
            else       count = 1;

            maxi = Math.max(maxi, count);
        }

        return maxi;
    }
}

// 40,41 last one Median of an Array
class Solution {
    public double findMedian(int[] arr) {
        Arrays.sort(arr);
        int size = arr.length; 
        // 
        if(size % 2 == 0){
            int first = size / 2;
            int second = (size /2) - 1;
            return (arr[first]+ arr[second])/(double)2;
        }
        else {
        // pehle sort --> then size check if odd hua to
        // size/2 wala element access krna 
        return arr[size/2];
        }
    }
}

/*  

*/
