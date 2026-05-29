
// // // // // ================================(Array)===========================
// // // // // Reverse the Array 
// // // // /*
// // // // Input: arr[] = [1, 4, 3, 2, 6, 5]  
// // // // Output:  [5, 6, 2, 3, 4, 1]
// // // // Explanation: The first element 1 moves to last position, the second element 4 moves to second-last and so on.

// // // // Input: arr[] = [4, 5, 1, 2]
// // // // Output: [2, 1, 5, 4]
// // // // Explanation: The first element 4 moves to last position, the second element 5 moves to second last and so on.
// // // // */

// // // // // import java.util.Arrays;

// // // // // class save{
// // // // //     public static void reverseArray(int[] arr){
// // // // //         // reverse krna h ab two pointer method k use krke krte h ab
// // // // //         int i = 0, j = arr.length -1 ;
// // // // //         while(i <= j){
// // // // //             int temp = arr[i];
// // // // //             arr[i] = arr[j];
// // // // //             arr[j] = temp;
// // // // //             i++; 
// // // // //             j--;
// // // // //         }
// // // // //     }
// // // // //     public static void main(String[] args){
// // // // //         int[] arr = { 1, 4, 3, 2, 6, 5};

// // // // //         reverseArray(arr);
// // // // //         for(int i = 0; i < arr.length; i++){
// // // // //             System.out.printf(arr[i] + " ");
// // // // //         }
// // // // //     }
// // // // // }

// // // // //Find the max and min element in an array
// // // // /*
// // // // Input: arr[] = [3, 5, 4, 1, 9]
// // // // Output: [1, 9]
// // // // Explanation: The minimum element is 1, and the maximum element is 9.

// // // // Input: arr[] = [22, 14, 8, 17, 35, 3]
// // // // Output: [3, 35] 
// // // // Explanation: The minimum element is 3, and the maximum element is 35.
// // // // // */

// // // // // import java.util.ArrayList;

// // // // // class GfG {
// // // // //     public static ArrayList<Integer> findMinMax(int[] arr) {
// // // // //         int mini = Integer.MAX_VALUE;
// // // // //         int maxi = Integer.MIN_VALUE;
        
// // // // //         // Find minimum and maximum
// // // // //         for (int num : arr) {
// // // // //             if (num < mini) mini = num;
// // // // //             if (num > maxi) maxi = num;
// // // // //         }
        
// // // // //         ArrayList<Integer> result = new ArrayList<>();
// // // // //         result.add(mini);
// // // // //         result.add(maxi);
// // // // //         return result;
    
// // // // // }

// // // // //     public static void main(String[] args) {
// // // // //         int[] arr = {3, 5, 4, 1, 9};
// // // // //         ArrayList<Integer> result = findMinMax(arr);
// // // // //         System.out.println(result.get(0) + " " + result.get(1));
// // // // //           }
// // // // // }


// // // // // import java.util.Arrays;
// // // // // import java.util.Scanner;

// // // // // class Solution {
// // // // //     public static int kthSmallest(int[] arr, int k) {
// // // // //         Arrays.sort(arr);
// // // // //         return arr[k - 1];
// // // // //     }

// // // // //     public static void main(String[] args){
// // // // //         Scanner sc = new Scanner(System.in);
// // // // //         int n = sc.nextInt();
// // // // //         int[] arr = new int[n];
// // // // //         for(int i = 0; i < arr.length; i++){
// // // // //             arr[i] = sc.nextInt();
// // // // //         }
// // // // //         int k = sc.nextInt();
// // // // //         int result = kthSmallest(arr, k);
// // // // //         System.out.println(result);
// // // // //     }
// // // // // }


// // // // // class Solution {
// // // // //     public void sort012(int[] arr) {
// // // // //         // algorithm --> count 0, 1, 2
// // // // //         int countz = 0, counto = 0, countt = 0;
// // // // //         // then insert in same array --> 0, 1, 2
// // // // //         for(int num : arr) {
// // // // //             if(num == 0) countz++;
// // // // //             else if(num == 1) counto++;
// // // // //             else countt++;
// // // // //         }
        
// // // // //         // now inserting element's till count size
// // // // //         for(int i = 0 ; i < countz; i++){
// // // // //             arr[i] = 0;
// // // // //         }
// // // // //         for(int i = countz; i < countz + counto; i++){
// // // // //             arr[i] = 1;
// // // // //         }
// // // // //         for(int i = countz + counto ; i < countz + counto + countt; i++){
// // // // //             arr[i] = 2;
// // // // //         }
// // // // //     }
// // // // // }


