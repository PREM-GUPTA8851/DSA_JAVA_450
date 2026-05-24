// ////// DSA with jav
// // -------------(450) ---------a- 

// // ================================(Array)===========================
// // Reverse the Array 
// /*
// Input: arr[] = [1, 4, 3, 2, 6, 5]  
// Output:  [5, 6, 2, 3, 4, 1]
// Explanation: The first element 1 moves to last position, the second element 4 moves to second-last and so on.

// Input: arr[] = [4, 5, 1, 2]
// Output: [2, 1, 5, 4]
// Explanation: The first element 4 moves to last position, the second element 5 moves to second last and so on.
// */

// // import java.util.Arrays;

// // class save{
// //     public static void reverseArray(int[] arr){
// //         // reverse krna h ab two pointer method k use krke krte h ab
// //         int i = 0, j = arr.length -1 ;
// //         while(i <= j){
// //             int temp = arr[i];
// //             arr[i] = arr[j];
// //             arr[j] = temp;
// //             i++; 
// //             j--;
// //         }
// //     }
// //     public static void main(String[] args){
// //         int[] arr = { 1, 4, 3, 2, 6, 5};

// //         reverseArray(arr);
// //         for(int i = 0; i < arr.length; i++){
// //             System.out.printf(arr[i] + " ");
// //         }
// //     }
// // }

// //Find the max and min element in an array
// /*
// Input: arr[] = [3, 5, 4, 1, 9]
// Output: [1, 9]
// Explanation: The minimum element is 1, and the maximum element is 9.

// Input: arr[] = [22, 14, 8, 17, 35, 3]
// Output: [3, 35] 
// Explanation: The minimum element is 3, and the maximum element is 35.
// // */

// // import java.util.ArrayList;

// // class GfG {
// //     public static ArrayList<Integer> findMinMax(int[] arr) {
// //         int mini = Integer.MAX_VALUE;
// //         int maxi = Integer.MIN_VALUE;
        
// //         // Find minimum and maximum
// //         for (int num : arr) {
// //             if (num < mini) mini = num;
// //             if (num > maxi) maxi = num;
// //         }
        
// //         ArrayList<Integer> result = new ArrayList<>();
// //         result.add(mini);
// //         result.add(maxi);
// //         return result;
    
// // }

// //     public static void main(String[] args) {
// //         int[] arr = {3, 5, 4, 1, 9};
// //         ArrayList<Integer> result = findMinMax(arr);
// //         System.out.println(result.get(0) + " " + result.get(1));
// //           }
// // }


// // import java.util.Arrays;
// // import java.util.Scanner;

// // class Solution {
// //     public static int kthSmallest(int[] arr, int k) {
// //         Arrays.sort(arr);
// //         return arr[k - 1];
// //     }

// //     public static void main(String[] args){
// //         Scanner sc = new Scanner(System.in);
// //         int n = sc.nextInt();
// //         int[] arr = new int[n];
// //         for(int i = 0; i < arr.length; i++){
// //             arr[i] = sc.nextInt();
// //         }
// //         int k = sc.nextInt();
// //         int result = kthSmallest(arr, k);
// //         System.out.println(result);
// //     }
// // }


// // class Solution {
// //     public void sort012(int[] arr) {
// //         // algorithm --> count 0, 1, 2
// //         int countz = 0, counto = 0, countt = 0;
// //         // then insert in same array --> 0, 1, 2
// //         for(int num : arr) {
// //             if(num == 0) countz++;
// //             else if(num == 1) counto++;
// //             else countt++;
// //         }
        
// //         // now inserting element's till count size
// //         for(int i = 0 ; i < countz; i++){
// //             arr[i] = 0;
// //         }
// //         for(int i = countz; i < countz + counto; i++){
// //             arr[i] = 1;
// //         }
// //         for(int i = countz + counto ; i < countz + counto + countt; i++){
// //             arr[i] = 2;
// //         }
// //     }
// // }


// // 4 --> Move all negative number's to the left side of an array 
// // Java program to Move all negative numbers
// // to beginning and positive to end
// /*
// Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
// Output: -12 -13 -5 -7 -3 -6 11 6 5
// */
// // By using two pointer approach 

// // import java.util.Scanner;

// // class save{
// //     static int[] move(int[] arr){
// //         int left = 0, right = arr.length - 1;
// //         while(left < right){
// //             // jb left m -ve ho tb left ko increase nhi krna bcz hume left m -ve lane h
// //             if(arr[left] < 0) left++;

// //             else if(arr[right] > 0) right--;

// //             // baki bacha test case swap 
// //             int temp = arr[left];
// //             arr[left] = arr[right];
// //             arr[right] = temp;
// //         }
// //         return arr;
// //     }

// //     public static void main(String[] args) {
// //         int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
// //         int[] ans = move(arr);

// //         for (int num : ans) {
// //             System.out.print(num + " ");
// //         }
// //         System.out.println();
// //     }
// // }

// // User function Template for C++

