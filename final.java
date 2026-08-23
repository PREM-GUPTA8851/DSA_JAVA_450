//  ================================(Array)===========================
// 1.Reverse the Array 
/*
Input: arr[] = [1, 4, 3, 2, 6, 5]  
Output:  [5, 6, 2, 3, 4, 1]
Explanation: The first element 1 moves to last position, the second element 4 moves to second-last and so on.

Input: arr[] = [4, 5, 1, 2]
Output: [2, 1, 5, 4]
Explanation: The first element 4 moves to last position, the second element 5 moves to second last and so on.
*/

import java.util.Arrays;

class save{
    public static void reverseArray(int[] arr){
        // reverse krna h ab two pointer method k use krke krte h ab
        int i = 0, j = arr.length -1 ;
        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; 
            j--;
        }
    }
    public static void main(String[] args){
        int[] arr = { 1, 4, 3, 2, 6, 5};

        reverseArray(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.printf(arr[i] + " ");
        }
    }
}

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

class GfG {
    public static ArrayList<Integer> findMinMax(int[] arr) {
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        
        // Find minimum and maximum
        for (int num : arr) {
            if (num < mini) mini = num;
            if (num > maxi) maxi = num;
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        result.add(mini);
        result.add(maxi);
        return result;
    
}

    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 1, 9};
        ArrayList<Integer> result = findMinMax(arr);
        System.out.println(result.get(0) + " " + result.get(1));
          }
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
  public:
    void sort012(vector<int>& arr) {

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        // count frequency of 0,1,2
        for(int num : arr){

            if(num == 0)
                count0++;

            else if(num == 1)
                count1++;

            else
                count2++;
        }

        int index = 0;

        // fill 0s
        while(count0--){
            arr[index++] = 0;
        }

        // fill 1s
        while(count1--){
            arr[index++] = 1;
        }

        // fill 2s
        while(count2--){
            arr[index++] = 2;
        }
        
        int low = 0;
        int mid = 0;
        int high = arr.size() - 1;  // 5

        // Example:
        // [ 0, 1, 2, 0, 1, 2]

        while(mid <= high){
        // 0 < 5
        // 1 <= 5
        // 2 <= 5 --> 0,1,2,0,1,2
        // 2 <= 4 --> 0,1,1,0,2,2
        // 2 <= 3 --> 0,1,1,0,2,2
        // 3 <=3 --> 0,0,1,1,2,2
                
            if(arr[mid] == 0){
            // arr[0] == 0 
                swap(arr[low], arr[mid]);
            // swap(arr[0], arr[0]);
                low++;
                mid++;
                // low = 1
                // mid = 1
                // 0,1,2,0,1,2
            }
            // arr[1] == 1
            else if(arr[mid] == 1){

                // 1 already correct position zone me hai
                
                mid++;
                // mid = 2
            }
            
            else{
            
                swap(arr[mid], arr[high]);
            // swap(2,2)
                high--;
            // high = 4
            // 0,1,2,0,1,2
                // mid ko increment nahi karenge

                // kyuki high se jo element aaya hai
                // usko abhi check hi nahi kiya
            }
        }
        
    }
};

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

// 7. Rotate Array by 1
class Solution {
  public:
    void rotate(vector<int> &arr) {
        int length = arr.size();
        // shift by 1 krna h 
        //sbse pehle agar array k last element store krna 
        // store = 5
        int store = arr[length - 1];
        // aur fhir 1 shift krna array k elements ko
        // .. | 1 | 2 | 3 | 4|
        for(int i = length - 1; i > 0; i--){
            arr[i] = arr[i - 1];
        }
        // arr[4] = arr[3]
        // arr[3] = arr[2]
        // arr[2] = arr[1]
        // arr[1] = arr[0]
        arr[0] = store;
        
        // aur fhir last element ko 1st index p store krna 
        //  5 | 1 | 2 | 3 | 4 |
    }
};
// 8. wap Maximum Subarray
class Solution {
    public int maxSubArray(int[] nums) {
        // jb subarray k sum -ve jaane lge to usko fhr se 0 set krke sum krna start kr dena 
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        for(int x: nums){
            sum += x;
            ans = Math.max(sum, ans);
            if(sum < 0) sum = 0;
        }
        return ans;
    }
}

// 11. FInd the duplicate Number
class Solution {
    public int findDuplicate(int[] nums) {
        /*
        method - 1--> 
         */
        // logic by sort--> then indexmapping where mapping breaks return index - 1
        // Arrays.sort(nums);
        // // 7, 9, 7, 4, 2,8, 7, 7, 1 5
        // // 1, 2, 4, 5, 7,7,7,7, 8, 9
        // int ans = -1;
        // for(int index = 0; index < nums.length - 1; index++){
        //     if(nums[index] == nums[index + 1]){
        //          ans = nums[index];
        //         break;
        //     } 
        // }
        // return ans;


        /*
        method - 2 --> mark as -ve one 
         */
        // time complexity --> o(n)
        // array k us element m jao aur mark as -ve mark kro
        int ans = 0;
        // 1,3,4,2,2
        for(int i = 0; i < nums.length; i++){
            if(nums[Math.abs(nums[i])] < 0){
             ans = Math.abs(nums[i]);
            break;
            }
            nums[Math.abs(nums[i])] *= -1;
        // nums[nums[0]] -->nums[1] --> 3 --> 1, -3,4,2,2
        // nums[nums[1]] --> nums[3] --> 2 --> 1, -3, 4, -2, 2
        // nums[nums[2]] --> nums[4] --> 2 --> 1,-3, 4, -2, -2
        // nums[nums[3]] --> nums[2] --> 1, -3, -4, -2, -2
        // nums[nums[4]] --> nums[2] --> 
        }
        return ans;

		// method -3 
        // by using floyd's cycle detection algorithm
        
        // firstly we check duplicate exist or not
        int slow = nums[0];
        int fast = nums[0];
        // pehle aapn check krte h duplicate exist krta h y nhi
         do {
            slow = nums[slow];  // ek ko 1 step 
            fast = nums[nums[fast]]; // doosre ko 2 step
        } while (slow != fast);
        // to ek ko starting point p krte h 
        // doosre ko meeting point p 
        slow = nums[0];
         while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
}
}
// 12. Merge without extra spaces 
// two arrays sorted given h aapan first array k last element se compare kre 
// doosri array k first element se then swap kr de 
// at last dono ko sort kr de
int m = a.length;
int n = b.length;