// // // // // 4 --> Move all negative number's to the left side of an array 
// // // // // Java program to Move all negative numbers
// // // // // to beginning and positive to end
// // // // /*
// // // // Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
// // // // Output: -12 -13 -5 -7 -3 -6 11 6 5
// // // // */
// // // // // By using two pointer approach 

// // // // // import java.util.Scanner;

// // // // // class save{
// // // // //     static int[] move(int[] arr){
// // // // //         int left = 0, right = arr.length - 1;
// // // // //         while(left < right){
// // // // //             // jb left m -ve ho tb left ko increase nhi krna bcz hume left m -ve lane h
// // // // //             if(arr[left] < 0) left++;

// // // // //             else if(arr[right] > 0) right--;

// // // // //             // baki bacha test case swap 
// // // // //             int temp = arr[left];
// // // // //             arr[left] = arr[right];
// // // // //             arr[right] = temp;
// // // // //         }
// // // // //         return arr;
// // // // //     }

// // // // //     public static void main(String[] args) {
// // // // //         int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
// // // // //         int[] ans = move(arr);

// // // // //         for (int num : ans) {
// // // // //             System.out.print(num + " ");
// // // // //         }
// // // // //         System.out.println();
// // // // //     }
// // // // // }

// // // // // User function Template for C++

// // // // // class Solution {
// // // // //   public:
// // // // //     void rotate(vector<int> &arr) {
// // // // //         int length = arr.size();
// // // // //         // shift by 1 krna h 
// // // // //         //sbse pehle agar array k last element store krna 
// // // // //         // store = 5
// // // // //         int store = arr[length - 1];
// // // // //         // aur fhir 1 shift krna array k elements ko
// // // // //         // .. | 1 | 2 | 3 | 4|
// // // // //         for(int i = length - 1; i > 0; i--){
// // // // //             arr[i] = arr[i - 1];
// // // // //         }
// // // // //         // arr[4] = arr[3]
// // // // //         // arr[3] = arr[2]
// // // // //         // arr[2] = arr[1]
// // // // //         // arr[1] = arr[0]
// // // // //         arr[0] = store;
        
// // // // //         // aur fhir last element ko 1st index p store krna 
// // // // //         //  5 | 1 | 2 | 3 | 4 |
// // // // //     }
// // // // // // };

// // // // // 8, 13).------------Kadane's Algorithm-------------
// // // // // class Solution {
// // // // //     int maxSubarraySum(int[] arr) {
// // // // //         // kadane algorithm --> largest subarray sum --> 
// // // // //         int sum = arr[0];
// // // // //         int Max = arr[0];
// // // // //         for(int i = 1; i < arr.length; i++){
// // // // //             sum = Math.max(arr[i], sum + arr[i]);
// // // // //             // if(sum < 0) sum = 0; 
// // // // //             Max = Math.max(Max, sum);
// // // // //         }
// // // // //         return Max;
// // // // //     }
// // // // // }


// // // // // 9).---------

// // // // // ------------------------(String)------------------------
// // // // // Reverse String 
// // // // // class Solution {
// // // // //     public void reverseString(char[] s) {
// // // // //         int i = 0, j = s.length - 1;
// // // // //         while(i < j){
// // // // //             char c = s[i];
// // // // //             s[i] = s[j];
// // // // //             s[j] = c;
// // // // //             i++;
// // // // //             j--;
// // // // //         }
// // // // //     }
// // // // // }

// // // // // Palimdrome 
// // // // // class Solution {
// // // // //     boolean isPalindrome(String s) {
// // // // //         int i = 0, j = s.length() - 1;
// // // // //         while(i < j){
// // // // //             if(s.charAt(i) != s.charAt(j)) return false;
// // // // //             i++;
// // // // //             j--;
            
// // // // //         }
// // // // //         return true;
// // // // //     }
// // // // // }


// // // // /*
// // // // Input: s = "geeksforgeeks"
// // // // Output: ['e', 4], ['g', 2], ['k', 2], ['s', 2]
// // // // Explanation: Characters e, g, k, and s appear more than once. Their counts are shown in order of first occurrence.
// // // // */