// // class Solution {
// //   public:
// //     void rotate(vector<int> &arr) {
// //         int length = arr.size();
// //         // shift by 1 krna h 
// //         //sbse pehle agar array k last element store krna 
// //         // store = 5
// //         int store = arr[length - 1];
// //         // aur fhir 1 shift krna array k elements ko
// //         // .. | 1 | 2 | 3 | 4|
// //         for(int i = length - 1; i > 0; i--){
// //             arr[i] = arr[i - 1];
// //         }
// //         // arr[4] = arr[3]
// //         // arr[3] = arr[2]
// //         // arr[2] = arr[1]
// //         // arr[1] = arr[0]
// //         arr[0] = store;
        
// //         // aur fhir last element ko 1st index p store krna 
// //         //  5 | 1 | 2 | 3 | 4 |
// //     }
// // // };

// // 8, 13).------------Kadane's Algorithm-------------
// // class Solution {
// //     int maxSubarraySum(int[] arr) {
// //         // kadane algorithm --> largest subarray sum --> 
// //         int sum = arr[0];
// //         int Max = arr[0];
// //         for(int i = 1; i < arr.length; i++){
// //             sum = Math.max(arr[i], sum + arr[i]);
// //             // if(sum < 0) sum = 0; 
// //             Max = Math.max(Max, sum);
// //         }
// //         return Max;
// //     }
// // }


// // 9).---------

// // ------------------------(String)------------------------
// // Reverse String 
// // class Solution {
// //     public void reverseString(char[] s) {
// //         int i = 0, j = s.length - 1;
// //         while(i < j){
// //             char c = s[i];
// //             s[i] = s[j];
// //             s[j] = c;
// //             i++;
// //             j--;
// //         }
// //     }
// // }

// // Palimdrome 
// // class Solution {
// //     boolean isPalindrome(String s) {
// //         int i = 0, j = s.length() - 1;
// //         while(i < j){
// //             if(s.charAt(i) != s.charAt(j)) return false;
// //             i++;
// //             j--;
            
// //         }
// //         return true;
// //     }
// // }


// /*
// Input: s = "geeksforgeeks"
// Output: ['e', 4], ['g', 2], ['k', 2], ['s', 2]
// Explanation: Characters e, g, k, and s appear more than once. Their counts are shown in order of first occurrence.
// */

// // import java.util.*;

// // class Main{
// //     static void printDuplicates(String s){
// //         char[] arr = s.toCharArray();
// //     Arrays.sort(arr); // eeeefggkkss
// //     for(int i = 0; i < arr.length; ){
// //         int count = 1;
// //         // i = 0 --> 0 + 1 -> 1 < 13 && e == e(duplicate find krna)
// //         while(i + count  < arr.length && arr[i] == arr[i + count]){
// //             count++;
// //         } 
// //         if(count > 1) {
// //             System.out.println(arr[i] + " " + count);
// //         }
// //         i += count;
// //     }
// //     }

// //     public static void main(String[] args) {
// //         String s = "geeksforgeeks";
// //         printDuplicates(s);
// //     }
// // }

// /*
// Dry run :-- 
// // print duplicates 
// geeksforgeeks --> g --> 2
// e --> 4
// k --> 2
// s --> 2


// // eeee f  ggkk ss
// // 0123 4 5678910

// i = 0 --> 
// count = 1;

// // jb tk equal h loop m hi run kro
// // 0 + 1 --> 1 < 13     &&  arr[0] = e  == arr[i + 1] == e -->count = 2;
// //  0 + 2 --> 2 < 13  &&  e == arr[0 + 2] --> e == arr[2] --> e == e --> count = 3;
// // 0 + 3 --> 3 < 13 && e ==  arr[0 + 3] --> e == e  count == 4(increment)


// now i = i + count = 0 + 3 = 3 

// i = 4 --> i + count < 11 -->  f --
// 4 + 1 --> 5 < 11 && 4 != 4 + 1 --> 4 !=5
// // iska mtlb equal nhi h to exit ho jao ab bahar aa jao 
// i = i 

// i = 5 --> g -->  
// 5 + 1 --> 6 < 11 && g == g
// arr[i] == arr[i + count] 

// // agar count 1 se bda h to 
// */

// // 18. --find all pairs on integer array whose sum is equal to given number
// import java.util.*;
// // User function Template for Java

// class Solution {
//     public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
//         // code here
//         // test case --> -1 0 1 2 -1 -4
//         // after sort bcz time complexity -- n log n
//         // -4 -1 -1 0 1 2 
//         // -4 + 2 = -2 < 0 i++ 
//         // -1 + 2 = 1 > 0 j--
//         // -1 + 1 = 0 return pair
        