int i = m - 1;
int j = 0;
int flag = 0;
while(i >= 0 && j < n){
        if(a[i] > b[j]){
                // swap
                int temp = a[i];
                a[i] = b[j];
                b[j] = temp;

                // swap done
                i--;
                j++;
                flag = 1;
        }
        else {
                break;
        }
}

if(flag == 1){
        Arrays.sort(a):
        Arrays.sort(b);
}

// 13. Kadane's algorithms
class Solution {
    public int maxSubArray(int[] nums) {
        // jb subarray k sum -ve jaane lge to usko fhr se 0 set krke sum krna start kr dena 
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        for(int x: nums){
            sum += x;
            ans = Math.max(sum, ans);
            if(sum < 0) sum = 0;
        }
        return ans;
    }
}

// 14. Merge intervals
class Solution {
    public int[][] merge(int[][] intervals) {
        // sbse pehle sort 2D array ko 
        // ascending order me sorting
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        // [[1,3],[2,6],[8,10],[15,18]]
        // list for storing elements
        List<int[]> ans = new ArrayList<>();

        // two pointer start and end
        int start = intervals[0][0]; // 1
        int end = intervals[0][1]; // 4

        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] <= end){
                // 2 < 3 
                end = Math.max(end, intervals[i][1]);
                // end --> max(3, 6) --> 6
            }
                // 2nd iteration me 
                // 8 < 6 --> nhi h  
            // to wo else part m jaega 
            else {
                ans.add(new int[]{start, end});
                // ans = { [1, 6], [8, 10]};
                start = intervals[i][0]; // 15
                end = intervals[i][1]; // 18
            }
        }
        ans.add(new int[]{start, end});
        // ans = { [1, 6], [8, 10], [15, 18]};

        return ans.toArray(new int[ans.size()][]);
        
    }
}

// 15.Next permutations
class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;

        int pivot = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        if (pivot != -1) {
            for (int i = n - 1; i > pivot; i--) {
                if (nums[i] > nums[pivot]) {
                    int temp = nums[i];
                    nums[i] = nums[pivot];
                    nums[pivot] = temp;
                    break;
                }
            }
        }

        int left = pivot + 1;
        int right = n - 1;

        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}

// dry runs
// test case 
/*
1,2,3,6,5,4

1,2,4,6,5,3
1,2, 4, 3, 5, 6


n = 6
first loop 
i = n - 2 = 6- 2 = 4 
5 < 4 -->x
6 < 5 -->x
3 < 6 --> haa h
pivot = 2

// swap with pivot
1,2,3,6,5,4
pivot = 2
last se start kiya agar num pivot se bda mila 
to uske sath swap kr dena
1,2,4,6,5,3

// reverse after pivot + 1 , right 
left = 3
right = 5
//after reverse till left < right

1, 2, 4, 3, 5, 6

 */

// 17. Best time to buy and sell stock
class Solution {
    public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE; 
        int maxProfit = 0;

        for (int price : prices) {
            // price --> 7, 1, 5, 3, 6
            minPrice = Math.min(minPrice, price);
            // minPrice = min(max, 7) --> 7
            // minPrice = min(7, 1) --> 1
            // minPrice = min(1, 5) -- > 1
            // minPrice = min(1,2) --> 1
            // minPrice = min(1,6) --> 1
            maxProfit = Math.max(maxProfit, price - minPrice);
            //maxprofit = max(0, 7 - 7)--> 0
            // maxProfit = max(0, 1-1) --> 0
            // maxprofit = max(0, 5-1)--> 4
            // maxprofit = max(4, 3-1)--> 4
            // maxProfit = max(4, 6-1) --> 5
        }
        return maxProfit;
        // 5
    }
}

// 18.Two sum -Pairs with 0 Sum
// User function Template for Java

class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        // code here
        // test case --> -1 0 1 2 -1 -4
        // after sort bcz time complexity -- n log n
        // -4 -1 -1 0 1 2 
        // -4 + 2 = -2 < 0 i++ 
        // -1 + 2 = 1 > 0 j--
        // -1 + 1 = 0 return pair
        
        // 2nd test case 
        // run loop till i <= j
        // --> 6, 1, 8, 0, 4, -9, -1, -10, -6, -5
        // sort k baad --> -10 -9 -6 -5 -1 0 1  4 6 8 
        // -10 + 8 = -2 < 0 i++
        // -9 + 8 = -1 < 0 i++
        // -6 + 8 = 2 > 0 j--
        // -6 + 6 = 0 return this------------- and i++ j-- along with
        // -5 + 4 = -1 < 0 i++
        // -1 + 4 = 3 > 0 j--
        // -1 + 1 = 0 return this and i++ j-- \
        
        // final answer list 2D list
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        // tese case 
        //arr -->  - 8 -10 -10 -10 10 6 1 10
        
        // sort an array
        Arrays.sort(arr);
        // -10 -10 -10 -8 1 6 10 10
        
        int i = 0; 
        int j = arr.length - 1; //7
        
        while(i < j){
            
        int sum = arr[i] + arr[j] ;// -10 + 10 = 0 
            if(sum == 0) {
                // pair mil gya ab store krna h 
                ArrayList<Integer> pair = new ArrayList<>();
                
                pair.add(arr[i]); // [-10]
                pair.add(arr[j]); // [-10, 10]
                
                ans.add(pair); // [-10, 10]
                
                // now handling duplicate elements
                int left = arr[i];// -10
                int right = arr[j]; // 10
                
                while(i < j && arr[i] == left){
                    i++;
                }
                
                
                while(i < j && arr[j] == right){
                    j--;
                }
            }
            
            else if(sum < 0){
                i++;
            }
            else {
                j--;
            }
        }
        return ans;
    }
}