// // // // // import java.util.*;

// // // // // class Main{
// // // // //     static void printDuplicates(String s){
// // // // //         char[] arr = s.toCharArray();
// // // // //     Arrays.sort(arr); // eeeefggkkss
// // // // //     for(int i = 0; i < arr.length; ){
// // // // //         int count = 1;
// // // // //         // i = 0 --> 0 + 1 -> 1 < 13 && e == e(duplicate find krna)
// // // // //         while(i + count  < arr.length && arr[i] == arr[i + count]){
// // // // //             count++;
// // // // //         } 
// // // // //         if(count > 1) {
// // // // //             System.out.println(arr[i] + " " + count);
// // // // //         }
// // // // //         i += count;
// // // // //     }
// // // // //     }

// // // // //     public static void main(String[] args) {
// // // // //         String s = "geeksforgeeks";
// // // // //         printDuplicates(s);
// // // // //     }
// // // // // }

// // // // /*
// // // // Dry run :-- 
// // // // // print duplicates 
// // // // geeksforgeeks --> g --> 2
// // // // e --> 4
// // // // k --> 2
// // // // s --> 2


// // // // // eeee f  ggkk ss
// // // // // 0123 4 5678910

// // // // i = 0 --> 
// // // // count = 1;

// // // // // jb tk equal h loop m hi run kro
// // // // // 0 + 1 --> 1 < 13     &&  arr[0] = e  == arr[i + 1] == e -->count = 2;
// // // // //  0 + 2 --> 2 < 13  &&  e == arr[0 + 2] --> e == arr[2] --> e == e --> count = 3;
// // // // // 0 + 3 --> 3 < 13 && e ==  arr[0 + 3] --> e == e  count == 4(increment)


// // // // now i = i + count = 0 + 3 = 3 

// // // // i = 4 --> i + count < 11 -->  f --
// // // // 4 + 1 --> 5 < 11 && 4 != 4 + 1 --> 4 !=5
// // // // // iska mtlb equal nhi h to exit ho jao ab bahar aa jao 
// // // // i = i 

// // // // i = 5 --> g -->  
// // // // 5 + 1 --> 6 < 11 && g == g
// // // // arr[i] == arr[i + count] 

// // // // // agar count 1 se bda h to 
// // // // */

// // // // // 18. --find all pairs on integer array whose sum is equal to given number
// // // // import java.util.*;
// // // // // User function Template for Java

// // // // class Solution {
// // // //     public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
// // // //         // code here
// // // //         // test case --> -1 0 1 2 -1 -4
// // // //         // after sort bcz time complexity -- n log n
// // // //         // -4 -1 -1 0 1 2 
// // // //         // -4 + 2 = -2 < 0 i++ 
// // // //         // -1 + 2 = 1 > 0 j--
// // // //         // -1 + 1 = 0 return pair
        
// // // //         // 2nd test case 
// // // //         // run loop till i <= j
// // // //         // --> 6, 1, 8, 0, 4, -9, -1, -10, -6, -5
// // // //         // sort k baad --> -10 -9 -6 -5 -1 0 1  4 6 8 
// // // //         // -10 + 8 = -2 < 0 i++
// // // //         // -9 + 8 = -1 < 0 i++
// // // //         // -6 + 8 = 2 > 0 j--
// // // //         // -6 + 6 = 0 return this------------- and i++ j-- along with
// // // //         // -5 + 4 = -1 < 0 i++
// // // //         // -1 + 4 = 3 > 0 j--
// // // //         // -1 + 1 = 0 return this and i++ j-- \
        
// // // //         // final answer list 2D list
// // // //         ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
// // // //         // tese case 
// // // //         //arr -->  - 8 -10 -10 -10 10 6 1 10
        
// // // //         // sort an array
// // // //         Arrays.sort(arr);
// // // //         // -10 -10 -10 -8 1 6 10 10
        
// // // //         int i = 0; 
// // // //         int j = arr.length - 1; //7
        
// // // //         while(i < j){
            
// // // //         int sum = arr[i] + arr[j] ;// -10 + 10 = 0 
// // // //             if(sum == 0) {
// // // //                 // pair mil gya ab store krna h 
// // // //                 ArrayList<Integer> pair = new ArrayList<>();
                
// // // //                 pair.add(arr[i]); // [-10]
// // // //                 pair.add(arr[j]); // [-10, 10]
                