//         // 2nd test case 
//         // run loop till i <= j
//         // --> 6, 1, 8, 0, 4, -9, -1, -10, -6, -5
//         // sort k baad --> -10 -9 -6 -5 -1 0 1  4 6 8 
//         // -10 + 8 = -2 < 0 i++
//         // -9 + 8 = -1 < 0 i++
//         // -6 + 8 = 2 > 0 j--
//         // -6 + 6 = 0 return this------------- and i++ j-- along with
//         // -5 + 4 = -1 < 0 i++
//         // -1 + 4 = 3 > 0 j--
//         // -1 + 1 = 0 return this and i++ j-- \
        
//         // final answer list 2D list
//         ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
//         // tese case 
//         //arr -->  - 8 -10 -10 -10 10 6 1 10
        
//         // sort an array
//         Arrays.sort(arr);
//         // -10 -10 -10 -8 1 6 10 10
        
//         int i = 0; 
//         int j = arr.length - 1; //7
        
//         while(i < j){
            
//         int sum = arr[i] + arr[j] ;// -10 + 10 = 0 
//             if(sum == 0) {
//                 // pair mil gya ab store krna h 
//                 ArrayList<Integer> pair = new ArrayList<>();
                
//                 pair.add(arr[i]); // [-10]
//                 pair.add(arr[j]); // [-10, 10]
                
//                 ans.add(pair); // [-10, 10]
                
//                 // now handling duplicate elements
//                 int left = arr[i];// -10
//                 int right = arr[j]; // 10
                
//                 while(i < j && arr[i] == left){
//                     i++;
//                 }
                
                
//                 while(i < j && arr[j] == right){
//                     j--;
//                 }
//             }
            
//             else if(sum < 0){
//                 i++;
//             }
//             else {
//                 j--;
//             }
//         }
//         return ans;
//     }
// }


// class Practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         // input size
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }

//         // function call
//         ArrayList<ArrayList<Integer>> result = Solution.getPairs(arr);

//         // printing original array
//         System.out.println("\nSorted Array: ");
//         System.out.println(Arrays.toString(arr));

//         if(result.size() == 0){
//             System.out.println("\nNo pair found");
//         }
//         else {
//             System.out.println("\nParis whose sum is 0: ");
            
//             for(ArrayList<Integer> pair: result){
//                 System.out.println(pair.get(0) + " " + pair(1));
//             }
//         }
//     }
// }

// ----19).find common elements In 3 sorted arrays----
// import java.util.*;

// class Solution {
//     public static ArrayList<Integer> commonElements(int[] a, int[] b, int[] c) {
//       ArrayList<Integer> ans = new ArrayList<>();
//        int len1= a.length;
//        int len2 = b.length;
//        int len3 = c.length;
//        int i = 0;
//        int j = 0;
//        int k = 0;
//        while(i < len1 && j < len2 && k < len3){
           
//             // Skip duplicates in a
//             if (i > 0 && a[i] == a[i - 1]) {
//                 i++;
//                 continue;
//             }

//             // Skip duplicates in b
//             if (j > 0 && b[j] == b[j - 1]) {
//                 j++;
//                 continue;
//             }

//             // Skip duplicates in c
//             if (k > 0 && c[k] == c[k - 1]) {
//                 k++;
//                 continue;
//             }
           
//            if(a[i] == b[j] && b[j] == c[k]){
//                // jb equal mil gya 
//                ans.add(a[i]);
//                i++;
//                j++;
//                k++;
//            }
//            else if(a[i] < b[j]){
//                i++;
//            }
//            else if(b[j] < c[k]){
//                j++;
//            }
//            else {
//                k++;
//            }
//        }
//        return ans;
//     }
// }

// public class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         int m = sc.nextInt();
        
//         int n = sc.nextInt();
//         int p = sc.nextInt();
//         int[] a = new int[m];
//         int[] b = new int[n];
//         int[] c = new int[p];


//         // Input array a
//         for(int i = 0; i < m; i++) {
//             a[i] = sc.nextInt();
//         }

//         // Input array b
//         for(int i = 0; i < n; i++) {
//             b[i] = sc.nextInt();
//         }

//         // Input array c
//         for(int i = 0; i < p; i++) {
//             c[i] = sc.nextInt();
//         }

//         ArrayList<Integer> result = Solution.commonElements(a, b, c);
//         // result arrayList iterate 
//         for(int num: result)
//             System.out.println(num+ " ");
//     }
// }














// ==========================================(Linked_list)=================================

/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/
import java.util.*;

/* Node class */
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

/* Solution class */
class Solution {

    public boolean detectLoop(Node head) {

        // take two temp nodes
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {

            // slow moves 1 step
            slow = slow.next;

            // fast moves 2 steps
            fast = fast.next.next;

            // if both meet -> loop exists
            if(slow == fast) {
                return true;
            }
        }

        // no loop found
        return false;
    }
}

/* Main class */
public class Main {
        public static void main(String[] args) {

        // Creating linked list
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        // Creating loop manually
        head.next.next.next.next = head.next;

        Solution obj = new Solution();

        boolean ans = obj.detectLoop(head);

        if(ans) {
            System.out.println("Loop Detected");
        }
        else {
            System.out.println("No Loop");
        }
    }
}