// 19. Common in 3 sorted arrays
class Solution {
    public ArrayList<Integer> commonElements(int[] a, int[] b, int[] c) {
      ArrayList<Integer> ans = new ArrayList<>();
       int len1= a.length;
       int len2 = b.length;
       int len3 = c.length;
       int i = 0;
       int j = 0;
       int k = 0;
       while(i < len1 && j < len2 && k < len3){
           
            // Skip duplicates in a
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }

            // Skip duplicates in b
            if (j > 0 && b[j] == b[j - 1]) {
                j++;
                continue;
            }

            // Skip duplicates in c
            if (k > 0 && c[k] == c[k - 1]) {
                k++;
                continue;
            }
           
           if(a[i] == b[j] && b[j] == c[k]){
               // jb equal mil gya 
               ans.add(a[i]);
               i++;
               j++;
               k++;
           }
           else if(a[i] < b[j]){
               i++;
           }
           else if(b[j] < c[k]){
               j++;
           }
           else {
               k++;
           }
       }
       return ans;
    }
}
// 20. Alternate +ve and -ve 
class Solution {
    void rearrange(ArrayList<Integer> arr) {
        
        // We traverse the array once to separate positive and negative elements and once more to rearrange them alternately.
// Therefore time complexity is O(n) and extra space used is O(n).
        
        //[9, 4, -2, -1, 5, 0, -5, -3, 2]
        // --> 2 arraylist create krenge pos aur -ve 
        ArrayList<Integer> pos = new ArrayList<Integer>();
        ArrayList<Integer> neg = new ArrayList<Integer>();
        // pos me +ve elements add krte rhenge 
        for(int i : arr){
            // agar +ve hua to pos me add krna elements
            if(i >= 0) pos.add(i); // 9 4 5 0 2
            else neg.add(i); // -2 -1  -5 -3
        }
        // aur -ve me -ve elements add krte rhenge 
        int i = 0;
        int p = 0;
        int n = 0;
        
        while(p < pos.size() && n < neg.size()){
            //then same array p update krna h element's ko loop chleaeng till 
        // pos.size() && -ve.size() aur tb tk hr iteration p, n add krte rhenge
        // pehle +ve element add krenge then uske baad -ve element
        arr.set(i++, pos.get(p++)); // 0--> 9 , 2--> 4, 4-->5, 6--> 0 ,2?
        arr.set(i++, neg.get(n++)); // 1--> -2, 3-->-1, 5-->-5,7-->-3
        
        
        }
        // agar positive bach jaenge 
        while(p < pos.size()){
            arr.set(i++, pos.get(p++));
        }
        // agar -ve bach jaenge
        while(n < neg.size()){
            arr.set(i++, neg.get(n++));
        }
    }
}

// 21. Subaaray with sum 0
class Solution {

    static boolean findsum(int arr[]) {

        HashSet<Integer> set = new HashSet<>();

        int prefixSum = 0;

        for (int num : arr) {

            prefixSum += num;

            // Case 1: starting se current index tak sum 0
            if (prefixSum == 0)
                return true;

            // Case 2: same prefix sum pehle aa chuka hai
            if (set.contains(prefixSum))
                return true;

            set.add(prefixSum);
        }

        return false;
    }
}

// 22.Factorials of a large number
class Solution {
    public ArrayList<Integer> factorial(int n) {

        // stores factorial digits in reverse order
        ArrayList<Integer> ans = new ArrayList<>();

        ans.add(1); // 0! = 1, 1! = 1

        // multiply current result by every number from 2 to n
        for (int x = 2; x <= n; x++) {

            int carry = 0;

            // multiply x with each digit
            for (int i = 0; i < ans.size(); i++) {

                int product = ans.get(i) * x + carry;

                ans.set(i, product % 10);

                carry = product / 10;
            }

            // store remaining carry digits
            while (carry > 0) {

                ans.add(carry % 10);

                carry /= 10;
            }
        }

        // reverse because digits were stored backwards
        Collections.reverse(ans);

        return ans;
    }
}