// // // //                 ans.add(pair); // [-10, 10]
                
// // // //                 // now handling duplicate elements
// // // //                 int left = arr[i];// -10
// // // //                 int right = arr[j]; // 10
                
// // // //                 while(i < j && arr[i] == left){
// // // //                     i++;
// // // //                 }
                
                
// // // //                 while(i < j && arr[j] == right){
// // // //                     j--;
// // // //                 }
// // // //             }
            
// // // //             else if(sum < 0){
// // // //                 i++;
// // // //             }
// // // //             else {
// // // //                 j--;
// // // //             }
// // // //         }
// // // //         return ans;
// // // //     }
// // // // }


// // // // class Practice{
// // // //     public static void main(String[] args){
// // // //         Scanner sc = new Scanner(System.in);

// // // //         // input size
// // // //         int n = sc.nextInt();

// // // //         int[] arr = new int[n];

// // // //         for(int i = 0; i < n; i++){
// // // //             arr[i] = sc.nextInt();
// // // //         }

// // // //         // function call
// // // //         ArrayList<ArrayList<Integer>> result = Solution.getPairs(arr);

// // // //         // printing original array
// // // //         System.out.println("\nSorted Array: ");
// // // //         System.out.println(Arrays.toString(arr));

// // // //         if(result.size() == 0){
// // // //             System.out.println("\nNo pair found");
// // // //         }
// // // //         else {
// // // //             System.out.println("\nParis whose sum is 0: ");
            
// // // //             for(ArrayList<Integer> pair: result){
// // // //                 System.out.println(pair.get(0) + " " + pair(1));
// // // //             }
// // // //         }
// // // //     }
// // // // }

// // // // ----19).find common elements In 3 sorted arrays----
// // // // import java.util.*;

// // // // class Solution {
// // // //     public static ArrayList<Integer> commonElements(int[] a, int[] b, int[] c) {
// // // //       ArrayList<Integer> ans = new ArrayList<>();
// // // //        int len1= a.length;
// // // //        int len2 = b.length;
// // // //        int len3 = c.length;
// // // //        int i = 0;
// // // //        int j = 0;
// // // //        int k = 0;
// // // //        while(i < len1 && j < len2 && k < len3){
           
// // // //             // Skip duplicates in a
// // // //             if (i > 0 && a[i] == a[i - 1]) {
// // // //                 i++;
// // // //                 continue;
// // // //             }

// // // //             // Skip duplicates in b
// // // //             if (j > 0 && b[j] == b[j - 1]) {
// // // //                 j++;
// // // //                 continue;
// // // //             }

// // // //             // Skip duplicates in c
// // // //             if (k > 0 && c[k] == c[k - 1]) {
// // // //                 k++;
// // // //                 continue;
// // // //             }
           
// // // //            if(a[i] == b[j] && b[j] == c[k]){
// // // //                // jb equal mil gya 
// // // //                ans.add(a[i]);
// // // //                i++;
// // // //                j++;
// // // //                k++;
// // // //            }
// // // //            else if(a[i] < b[j]){
// // // //                i++;
// // // //            }
// // // //            else if(b[j] < c[k]){
// // // //                j++;
// // // //            }
// // // //            else {
// // // //                k++;
// // // //            }
// // // //        }
// // // //        return ans;
// // // //     }
// // // // }

// // // // public class Main{
// // // //     public static void main(String[] args){
// // // //         Scanner sc = new Scanner(System.in);

// // // //         int m = sc.nextInt();
        
// // // //         int n = sc.nextInt();
// // // //         int p = sc.nextInt();
// // // //         int[] a = new int[m];
// // // //         int[] b = new int[n];
// // // //         int[] c = new int[p];


// // // //         // Input array a
// // // //         for(int i = 0; i < m; i++) {
// // // //             a[i] = sc.nextInt();
// // // //         }

// // // //         // Input array b
// // // //         for(int i = 0; i < n; i++) {
// // // //             b[i] = sc.nextInt();
// // // //         }

// // // //         // Input array c
// // // //         for(int i = 0; i < p; i++) {
// // // //             c[i] = sc.nextInt();
// // // //         }

// // // //         ArrayList<Integer> result = Solution.commonElements(a, b, c);
// // // //         // result arrayList iterate 
// // // //         for(int num: result)
// // // //             System.out.println(num+ " ");
// // // //     }
// // // // }


