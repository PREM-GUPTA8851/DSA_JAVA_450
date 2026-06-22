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
  public:
    void sort012(vector<int>& arr) {

        // int count0 = 0;
        // int count1 = 0;
        // int count2 = 0;

        // // count frequency of 0,1,2
        // for(int num : arr){

        //     if(num == 0)
        //         count0++;

        //     else if(num == 1)
        //         count1++;

        //     else
        //         count2++;
        // }

        // int index = 0;

        // // fill 0s
        // while(count0--){
        //     arr[index++] = 0;
        // }

        // // fill 1s
        // while(count1--){
        //     arr[index++] = 1;
        // }

        // // fill 2s
        // while(count2--){
        //     arr[index++] = 2;
        // }
        
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

/*  

*/