// 23.Max product subarray
        class Solution {
    int maxProduct(int[] arr) {
        
        // max product --> algorithm minPro * -ve = maxProd 
        // we need to track min product also bcz if current element 
        //of an array is -ve so we mutlitplying with min product we get the max product final ans
        
        
        /*
        We maintain minProduct as well because multiplying a 
        negative number with the minimum product can produce the 
        maximum product.
        */
        int maxProd = arr[0] ;// -2
        int minProd = arr[0]; // -2
        int ans = arr[0]; // -2
        
        for(int i = 1; i < arr.length; i++){
            // if arr[i] current element is -ve so we swap 
            // 1 --> 6
            // 2--> -3 --> swap maxProd = -12
            if(arr[i] < 0){
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }
            
            maxProd = Math.max(arr[i], maxProd * arr[i]); 
            // 6, -12 --> 6
            minProd = Math.min(arr[i], minProd * arr[i]); 
            // 6, -12 --> -12
            
            ans = Math.max(ans, maxProd);
            // 6
        }
        
        return ans;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // one more test case dry run
        // test_case - 2
        /*
        -1, -3, -10, 0, 6
        0     1   2   3  4
        min = -1, max = -1, ans = -1
        i --> 1 --> arr[i] --> -3
        max = -3, -3 * -1 --> -3, 3 --> 3
        min = -3, -3 * -1 --> -3, 3 --> -3
        
        ans = -1, 3 -->  3
        
        
        i = 2 --> arr[i] = -10
        
        swap --> max = -3; min = 3
        
        max = -10, -10 * -3 --> -10, 30 --> 30
        min = -10, -10 * 3 --> -10, -30 --> -30
        
        ans = 3, 30 --> 30
        */
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // int maxProd = arr[0]; // -2
        // int minProd = arr[0]; // -2
        // int ans = arr[0]; // -2
        
        // for (int i = 1; i < arr.length; i++) {
        //     // i = 1 --> 6
        //     // i = 2 --> -3
        //     // i = 3 --> -10
        //     // i = 4 --> 0
        //     // i = 5 --> 2
        //     // If current element is negative, swap --> minProd * -ve = maxans ; maxprod * -ve = minans
        //     // temp = 6; maxProd = -12; minProd = 6
        //     // temp = 36; maxProd = -18; minProd = 36
        //     if (arr[i] < 0) {
        //         int temp = maxProd;
        //         maxProd = minProd;
        //         minProd = temp;
        //     }
        //     // 

        //     // Update max and min products
        //     maxProd = Math.max(arr[i], maxProd * arr[i]);
        //     // maxProd = (6, -2 * 6) = (6, -12) = 6
        //     // maxProd = (-3, -12 * -3) = (-3, 36) = 36
        //     // maxProd = (-10, -18 * -10) = 180
        //     // maxProd = (0, 180 * 0) = (0, 0) = 0 
        //     // maxProd = (2, 2 * 0) = 2
        //     minProd = Math.min(arr[i], minProd * arr[i]);
        //     // minProd = (6, -2 * 6) = (6, -12) = -12
        //     // minProd = (-3, 6 * -3) = (-3, -18) = -18
        //     // minProd = (-10, 36 * -10) = (-10,-360) = -360
        //     // minProd = 0, 0 * ..) --> 0
        //     // minProd = 2, 0--> 0
        //     // Update answer
        //     ans = Math.max(ans, maxProd);
        //     // ans = 6
        //     // ans = 6, 36 --> 36
        //     // ans = 36, 180 --> 180
        //     // ans = 0, 180 --> 180
        //     // 180, 2 --> 180
        // }

        // return ans; // 180
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

// 25.Elements Appearing More Than n/k Times
class Solution {
    public int countOccurence(int[] arr, int k) {

        int n = arr.length;

        // frequency store karne ke liye
        HashMap<Integer, Integer> map = new HashMap<>();

        // har element ki frequency count karo
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int count = 0;

        // check karo kaunse elements n/k se jyada baar aaye hain
        for (int freq : map.values()) {

            if (freq > n / k) {
                count++;
            }
        }

        return count;
    }
}
// 27. Array Subset
class Solution {
    public boolean isSubset(int a[], int b[]) {

        // frequency store karenge
        HashMap<Integer, Integer> map = new HashMap<>();

        // a ki frequency count
        for (int num : a) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // b ke elements consume karenge
        for (int num : b) {

            // element nahi mila
            if (!map.containsKey(num) || map.get(num) == 0) {
                return false;
            }

            // frequency decrease
            map.put(num, map.get(num) - 1);
        }

        return true;
    }
}

// 28. Triplet sum in an array
class Solution {
    public boolean hasTripletSum(int arr[], int target) {

        int n = arr.length; // 6
        // 1,2,3,4,6,7
        // 3,6,7,10,20,40
        // target = 11;
        // Step 1:
        // Array sort karenge taaki two pointer use kar sake
        Arrays.sort(arr);
        
        // Step 2:
        // Har element ko first element maan kar
        // remaining target ke liye two sum solve karenge
        for (int i = 0; i < n - 2; i++) {
// 0 < 4
            int left = i + 1;      // 1
            int right = n - 1;     // 5

            while (left < right) {
    // 1 < 5
    // 1 < 4
    // 1 < 3
                int sum = arr[i] + arr[left] + arr[right];
//49 > 24
// 29 > 24
// 19 < 24
// 20 < 24

                // Triplet mil gaya
                if (sum == target) {
                    return true;
                }

                // Sum chota hai
                // Sorted array me sum badhane ke liye
                // left ko aage badhao
                else if (sum < target) {
                    left++;
                }

                // Sum bada hai
                // Sorted array me sum kam karne ke liye
                // right ko peeche lao
                else {
                    right--;
                }
            }
        }

        return false;
    }
}


// 29. Trapping Rain Water
class Solution {
public int trap(int[] height) {
    // 0, 1, 0, 2, 1, 0, 3, 2, 1, 2, 1
    int left = 0;
    int right = height.length -1;// 11
    int leftMax = 0; 
    int rightMax = 0;

    int water = 0;
        while(left < right) {
    // 0 < 11 --> 1. 0 <= 1 --> a. 0 >= 0 lm = 0;
    // 1 < 11 --> 1. 1<=1 -->a. 1 >= 0 lm = 1;
    // 2 < 11 --> 1. 0<=1->a. w=1
    // 3 < 11 -->2. 2>=1--> a.1>=0--> rm = 1 r--;
    // 3 < 10 lm = 2;
    // 4 < 10 --> 2. 1. rm = 2; r--;
    // 4 < 9 -->1. 1<=1--> b. w = 2
    // 5 < 9-->1.0<=1 --> b. w = 4
    // 6 < 9-->1.1<=1 --> b. w = 5
    // 7 < 9-->2-->b --> w= 6
    // 7 < 8 --> r--
    // 7 < 7
    
    // height doosre side ki label m le kr aaenge
    // tb n uske beach k water aaega consumed
            if(height[left] <= height[right]) {
                if(height[left] >= leftMax) {
         leftMax = height[left];
                } else {

                    water += leftMax - height[left];
                }

                left++;
            } else {
                // 1 >= rm --> rm = 1
                if(height[right] >= rightMax) {

                    rightMax = height[right];
                } else {

                    water += rightMax - height[right];
                }

                right--;
            }
        }

        return water;
    }
}

// 30.Chocolate distribution problem.
class Solution {
    public int findMinDiff(int arr[], int m) {
        
        int n = arr.length;
        // 7
        // Agar students packets se zyada hain
        if(m > n) {
            return 0;
        }
        
        // Step 1: Sort array
        Arrays.sort(arr);
        // 2,3,4,7, 9, 12, 56
        int ans = Integer.MAX_VALUE;
        // 60
        // Step 2: Window size = m
        // n - m = 7 - 3 = 4
        for(int i = 0; i <= n - m; i++) {
            // i = 0, 1
            int minChocolate = arr[i]; // 2, 3
            int maxChocolate = arr[i + m - 1]; // 4, 7
            
            ans = Math.min(ans, maxChocolate - minChocolate);
            // ans = 2, 
        }
        return ans;
    }
}

// 31.minimum subarray length with sum greater than x
class Solution {
    public static int smallestSubWithSum(int x, int[] arr) {

        int sum = 0;
        int left = 0;
        int length = 0;
        int ans = Integer.MAX_VALUE;

        for (int num : arr) {

            sum += num;
            length++;

            // Jab tak sum > x hai, window valid hai
            while (sum > x) {

                // Current valid window ka answer update karo
                ans = Math.min(ans, length);

                // Window shrink karo
                sum -= arr[left];
                left++;
                length--;
            }
        }

        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}

// 32.Three way partitioning
class Solution {
    public void threeWayPartition(int arr[], int a, int b) {
        // dutch national flag 
        // ....<a | | a>= <=b | b>...
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        
        while(mid <= high){
            // if < a 
            if(arr[mid] < a){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }
            else if(arr[mid] >= a && arr[mid] <= b){
                mid++;
            } 
            else {
                // greather than b
                // swap with last
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }
    }
}

//33.Minimum swaps and K together
class Solution {
    // Function for finding maximum and value pair
    int minSwap(int[] arr, int k) {
        // pehle isme elements count krna h jo less 
        // than k h jinhe ek sath rkhna h 
        int good = 0;
        for(int num:  arr){
            if(num <= k) good++;
        }
        // good = 5
        // fhir isme bad element count krne h 
        // ki good element ki length tk bad elements 
        // kitne h  --> ek window milegi
        int bad = 0;
        for(int i = 0; i < good; i++){
            if(arr[i] > k) bad++;
        }
        // bad = 2
        int ans = bad;
        int i = 0;
        int j = good;
        
        while(j < arr.length){
            // pehle jo element jaa rha uske according aapan bad element update kr de 
            if(arr[i] > k){
                bad--;
            }
            
            if(arr[j] > k) bad++;
            i++;
            j++;
            
            ans = Math.min(ans, bad);
        }
        
        
        // hume minimum swaps chahiye
        return ans;
    }
}


// 34. Array with all palimdromes
class Solution {
public:

    bool isPalindrome(int num)
    {
        string s = to_string(num);

        int left = 0;
        int right = s.length() - 1;

        // Two Pointer Approach
        while(left < right)
        {
            if(s[left] != s[right])
                return false;

            left++;
            right--;
        }

        return true;
    }

    bool isPalinArray(vector<int> &arr)
    {
        // O(n)
        for(int num : arr)
        {
            // Har element ke liye palindrome check
            if(!isPalindrome(num))
                return false;
        }

        return true;
    }
};


// 35,36 last one Median of an Array
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

// ===============================(Matrix)=======================================
/*
Input: mat[][] = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16]]
Output: [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]
Explanation: 
*/
// 1. Spirally traverse a matrix
class Solution {
	public ArrayList<Integer> spirallyTraverse(int[][] mat) {
		int starting_column = 0;
		int starting_row = 0;
		int ending_column = mat[0].length -1; // 3
		int ending_row = mat.length -1; //3
		
		int total_elements = mat[0].length * mat.length;
		int count =0;
		
		ArrayList<Integer> ans = new ArrayList<>();
		
		while(count < total_elements){
		// pehle starting column --> ending column
		for(int i = starting_column; i <= ending_column && count < total_elements; i++){
		    ans.add(mat[starting_row][i]);// 1,2,3,4 // 13,14
		    count++;
		}
		starting_row++;//1
		
		// starting row --> ending row
		for(int i = starting_row; i <= ending_row && count < total_elements; i++){
		    ans.add(mat[i][ending_column]);// 5,6,7
		    count++;
		}
		ending_column--;
		// ending column --> starting column
		for(int i = ending_column; i >= starting_column && count < total_elements; i--){
		    ans.add(mat[ending_row][i]); //8,9,10
		    count++;
		}
		ending_row--;
		// ending row --> starting row
		for(int i = ending_row; i >= starting_row && count < total_elements; i--){
		    ans.add(mat[i][starting_column]); // 11,12
		    count++;
		}
		starting_column++;
		}
		return ans;
	}
}


//2. Search in a 2D matrix.
/*
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true

Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false
 
*/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // total elements
        // row size and column size
        int rs= matrix.length;  // 3
        int cs = matrix[0].length; // 4
        //  System.out.println(cs);
        int start = 0;
        int end = (rs * cs) - 1; // 11
        while(start <= end){
            int mid = start + (end - start)/2;
            // mid = 0 + 5=5
            int row = mid / cs; // 5/4 = 1  
            int col = mid % cs; // 5 % 4 = 1
            // jb target mil jae to 
            // m[1][1] = 11
            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return false;
    }
}

// 3. Median in a row wise sorted matrix
/*
Input: mat[][] = [[1, 3, 5], 
                [2, 6, 9], 
                [3, 6, 9]]
Output: 5
Explanation: Sorting matrix elements gives us [1, 2, 3, 3, 5, 6, 6, 9, 9]. Hence, 5 is median.
Input: mat[][] = [[2, 4, 9],
                [3, 6, 7],
                [4, 7, 10]]
Output: 6
Explanation: Sorting matrix elements gives us [2, 3, 4, 4, 6, 7, 7, 9, 10]. Hence, 6 is median.
Input: mat = [[3], [4], [8]]
Output: 4
Explanation: Sorting matrix elements gives us [3, 4, 8]. Hence, 4 is median.
Constraints:
1 ≤ n, m ≤ 400
1 ≤ mat[i][j] ≤ 2000

Expected Complexities
Time Complexity: O(n log m * log(maxVal – minVal))
Auxiliary Space: O(1)
*/
class Solution {
    public int median(int[][] mat) {
        // median find krne k logic 
        // median se pehle element total element k half hone chahiye
        // to total elements
        int row_size = mat.length ;
        int col_size = mat[0].length;
        
        int total_elements = row_size * col_size;
        int req = total_elements/2;
        int min_value = Integer.MAX_VALUE;
        int max_value = Integer.MIN_VALUE;
        
        for(int[] row: mat){
            min_value = Math.min(min_value, row[0]);
            max_value = Math.max(max_value, row[col_size - 1]);
        }
        
        int start = min_value;
        int end = max_value;
        while(start < end){
            int mid = start + (end - start) / 2; // 5
            int count = 0;
            // ab hr row m 5 se chota element count krenge 
            for(int[] row: mat){
                count += upper_bound(row, mid);
            }
            if(count <= req){
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }
        return start;
    }
    
    int upper_bound(int[] row, int m){
            int low = 0; 
            int high = row.length;
            while(low < high){
                int mid = (low + high)/2;
                if(row[mid] <= m){
                    low = mid + 1;
                }else {
                    high = mid;
                }
            }
            return low;
        }
}

// 4.Row with Max 1s in Rowwise Sorted
/*
Input: arr[][] = [[0,1,1,1],
               [0,0,1,1],
               [1,1,1,1],
               [0,0,0,0]]
Output: 2
Explanation: Row 2 contains the most number of 1s (4 1s). Hence, the output is 2.
Input: arr[][] = [[0,0],
               [1,1]]
Output: 1
Explanation: Row 1 contains the most number of 1s (2 1s). Hence, the output is 1.
Input: arr[][] = [[0,0], 
               [0,0]]
Output: -1
Explanation: No row contains any 1s, so the output is -1.
*/
class Solution {
    public int rowWithMax1s(int[][] arr) {
        // time complexity --> O(n + m)
        // start krna h 
        int i = 0; 
        int row_size = arr.length;
        int col_size = arr[0].length;
        int j = col_size - 1; 
        int ans = -1;
        
        while(i < row_size && j >=0){
            if(arr[i][j] == 1){
                j--;
                ans = i;
            }
            else {
                i++;
            }
        }
        return ans;
    }
};

//5.Sort a Matrix
import java.util.Arrays;

class Solution {
    int[][] sortedMatrix(int[][] mat) {

        int n = mat.length;

        // Step 1 : Flatten Matrix
        int[] arr = new int[n * n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[k++] = mat[i][j];
            }
        }

        // Step 2 : Sort 1D Array
        Arrays.sort(arr);

        // Step 3 : Fill Back into Matrix
        k = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = arr[k++];
            }
        }

        return mat;
    }
}

// kth smallest element in a matrix
class Solution {

    public int kthSmallest(int[][] matrix, int k) {

        int n = matrix.length;
        int m = matrix[0].length;

        // Smallest value
        int low = matrix[0][0];

        // Largest value
        int high = matrix[n - 1][m - 1];

        while (low < high) {

            int mid = low + (high - low) / 2;

            int count = 0;

            // Count elements <= mid
            for (int[] row : matrix) {
                count += upperBound(row, mid);
            }


            if (count < k) {
                // kth smallest right side me hoga
                low = mid + 1;
            } else {
                // answer left side ya mid ho sakta hai
                high = mid;
            }
        }

        return low;
    }

    // Returns count of elements <= x
    private int upperBound(int[] arr, int x) {

        int l = 0;
        int h = arr.length;

        while (l < h) {

            int mid = l + (h - l) / 2;

            if (arr[mid] <= x)
                l = mid + 1;
            else
                h = mid;
        }

        return l;
    }
}


// 10. Program to prints common element in all rows of matrix
import java.util.*;

class main
{

// Specify number of rows and columns
static int M = 4;
static int N =5;

// prints common element in all rows of matrix
static void printCommonElements(int mat[][])
{

    Map<Integer,Integer> mp = new HashMap<>();
    
    // initialize 1st row elements with value 1
    for (int j = 0; j < N; j++)
        mp.put(mat[0][j],1);
        
    // traverse the matrix
    for (int i = 1; i < M; i++)
    {
        for (int j = 0; j < N; j++)
        {
            // If element is present in the map and
            // is not duplicated in current row.
            if (mp.get(mat[i][j]) != null && mp.get(mat[i][j]) == i)
            {
                // we increment count of the element
                // in map by 1
                mp.put(mat[i][j], i + 1);

                // If this is last row
                if (i == M - 1)
                    System.out.print(mat[i][j] + " ");
            }
        }
    }
}

// Driver code
public static void main(String[] args) 
{
    int mat[][] =
    {
        {1, 2, 1, 4, 8},
        {3, 7, 8, 5, 1},
        {8, 7, 7, 3, 1},
        {8, 1, 2, 7, 9},
    };

    printCommonElements(mat);
}
}

//=======================================(String)===============================================

// 1.You are given a string s , the task is to reverse the string using stack.

// Examples:

// Input: s ="GeeksforGeeks"
// Output:  skeeGrofskeeG
// Input: s ="Geek"
// Output: keeG

class Solution {
    public String reverse(String S) {
        Stack<Character> ans = new Stack<>();
        
        // ab elements ko stack m push kro
        for(int i = 0; i < S.length(); i++){
            ans.push(S.charAt(i));
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(!ans.empty()){
            sb.append(ans.pop());
    }
    return sb.toString();
    }
}


// 2. Valid Palindrome
/*
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
	*/
Since an empty string reads the same forward and backward, it is a palindrome.
class Solution {
    boolean isPalindrome(String s) {
        // code here
        int first = 0;
        int last = s.length() -1;
        // jb tk first < last
        while(first < last){
            
        // agar non-alphanumeric agar mila to skip kiya jae
        if(!Character.isLetterOrDigit(s.charAt(first))){
            first++;
            continue;
        }
        if(!Character.isLetterOrDigit(s.charAt(last))){
            last--;
            continue;
        }

        // tb tk pehle character ko lowercase me kiya jae 
            char fi = Character.toLowerCase(s.charAt(first));
            char la = Character.toLowerCase(s.charAt(last));
        //  tb tk agar koi element mimatch mila return false
        if(fi != la){
            return false;
        }
        first++;
        last--;
        }
        return true;
    }
}

// wap print all the duplicate's in the input String by using hashmap in java
/*
Input: s = "geeksforgeeks"
Output: ['e', 4], ['g', 2], ['k', 2], ['s', 2]
Explanation: Characters e, g, k, and s appear more than once. Their counts are shown in order of first occurrence.
*/
import java.util.*;

class Main{
    public static void printDuplicates(String s){
        HashMap<Character,Integer> ans = new HashMap<>();
        for(Character c: s.toCharArray()){
            ans.put(c, ans.getOrDefault(c,  0) + 1);
        }

        for(Map.Entry<Character, Integer> it: ans.entrySet()){
            if(it.getValue() > 1){
                System.out.println("[" + it.getKey() + ", " + it.getValue() + "]");
            }
        }
    }
    public static void main(String[] args){
        String s = "geeksforgeeks";
        printDuplicates(s);
    }
}




// 4.wap to check if strings are rotation of each other.
class Solution {
    public boolean rotateString(String s1, String s2) {
         if (s1.length() != s2.length()) {
            return false;
        }

        String temp = s1 + s1;
        return temp.contains(s2);
    }
}

// 5.Count and say
class Solution {
    public String countAndSay(int n) {
        String ans = "1"; // Base case
        // Generate sequence from 2 to n
        // 2,3,4,5
        for (int i = 2; i <= n; i++) {
        // i = 2
        // i = 3
        // i = 4
        // i = 5
        StringBuilder temp = new StringBuilder();
        int count = 1;
        // ans --> 1 --> length = 1
        // ans --> 11 --> length = 2
        // ans --> 21 --> length = 2
        // ans --> 1211 --> length = 4


        // 2nd one --> 1 < 2 --> ..
        // 3rd one --> 1 < 2-->...
        // 4th one --> 1 < 4
    for (int j = 1; j < ans.length(); j++) {
        // 4th one --> 1 < 4
        // 2 < 4
        // 3 < 4
        if(ans.charAt(j) == ans.charAt(j - 1)) {
            count++; 
            // 2
        // count = 2
        } else {
                    temp.append(count); 
                    // temp.append(1) --> temp --> 1
                    // temp.append(1);
                    // temp.append(1);
                    temp.append(ans.charAt(j - 1)); 
                    // temp.append(ans.charAt(0)) --> 
                    // temp.append(2) --> temp --> 12
                    // temp.append(1)
                    // temp.append(2)

                    /// temp --> 1112
                    count = 1;
                }
            }

            // Last group
            temp.append(count);
            // temp.append(1) --> temp --> 1
            // temp.append(2) --> 2
            // temp.append(1) --> 121
            // temp.append(2)
            temp.append(ans.charAt(ans.length() - 1));
            // temp.append(ans.charAt(0)) --> temp.append(1)
            // temp.append(ans.charAt(1)) --> temp.append(1)
            // temp.append(1) --> temp --> 1211
            // temp.append(1)

            // temp--> 111211
            ans = temp.toString();
            // ans = "11"
            // ans = "21"
            // ans = "111211"

        }

        return ans;
    }
}

// 6. Longest palimdrome String 

class Solution {
    static String longestPalindrome(String s) {
        // longest palimdrome substring 
        int n = s.length();
        if(n <= 1){
            return s;
        }
        
        int start = 0;
        int maxLength = 1;
        // used the concept expand around centre
        for(int i = 0; i < n; i++){
            
        // substring --> odd_length  --> aba
        int left = i;
        int right = i;
        
    while((left >= 0 && right < n) && (s.charAt(left) == s.charAt(right))){
            if(right - left + 1 > maxLength){
                maxLength = right - left + 1;
                start = left;
            }
            
            left--;
            right++;
    }
        // even length --> abba
    left = i;
    right = i + 1;
    while((left >= 0 && right < n) && (s.charAt(left) == s.charAt(right))){
            if(right - left + 1 > maxLength){
                maxLength = right - left + 1;
                start = left;
            }
            left--;
            right++;
    }
        }
        return s.substring(start, start + maxLength);
    }
}

// 7.Is Subsequence

class Solution {
    public boolean isSubsequence(String s, String t) {

        // i -> s ko traverse karega
        // j -> t ko traverse karega
        int i = 0, j = 0;

        // jab tak dono strings ke andar hain
        while (i < s.length() && j < t.length()) {

            // character match hua
            if (s.charAt(i) == t.charAt(j)) {
                i++; // s ka next character
            }

            // t hamesha aage badhega
            j++;
        }

        // agar s ke saare characters match ho gaye
        return i == s.length();
    }
}

//10. Balanced Splits of a Binary String
class Solution {
    public int balancedStringSplit(String s) {

        // Dry Run
        // Input : "RLRRLLRLRL"

        int l = 0;
        int r = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            // i = 0
            // s.charAt(0) = 'R'
            // r = 1
            // l = 0
            // l != r

            // i = 1
            // s.charAt(1) = 'L'
            // l = 1
            // r = 1
            // l == r
            // count = 1

            // i = 2
            // s.charAt(2) = 'R'
            // r = 2
            // l = 1
            // l != r

            // i = 3
            // s.charAt(3) = 'R'
            // r = 3
            // l = 1
            // l != r

            // i = 4
            // s.charAt(4) = 'L'
            // l = 2
            // r = 3
            // l != r

            // i = 5
            // s.charAt(5) = 'L'
            // l = 3
            // r = 3
            // l == r
            // count = 2

            // i = 6
            // s.charAt(6) = 'R'
            // r = 4
            // l = 3
            // l != r

            // i = 7
            // s.charAt(7) = 'L'
            // l = 4
            // r = 4
            // l == r
            // count = 3

            // i = 8
            // s.charAt(8) = 'R'
            // r = 5
            // l = 4
            // l != r

            // i = 9
            // s.charAt(9) = 'L'
            // l = 5
            // r = 5
            // l == r
            // count = 4

            if (s.charAt(i) == 'L')
                l++;
            else
                r++;

            if (l == r) {
                count++;
                // l = 0;
                // r = 0;
            }
        }

        // Final
        // l = 5
        // r = 5
        // count = 4

        return count;
    }
}

// 13. Next Permutations
class Solution {
    void nextPermutation(int[] arr) {

        // Dry Run
        // Input : [1, 3, 2]

        int n = arr.length;
        int pivot = -1;

        // Pivot Find
        for(int i = n - 2; i >= 0; i--){

            // i = 1
            // 3 < 2  -> No

            // i = 0
            // 1 < 3  -> Yes
            // pivot = 0

            if(arr[i] < arr[i + 1]){
                pivot = i;
                break;
            }
        }

        // pivot = 0

        if(pivot == -1){
            reverse(arr,0,n-1);
            return;
        }

        // Next Greater Element
        for(int i = n - 1; i > pivot; i--){

            // i = 2
            // arr[2] = 2
            // arr[pivot] = 1
            // 2 > 1

            // Swap
            // [2,3,1]

            if(arr[i] > arr[pivot]){
                swap(arr,i,pivot);
                break;
            }
        }

        // Reverse pivot+1 to end

        // Before Reverse
        // [2,3,1]

        // Reverse (1...2)

        // After Reverse
        // [2,1,3]

        reverse(arr,pivot+1,n-1);
    }

    void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void reverse(int[] arr,int start,int end){
        while(start < end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}

// 14. Valid Parenthesis String
	class Solution {
    public boolean checkValidString(String s) {
        // Dry Run
        // Input : "(*))"
        // input: "()"
        // Input : "(*)"

        // low = Minimum possible open brackets
        // high = Maximum possible open brackets

        int low = 0;
        int high = 0;

        for(int i = 0; i < s.length(); i++){

            char ch = s.charAt(i);
// ch = s.charAt(0) --> "("
// ch = s.charAt(1)--> ")"

// ch = s.charAt(0) --> "("
// ch = s.charAt(1) --> "*"
// ch = s.charAt(2)--> ")"
            if(ch == '('){
                low++;
                // 1
                // 1
                high++;
                // 1
                // 1
            }
            else if(ch == ')'){
                low--;
                // 0
                // -1
                high--;
                // 0
                // 1
            }
            else{ // '*'
                low--;      // '*' as ')'
                // 0
                high++;     // '*' as '('
                // 2
            }

            if(low < 0)
                low = 0;

            if(high < 0)
                return false;
        }

        return low == 0;
    }
}

// by using stack 
class Solution {
	public boolean isBalanced(String s) {
		// [{()}]
		// odd length wale to pehle hi false ho jaenge
		Stack<Character> st = new Stack<>();
		// logic is stack use kiya jae aur usme
		for (int i = 0; i < s.length(); i++) {
			// sb push kiya jae open bracket k case me
			char current = s.charAt(i); // [
			if (!st.isEmpty() && (
			(st.peek() == '[' && current == ']') ||
			(st.peek() == '{' && current == '}') ||
			(st.peek() == '(' && current == ')'))) {
				st.pop();
				
				// aur jb close bracket mila tb aapn
				// stack k top check krenge
				// if stack k top us similar bracket k open
				// side mila tb stack ko pop kr denge
			}
			else {	// sb push kiya jae open bracket k case me
				st.push(current); //
			}
		}
		// at the end stack empty mila to fhr
		// true return krenge
		// otherwise false return krenge
		if (st.isEmpty()) {
			return true;
		}
		return false;
		
	}
	
}


// 24.Roman to Integer
class Solution {
    public int romanToInt(String s) {
        int ans = 0;
// MCMXCIV
        for(int i = 0; i < s.length(); i++){
            char left = s.charAt(i); 
        // main logic is left wala chota ho right wale se to ans m subtract kr denge 
        if(i + 1 < s.length() && value(left) < value(s.charAt(i + 1)))
        ans -= value(left);
        // aur agar aesa nhi h (right wala chota h left wale se to ans m add kr denge)
        else 
            ans += value(left);
        }
        return ans;
    }
    int value(char ch){
            if(ch == 'I') return 1;
            if(ch == 'V') return 5;
            if(ch == 'X') return 10;
            if(ch == 'L') return 50;
            if(ch == 'C') return 100;
            if(ch == 'D') return 500;
            if(ch == 'M') return 1000;

        return 0;
    }
}

// =============================(Searching & Sorting)=====================================
// 1. Find First and Last Position of Element in Sorted Array...
class Solution {
    public int[] searchRange(int[] arr, int target) {
    // first element k liye by store and compute & always left side find kro jo index milega vo first index hoga 
    int start = 0; 
    int end = arr.length - 1;
    int first = -1;
    while(start <= end){
        int midf = start + (end - start)/2;
        if(arr[midf] == target) {
            first = midf;
            // left jao aur elements check kro ki usse pehle to aur koi n aaya
            end = midf - 1;
        }
        else if(arr[midf] < target){
            start = midf +1;
        }
        else {
            end = midf -1;
        }
    }
    // last element k liye by store and compute and always right side find kro jo index milega vo last index hoga


    int s = 0; 
    int e = arr.length - 1;
    int last = -1;
    while(s <= e){
        int midl = s + (e - s)/2;
        if(arr[midl] == target) {
            last = midl;
            // right jao aur elements check kro ki usse baad to aur koi n aaya
            s = midl + 1;
        }
        else if(arr[midl] < target){
            s = midl +1;
        }
        else {
            e = midl -1;
        }
    }
    // int arrf = new int[2];
    // arrf[0] = first;
    // arrf[1] = last;
    // return arrf;
    return new int[] {first, last};
    }
}

// 2.Value equal to Position 
class Solution {
    public static ArrayList<Integer> valEqualToPos(int[] arr) {
    // indexing 0 se start krenge aur fhr 
    ArrayList<Integer> ans = new ArrayList<>();
    for(int i = 0; i < arr.length; i++){
    // jo number index + 1 k equal hoga usko arraylist m
    if(i + 1 == arr[i]) ans.add(arr[i]);
    // add krte jaenge 
    }
    return ans;
    }
}

// 3. Search in Rotated Sorted Array
class Solution {
    public int search(int[] nums, int target) {

        // nums = [4,5,6,7,0,1,2]
        // target = 0


        // pehle pivot find kr lo
        int pivot = -1;

        for (int i = nums.length - 1; i > 0; i--) {

            // i = 6
            // nums[5] > nums[6]
            // 1 > 2 false

            // i = 5
            // nums[4] > nums[5]
            // 0 > 1 false

            // i = 4
            // nums[3] > nums[4]
            // 7 > 0 true
            // pivot = 3

            // break bhi laga sakte ho yaha
            // kyunki pivot mil gaya hai
            if (nums[i - 1] > nums[i]) {
                pivot = i - 1;
            }
        }

        // pivot = 3

        /*
        Array:

        [4,5,6,7 | 0,1,2]
                 ↑
               pivot

        Part 1 = [4,5,6,7]
        Part 2 = [0,1,2]
        */


        // pehle starting se pivot index tk
        int ansl = BS(nums, 0, pivot, target);

        // BS(nums, 0, 3, 0)

        /*
        start = 0
        end = 3

        mid = 1
        nums[1] = 5

        5 < 0 false

        end = mid - 1
        end = 0


        mid = 0
        nums[0] = 4

        4 < 0 false

        end = -1

        return -1

        ansl = -1
        */


        // pivot ke baad se last tk
        int ansr = BS(nums, pivot + 1, nums.length - 1, target);

        // BS(nums, 4, 6, 0)

        /*
        start = 4
        end = 6

        mid = 5
        nums[5] = 1

        1 < 0 false

        end = 4


        mid = 4
        nums[4] = 0

        nums[mid] == target

        0 == 0

        return 4

        ansr = 4
        */


        if (ansl != -1)
            return ansl;

        else if (ansr != -1)
            return ansr;
            // ansr = 4
            // return 4

        return -1;
    }


    int BS(int[] nums, int start, int end, int target) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            else if (nums[mid] < target) {

                // target right side me hai
                start = mid + 1;

            }

            else {

                // target left side me hai
                end = mid - 1;
            }
        }

        return -1;
    }
}

// 4.Count Perfect Squares
class Solution {
    static int countSquares(int n) {

        int count = 0;
        // n = 10
        // count = 0

        for (int i = 1; i * i < n; i++) {
            // i = 1 → 1*1 = 1 < 10 → count = 0

            count++;
            // i = 1 → count = 1
            // i = 2 → 2*2 = 4 < 10 → count = 2
            // i = 3 → 3*3 = 9 < 10 → count = 3
            // i = 4 → 4*4 = 16 < 10 false → loop stop
        }

        return count;
        // count = 3
        // perfect squares = 1, 4, 9
    }
}

// 5. Middle of Three 
class Solution {
    int middle(int a, int b, int c) {
        // code here
        // agar a middle h
        if((a > b && a < c) || (a > c && a < b)) return a;
        else if((b > a && b < c) || (b > c && b < a)) 
        return b;
        return c;
    }
}

// 6. Missing And Repeating
class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {

        // arr = [1,3,3]
        // duplicate = 3
        // missing = 2

        ArrayList<Integer> ans = new ArrayList<>();
        // ans = []

        for (int i = 0; i < arr.length; i++) {

            int index = Math.abs(arr[i]) - 1;
            // i = 0 → arr[0] = 1 → index = 0
            // i = 1 → arr[1] = 3 → index = 2
            // i = 2 → arr[2] = 3 → index = 2

            if (arr[index] < 0) {
                ans.add(Math.abs(arr[i]));
                // i = 2 → arr[2] = -3
                // already negative → duplicate = 3
                // ans = [3]

            } else {
                arr[index] *= -1;
                // i = 0 → arr[0] = -1
                // arr = [-1,3,3]

                // i = 1 → arr[2] = -3
                // arr = [-1,3,-3]
            }
        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                ans.add(i + 1);
                // i = 0 → -1 → skip
                // i = 1 → 3 > 0 → missing = 2
                // ans = [3,2]
                // i = 2 → -3 → skip
            }
        }

        return ans;
        // [3,2]
        // first = duplicate
        // second = missing
    }
}