// // // // 20.Rearrange the array in alternating positive and negative items with O(1) extra space
// // /*
// // Input: arr[] = [9, 4, -2, -1, 5, 0, -5, -3, 2]
// // Output: [9, -2, 4, -1, 5, -5, 0, -3, 2]
// // */
// // // import java.util.*;

// // // class Solution {

// // //     void rearrange(ArrayList<Integer> arr) {

// // //         // Time Complexity: O(n)
// // //         // Space Complexity: O(n)

// // //         // Positive aur negative elements ko alag store karenge
// // //         ArrayList<Integer> pos = new ArrayList<>();
// // //         ArrayList<Integer> neg = new ArrayList<>();

// // //         // Array traverse karke elements separate karna
// // //         for (int i : arr) {

// // //             // Agar positive ya zero hai
// // //             if (i >= 0) {
// // //                 pos.add(i);
// // //             }

// // //             // Agar negative hai
// // //             else {
// // //                 neg.add(i);
// // //             }
// // //         }

// // //         // Index pointers
// // //         int i = 0;
// // //         int p = 0;
// // //         int n = 0;

// // //         // Alternate arrangement
// // //         while (p < pos.size() && n < neg.size()) {

// // //             // Positive element add
// // //             arr.set(i++, pos.get(p++));

// // //             // Negative element add
// // //             arr.set(i++, neg.get(n++));
// // //         }

// // //         // Agar positive elements bach gaye
// // //         while (p < pos.size()) {
// // //             arr.set(i++, pos.get(p++));
// // //         }

// // //         // Agar negative elements bach gaye
// // //         while (n < neg.size()) {
// // //             arr.set(i++, neg.get(n++));
// // //         }
// // //     }

// // //     // Main function
// // //     public static void main(String[] args) {

// // //         Solution obj = new Solution();

// // //         ArrayList<Integer> arr = new ArrayList<>(
// // //             Arrays.asList(9, 4, -2, -1, 5, 0, -5, -3, 2)
// // //         );

// // //         // Function call
// // //         obj.rearrange(arr);

// // //         // Output print
// // //         System.out.println(arr);
// // //     }
// // // }


// // // 21. Check if there is a subarray with 0 sum
// // import java.util.*;

// // class Solution {
// //     // Function to check whether there is a subarray present with 0-sum or not.
// //     static boolean findsum(int arr[]) {
// //         // Your code here
// //         HashSet<Integer> arr2 = new HashSet<>();
        
// //     // We use prefix sum + HashSet:
// //     // if a prefix sum repeats, the subarray between them has sum 0.
// // //     We traverse the array only once and HashSet lookup/insertion takes average O(1) time.
// // // Time Complexity = O(n)
// // // Space Complexity = O(n)
// //         int sum = 0;

// //         for (int i : arr) {
// //             sum += i;
// //             if (i == 0|| sum == 0|| arr2.contains(sum)) {
// //                 return true;
// //             }
// //             arr2.add(sum);
// //         }
// //         return false;
// //     }
// // }

// // class Main{
// //     public static void main(String[] args){
// //         int arr[] = {4, 2, -3, 1, 6};
// //         boolean ans = Solution.findsum(arr);
// //         System.out.println(ans);
// //     }
// // }


// //Find factorial of a large number
// class Solution {

//     public static ArrayList<Integer> factorial(int n) {

//         // ArrayList factorial ke digits store karega
//         ArrayList<Integer> ans = new ArrayList<>();

//         // Initially factorial = 1
//         ans.add(1);

//         // 2 se n tak multiply karenge
//         for (int x = 2; x <= n; x++) {

//             int carry = 0;

//             // Har digit ko multiply karna
//             for (int i = 0; i < ans.size(); i++) {

//                 int val = ans.get(i) * x + carry;

//                 // Last digit store
//                 ans.set(i, val % 10);

//                 // Remaining carry
//                 carry = val / 10;
//             }

//             // Agar carry bach gaya
//             while (carry > 0) {

//                 ans.add(carry % 10);

//                 carry /= 10;
//             }
//         }

//         // Digits reverse order me stored hain
//         Collections.reverse(ans);

//         return ans;
//     }
// }

// public class Main {

//     public static void main(String[] args) {

//         int n = 5;

//         ArrayList<Integer> ans = Solution.factorial(n);

//         // Output print
//         for (int digit : ans) {
//             System.out.print(digit);
//         }
//     }
// }


// // 23. maximum product subarray 

// class Solution {
//     int maxProduct(int[] arr) {
        
//         // max product --> algorithm minPro * -ve = maxProd 
//         // we need to track min product also bcz if current element 
//         //of an array is -ve so we mutlitplying with min product we get the max product final ans
        
        
//         /*
//         We maintain minProduct as well because multiplying a 
//         negative number with the minimum product can produce the 
//         maximum product.
//         */
//         int maxProd = arr[0] ;// -2
//         int minProd = arr[0]; // -2
//         int ans = arr[0]; // -2
        
//         for(int i = 1; i < arr.length; i++){
//             // if arr[i] current element is -ve so we swap 
//             // 1 --> 6
//             // 2--> -3 --> swap maxProd = -12
//             if(arr[i] < 0){
//                 int temp = maxProd;
//                 maxProd = minProd;
//                 minProd = temp;
//             }
            
//             maxProd = Math.max(arr[i], maxProd * arr[i]); 
//             // 6, -12 --> 6
//             minProd = Math.min(arr[i], minProd * arr[i]); 
//             // 6, -12 --> -12
            
//             ans = Math.max(ans, maxProd);
//             // 6
//         }
        
//         return ans;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//         // one more test case dry run
//         // test_case - 2
//         /*
//         -1, -3, -10, 0, 6
//         0     1   2   3  4
//         min = -1, max = -1, ans = -1
//         i --> 1 --> arr[i] --> -3
//         max = -3, -3 * -1 --> -3, 3 --> 3
//         min = -3, -3 * -1 --> -3, 3 --> -3
        
//         ans = -1, 3 -->  3
        
        
//         i = 2 --> arr[i] = -10
        
//         swap --> max = -3; min = 3
        
//         max = -10, -10 * -3 --> -10, 30 --> 30
//         min = -10, -10 * 3 --> -10, -30 --> -30
        
//         ans = 3, 30 --> 30
//         */
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//         // int maxProd = arr[0]; // -2
//         // int minProd = arr[0]; // -2
//         // int ans = arr[0]; // -2
        
//         // for (int i = 1; i < arr.length; i++) {
//         //     // i = 1 --> 6
//         //     // i = 2 --> -3
//         //     // i = 3 --> -10
//         //     // i = 4 --> 0
//         //     // i = 5 --> 2
//         //     // If current element is negative, swap --> minProd * -ve = maxans ; maxprod * -ve = minans
//         //     // temp = 6; maxProd = -12; minProd = 6
//         //     // temp = 36; maxProd = -18; minProd = 36
//         //     if (arr[i] < 0) {
//         //         int temp = maxProd;
//         //         maxProd = minProd;
//         //         minProd = temp;
//         //     }
//         //     // 

//         //     // Update max and min products
//         //     maxProd = Math.max(arr[i], maxProd * arr[i]);
//         //     // maxProd = (6, -2 * 6) = (6, -12) = 6
//         //     // maxProd = (-3, -12 * -3) = (-3, 36) = 36
//         //     // maxProd = (-10, -18 * -10) = 180
//         //     // maxProd = (0, 180 * 0) = (0, 0) = 0 
//         //     // maxProd = (2, 2 * 0) = 2
//         //     minProd = Math.min(arr[i], minProd * arr[i]);
//         //     // minProd = (6, -2 * 6) = (6, -12) = -12
//         //     // minProd = (-3, 6 * -3) = (-3, -18) = -18
//         //     // minProd = (-10, 36 * -10) = (-10,-360) = -360
//         //     // minProd = 0, 0 * ..) --> 0
//         //     // minProd = 2, 0--> 0
//         //     // Update answer
//         //     ans = Math.max(ans, maxProd);
//         //     // ans = 6
//         //     // ans = 6, 36 --> 36
//         //     // ans = 36, 180 --> 180
//         //     // ans = 0, 180 --> 180
//         //     // 180, 2 --> 180
//         // }

//         // return ans; // 180
//     }
// }


// public class Main {
//     public static void main(String[] args) {

//         Solution obj = new Solution();

//         int arr[] = {-2, 6, -3, -10, 0, 2};

//         int ans = obj.maxProduct(arr);

//         System.out.println("Maximum Product Subarray = " + ans);
//     }
// }


// =========================(Matrix)========================
// import java.util.*;
// 45 ). Search in a 2D Matrix
// class Solution {

//     public boolean searchMatrix(int[][] matrix, int target) {

//         /*
//         We treat the 2D matrix as a sorted 1D array
//         and apply Binary Search.
//         */

//         int m = matrix.length;       // rows
//         int n = matrix[0].length;   // columns

//         int start = 0;
//         int end = m * n - 1;

//         while (start <= end) {

//             int mid = start + (end - start) / 2;

//             // Convert 1D index into 2D index
//             int row = mid / n;
//             int col = mid % n;

//             // Element mil gaya
//             if (matrix[row][col] == target) {
//                 return true;
//             }

//             // Right side search
//             else if (matrix[row][col] < target) {
//                 start = mid + 1;
//             }

//             // Left side search
//             else {
//                 end = mid - 1;
//             }
//         }

//         return false;
//     }
// }

// public class Main {

//     public static void main(String[] args) {

//         Solution obj = new Solution();

//         int matrix[][] = {
//             {1, 3, 5, 7},
//             {10, 11, 16, 20},
//             {23, 30, 34, 60}
//         };

//         int target = 3;
//         boolean ans = obj.searchMatrix(matrix, target);
//         System.out.println("Target Found = " + ans);
//     }
// }


/*
// 51. Rotate Matrix by 90 degree anti-clockwise
class Solution {

    public void rotateMatrix(int[][] mat) {

       

        int row = mat.length;
        int col = mat[0].length;

        int[][] str = new int[row][col];

        // Reverse each row
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {

                str[i][j] = mat[i][col - j - 1];
            }
        }

        // Transpose
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {

                mat[i][j] = str[j][i];
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[][] mat = {
            {0, 1, 2},
            {3, 4, 5},
            {6, 7, 8}
        };

        obj.rotateMatrix(mat);

        // Output print
        System.out.println("Rotated Matrix:");

        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat[0].length; j++) {

                System.out.print(mat[i][j] + " ");
            }

            System.out.println();
        }
    }
}
*/
// ==================(String's) =================

/*
// 56).Reverse a String 
import java.util.*;

class Solution {

    public void reverseString(char[] s) {

        int i = 0;
        int j = s.length - 1;

        // Two pointer approach
        while (i < j) {

            // Swap characters
            char c = s[i];
            s[i] = s[j];
            s[j] = c;

            i++;
            j--;
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Solution obj = new Solution();

        char[] s = {'h', 'e', 'l', 'l', 'o'};

        obj.reverseString(s);

        // Output print
        System.out.print("Reversed String = ");

        for (char ch : s) {
            System.out.print(ch);
        }
    }
}
*/



// // // // =====================(Linked_list)======================

// // // /*
// // // class Node {
// // //     int data;
// // //     Node next;

// // //     Node(int x) {
// // //         data = x;
// // //         next = null;
// // //     }
// // // }
// // // */
// // // import java.util.*;

// // // /* Node class */
// // // class Node {
// // //     int data;
// // //     Node next;

// // //     Node(int x) {
// // //         data = x;
// // //         next = null;
// // //     }
// // // }

// // // /* Solution class */
// // // class Solution {

// // //     public boolean detectLoop(Node head) {

// // //         // take two temp nodes
// // //         Node slow = head;
// // //         Node fast = head;

// // //         while(fast != null && fast.next != null) {
// // //             slow = slow.next;
// // //             fast = fast.next.next;
// // //             // if both meet -> loop exists
// // //             if(slow == fast) {
// // //                 return true;
// // //             }
// // //         }
// // //         return false;
// // //     }
// // // }

// // // /* Main class */
// // // public class Main {
// // //         public static void main(String[] args) {

// // //         // Creating linked list
// // //         Node head = new Node(1);
// // //         head.next = new Node(2);
// // //         head.next.next = new Node(3);
// // //         head.next.next.next = new Node(4);

// // //         // Creating loop manually
// // //         head.next.next.next.next = head.next;

// // //         Solution obj = new Solution();

// // //         boolean ans = obj.detectLoop(head);

// // //         if(ans) {
// // //             System.out.println("Loop Detected");
// // //         }
// // //         else {
// // //             System.out.println("No Loop");
// // //         }
// // //     }
// // // }
