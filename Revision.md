# 1. Reverse Array
```java

class Solution {
    public void reverseArray(int arr[]) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}
```

# 2. Maximum and Min in an array

```java
class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(min);
        ans.add(max);

        return ans;
    }
}
```

# 3. Kth Smallest
```java
class Solution {
    public int kthSmallest(int[] arr, int k) {
        // firstly sort then return k-1th element
        Arrays.sort(arr);
        return arr[k-1];
    }
}

```

# 4.Sort 0s, 1s and 2s
```java
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
}
```

# 5.Move all negative numbers to beginning and positive to end with constant extra space.
```java
// Java program to Move all negative numbers
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
```

# 6.Union of Arrays with Duplicates
```java
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
```

# 7.Rotate Array by 1 .
```java
class Solution {
    public void rotate(int[] arr) {

        int n = arr.length;

        // Step 1: Store last element
        int last = arr[n - 1];

        // Step 2: Shift all elements one position to the right
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        // Step 3: Place last element at first position
        arr[0] = last;
    }
}
```

# 8. Kadane's Algorithm
```java
class Solution {
    int maxSubarraySum(int[] arr) {
        // max subarray chahiye to ans ko min se initialise kro
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for(int n: arr){
            sum += n;
            
            ans = Math.max(ans,sum);
            
            if(sum < 0){
                sum = 0;
            }
        }
        return ans;
    }
}
```

# 9. Find the Duplicate Number.
```java
class Solution {
    public int findDuplicate(int[] nums) {

        // by using floyd's cycle detection algorithm
        // dry run --> [1,3,4,2,2]
        // DRY RUN --> [3,1,3,4,2]
        // firstly we check duplicate exist or not
        int slow = nums[0]; // 1 
        // 3 
        int fast = nums[0]; // 1
        // 3
        // pehle aapn check krte h duplicate exist krta h y nhi
        do {
            slow = nums[slow];  // ek ko 1 step  
            // 3, 2
            // 4, 2, 3
            fast = nums[nums[fast]]; // doosre ko 2 step
            //2, 2
            // 2, 4, 3
        } while (slow != fast);
        // to ek ko starting point p krte h 
        // doosre ko meeting point p 
        slow = nums[0]; // 1
        // 3
         while(slow != fast){
            slow = nums[slow]; 
            // 3 2
            fast = nums[fast];
            // 4 2
        }

        return slow; // 2
        // 3
    }
}
```

# 10)a. Merge Sorted Array
```java
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // I used the Three Pointer Backward Merge approach to merge two sorted arrays in-place.
    //  nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
    // nums1 = [2,5,6, 0, 0, 0] m = 3, nums2 = [1,2,3] n = 3
    // [1,2,2,3,5,6]
        int i = m - 1;        // 2
        int j = n - 1;        // 2
        int k = m + n - 1;    // 5
        // Back se merge karo
        while (i >= 0 && j >= 0) {
        // nums1[2] = 3 > nums2[2] = 6 --> else part
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
            // nums1[3] = nums1[2] = 3
            // nums1 = [1,2,3 ,3,5,6]

            // nums1[5] = 6
            // nums1 = {2,5,6, 0, 0, 6}
            // nums1[4] = 5
            // nums1[2,5,6,0,5,6]
                i--;
                // i = 1,0

            // i = 1
            } else {
                nums1[k] = nums2[j];
                // nums1[5] = nums2[2] = 6
                // nums1[4] = 5;
                // num1[2] = 2;
                j--;

                // nums1[2,5,6,0,5,6]
                // nums1[2,5,6,3,5,6]
                // nums1[1,2,2,3,5,6]
            }

            k--;
            // k = 4
            // k = 3;
            // k = 2

            // k = 4
            // k = 3
            // k = 2;
        }

        // Agar nums2 me elements bach gaye
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}
```


# b.Merge without extra space
```java
class Solution {
    public void mergeArrays(int a[], int b[]) {
        // code here
        // by using 2 pointer method
        int i = a.length - 1;
        int j = 0;
        
        // swap krenge loop chlaenge 
        while(i >= 0 && j < b.length){
            if(a[i] > b[j]){
            int temp = a[i];
            a[i] = b[j];
            b[j] = temp;
            }
            i--;
            j++;
        }
        // till 2nd pointer < 2nd array length and 1st pointer greater than 0
        
        // iske baad fhr sort algorith lga denge both arrays pe
        Arrays.sort(a);
        Arrays.sort(b);
    }
}

```

# 11. Merge Intervals
```java
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int start = intervals[0][0];
        int end = intervals[0][1];
        ArrayList<int[]> ans = new ArrayList<>();
        int i = 1;
        while(i < intervals.length){
            if(intervals[i][0] <= end){
                end = Math.max(intervals[i][1], end);
            }
            else{
                ans.add(new int[]{start, end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
            i++;
        }
        ans.add(new int[]{start, end});
        return ans.toArray(new int[ans.size()][]);
    }
}
```

# 12.Next Permutations
```java
class Solution {
    public void nextPermutation(int[] nums) {
    //Pivot = Right se pehla element jo apne next element se chhota ho. Ye wahi element hota hai jise change karke next permutation ban sakta hai.
/*
nums = [1,2,3,6,5,4]
[1,2,4,6,5,3]
[1,2,4,3,5,6]
 */
/// another testcase :-- [1,2,3,6, 4,5]
        int n = nums.length;
// n = 6
        int pivot = -1;

    for (int i = n - 2; i >= 0; i--) {
        // i = 4 
        // 5 < 4 x
        // 6 < 5 x
        // 3 < 6 
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                // pivot = 2
                break;
            }
        }
    // agar pivot mil gya 
        if (pivot != -1) {
            for (int i = n - 1; i > pivot; i--) {
                // i = 5 ; i > 2; i-- 
// nums = [1,2,3,6,5,4]
                if (nums[i] > nums[pivot]) {
//4 > 3 --> h
                    int temp = nums[i];
                    nums[i] = nums[pivot];
                    nums[pivot] = temp;
                    break;
                }
            }
        }
// after swap --> [1,2,4,6,5,3]

        int left = pivot + 1;
        // left = 3
        int right = n - 1;
        // right = 5
    // 3 < 5
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
    // after reverse --> [1,2,4,3,5,6]
    /*
    Current Array
[1,2,4,6,5,3]

Pivot ke baad ka part

6,5,3

Ye already descending order me hai.

Descending order maximum arrangement hoti hai.

Hume next permutation chahiye,
isliye pivot ke baad wale part ko
minimum arrangement me convert karna hoga.

Descending ko minimum banane ka easiest way hai
Reverse kar dena.
     */
}
```

# 13. Best time to buy and sell stock
```java
class Solution {
    public int maxProfit(int[] prices) {
        
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {

            // Minimum buying price maintain karo
            minPrice = Math.min(minPrice, price);

            // Agar aaj sell kare to kitna profit hoga
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
/*
ince we traverse the array from left to right,
minPrice always represents the minimum stock
price seen before or on the current day. 
Therefore, whenever we compute price - minPrice
we are always buying first and selling later, satisfying the problem constraint automatically.
*/
    return maxProfit;
    }
}
```

# 18.(a) Two Sum II - Input Array Is Sorted
``` java
class Solution {
    public int[] twoSum(int[] numbers, int target) {

        // Test Case
        // numbers = [2,7,11,15]
        // target = 9

        int i = 0;
        int j = numbers.length - 1;   // 3

        while (i < j) {

            // i = 0
            // j = 3

            // numbers[i] = 2
            // numbers[j] = 15

            int sum = numbers[i] + numbers[j];   // 2 + 15 = 17

            // 17 > 9
            // sum bada h isliye right pointer ko left laenge

            if (sum == target) {
                return new int[]{i + 1, j + 1};
            }
            else if (sum < target) {
                i++;
            }
            else {
                j--;      // j = 2
            }


            // i = 0
            // j = 2

            // numbers[i] = 2
            // numbers[j] = 11

            sum = numbers[i] + numbers[j];   // 2 + 11 = 13

            // 13 > 9
            // fir bhi sum bada h
            // right ko aur left laenge

            if (sum == target) {
                return new int[]{i + 1, j + 1};
            }
            else if (sum < target) {
                i++;
            }
            else {
                j--;      // j = 1
            }


            // i = 0
            // j = 1

            // numbers[i] = 2
            // numbers[j] = 7

            sum = numbers[i] + numbers[j];   // 2 + 7 = 9

            // target mil gaya

            if (sum == target) {

                // i + 1 = 1
                // j + 1 = 2

                return new int[]{1,2};
            }
            else if (sum < target) {
                i++;
            }
            else {
                j--;
            }
        }

        return new int[]{};
    }
}
```

# 18.(b) Two sum -Pairs with 0 Sum
```java
class Solution {
    public int[] twoSum(int[] numbers, int target) {

        // Test Case
        // numbers = [2,7,11,15]
        // target = 9

        int i = 0;
        int j = numbers.length - 1; // 3

        while (i < j) {

            // i = 0
            // j = 3

            // numbers[i] = 2
            // numbers[j] = 15

            int sum = numbers[i] + numbers[j]; // 2 + 15 = 17

            // 17 > 9
            // sum bada h isliye j--

            if (sum == target) {
                return new int[]{i + 1, j + 1};
            }
            else if (sum < target) {
                i++;
            }
            else {
                j--; // j = 2
            }


            // i = 0
            // j = 2

            // numbers[i] = 2
            // numbers[j] = 11

            sum = numbers[i] + numbers[j]; // 2 + 11 = 13

            // 13 > 9
            // fir bhi sum bada h
            // j--

            if (sum == target) {
                return new int[]{i + 1, j + 1};
            }
            else if (sum < target) {
                i++;
            }
            else {
                j--; // j = 1
            }


            // i = 0
            // j = 1

            // numbers[i] = 2
            // numbers[j] = 7

            sum = numbers[i] + numbers[j]; // 2 + 7 = 9

            // sum == target
            // i + 1 = 1
            // j + 1 = 2

            if (sum == target) {
                return new int[]{1,2};
            }
            else if (sum < target) {
                i++;
            }
            else {
                j--;
            }
        }

        // is question me ye line kabhi execute nhi hogi
        // kyuki question guarantee deta h ki
        // exactly one solution hoga

        return new int[]{};
    }
}
```

# 19.Common in 3 sorted Arrays
```java
class Solution {
    public ArrayList<Integer> commonElements(int[] a, int[] b, int[] c) {
    ArrayList<Integer> ans = new ArrayList<>();
    int i = 0; 
    int j = 0;
    int k = 0;
    
    while(i < a.length && j < b.length && k < c.length){
        // skip duplicates
        
        // jb common elements mil jae tb
        if(a[i] == b[j] && b[j]== c[k]){
             ans.add(a[i]);
            //  i++;
            //  j++;
            //  k++;
         int val = a[i];

                // skip duplicates in all arrays
        while (i < a.length && a[i] == val) i++;
        while (j < b.length && b[j] == val) j++;
        while (k < c.length && c[k] == val) k++;
        }
        else if(a[i] < b[j]) i++;
        else if(b[j] < c[k]) j++;
        else k++;
    }
    return ans;
    }
}
```

# 20. Rearrange Array by Sign
```java

class Solution {
    void rearrange(ArrayList<Integer> nums) {

        // Firstly 2 ArrayList create krenge
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        // +ve and -ve elements alag store krenge
        for (int num : nums) {
            if (num >= 0)    // 0 ko bhi positive maana hai
                pos.add(num);
            else
                neg.add(num);
        }

        // Original array me alternate store krenge
        int index = 0;
        int i = 0;
        int j = 0;

        while (i < pos.size() && j < neg.size()) {
            nums.set(index++, pos.get(i++));
            nums.set(index++, neg.get(j++));
        }

        // Agar positive elements bach gaye
        while (i < pos.size()) {
            nums.set(index++, pos.get(i++));
        }

        // Agar negative elements bach gaye
        while (j < neg.size()) {
            nums.set(index++, neg.get(j++));
        }
    }
}
```

# 21.(a). Zero Sum Subarray 
```java
class Solution {
    public boolean subArrayExists(int arr[]) {

        HashSet<Integer> ans = new HashSet<>();
        // Prefix Sum store karega.
        // HashSet O(1) average time me search (contains) aur add kar deta hai.

        int sum = 0;

        for(int num : arr){

            // arr = [4, 2, -3, 1, 6]

            sum += num;

            // num = 4
            // sum = 4
            //
            // ans = {}
            // contains(4) = false
            //
            // ans = {4}
            
            // num = 2
            // sum = 6
            //
            // ans = {4}
            // contains(6) = false
            //
            // ans = {4,6}
            
            // num = -3
            // sum = 3
            //
            // ans = {4,6}
            // contains(3) = false
            //
            // ans = {4,6,3}
            
            // num = 1
            // sum = 4
            //
            // ans = {4,6,3}
            // contains(4) = true
            //
            // Prefix Sum repeat ho gaya.
            // Subarray [2,-3,1] ka sum = 0
            //
            // return true
            // -------------------------

            if(ans.contains(sum) || sum == 0)
                return true;

            ans.add(sum);
        }

        return false;
    }
}
```



# b).Subarray Sum Equals K
```java
class Solution {
    public int subarraySum(int[] nums, int k) {

HashMap<Integer, Integer> map = new HashMap<>();
    // Prefix Sum aur uski frequency store karega.

    map.put(0, 1);
    // Shuru me sum = 0 ek baar aaya hai.
    // map = {0=1}

        int sum = 0;
        // Current Prefix Sum

        int count = 0;
        // Answer store karega

        for (int num : nums) {
        // nums = [0,0,0], k = 0

            sum += num;
            // -------------------------
            // Iteration 1
            // num = 0
            // sum = 0 + 0 = 0
            //
            // Iteration 2
            // num = 0
            // sum = 0 + 0 = 0
            //
            // Iteration 3
            // num = 0
            // sum = 0 + 0 = 0

            if (map.containsKey(sum - k)) {
            // sum-k check karte hain.
            //
            // Iteration 1
            // sum-k = 0-0 = 0
            // map me 0 hai.
            //
            // map.get(0) = 1
            // Matlab Prefix Sum = 0 pehle 1 baar mila.
            //
            // count += 1
            // count = 1
            //
            //
            // Iteration 2
            // sum-k = 0-0 = 0
            // map me 0 hai.
            //
            // map.get(0) = 2
            // Matlab Prefix Sum = 0 pehle 2 baar mil chuka hai.
            //
            // count += 2
            // count = 3
            //
            //
            // Iteration 3
            // sum-k = 0-0 = 0
            // map me 0 hai.
            //
            // map.get(0) = 3
            // Matlab Prefix Sum = 0 pehle 3 baar mil chuka hai.
            //
            // count += 3
            // count = 6

                count += map.get(sum - k);
                // Frequency jitni hogi utne subarray milenge.
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
            // Current Prefix Sum ko map me store kar do.
            //
            // Iteration 1
            // map = {0=2}
            //
            // Iteration 2
            // map = {0=3}
            //
            // Iteration 3
            // map = {0=4}
        }

        return count;
        // Final Answer = 6
    }
}
```

# 22(a).Factorials of a large number (Gfg)
```java
class Solution {
    public ArrayList<Integer> factorial(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);
        // ans = {1};
        
        for(int x = 2; x <= n; x++){
            int carry = 0;
            for(int i = 0; i < ans.size(); i++){
                int product = ans.get(i) * x + carry;
                // 1 *2 + 0 --> 2
                // 2 * 3 + 0 = 6
                // 6 * 4 + 0 = 24
                // 4 * 5 + 0 = 20
                ans.set(i, product % 10);
                // {2}
                // {6} 
                // 4, 2  
                carry = product / 10;
                // c = 0
                // c = 0
                // 2
            }
            // agar carry bachegi tb 
                while(carry > 0){
                    ans.add(carry % 10);
                    // 4, 2
                    carry /= 10;
                }
        }
        Collections.reverse(ans);
        return ans;
    }
}
```

# b). Factorial Trailing Zeroes(LC)
```java

class Solution {
    public int trailingZeroes(int n) {
    // Instead of calculating factorial,
    // count all factors of 5 present in n!
        // n = 100
        // count = 0

        // count += 100 / 5
        // count = 20

        // n = 100 / 5
        // n = 20

        // count += 20 / 5
        // count = 24

        // n = 20 / 5
        // n = 4

        // count += 4 / 5
        // count = 24

        // n = 4 / 5
        // n = 0

        //  24

        int count = 0;

        while(n > 0){
            count += n / 5;
            n = n / 5;
        }

        return count;
    }
}
```

# 23. Maximum Product Subarray
```java
class Solution {
	int maxProduct(int[] arr) {
	     
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
		
	}
}

```
# 24.Longest Consecutive Subsequence
```java
class Solution {
    public int longestConsecutive(int[] arr) {
        if(arr.length == 0) return 0;
    // logic is this --> 
    // pehle saare element's set k andr kro
    HashSet<Integer>  set = new HashSet<>();
    // fhr array k first element se -1 krte krte search kro
    for(int num: arr){
        set.add(num);
    }
    
    // map --> 2,6,1,9,4,5,3
    int max = -1;
    for(int num: set){

    int count = 1;
    if(!set.contains(num - 1)){
    // yahi starting element hai

    int current = num;
    while(set.contains(current + 1)){
        current++;
        count++;
    }
    }
    
        max = Math.max(count, max);
    }
    // count ko increment krte jao 
    // aur if uske -1 wala element present n hua 
    // to fhr count ki value 0 kro us case me  
    return max;
    }
}
```

# 25. Count Frequent Elements
```java
class Solution {
	public int countOccurence(int[] arr, int k) {
		
		// arr = [3,1,2,2,1,2,3,3]
		// k = 4
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		
		// 3 -> 1
		// 1 -> 1
		// 2 -> 1
		// 2 -> 2
		// 1 -> 2
		// 2 -> 3
		// 3 -> 2
		// 3 -> 3
		
		int count = 0;
		
		for (int num : map.keySet()) {
			if (map.get(num) > arr.length / k)
				count++;
			
			// 1 -> 2 > 2 false
			// 2 -> 3 > 2 true  -> count=1
			// 3 -> 3 > 2 true  -> count=2
		}
		
		return count;
		// 2
	}
}

```

# 27.Array Subset
```java
class Solution {
    public boolean isSubset(int a[], int b[]) {

        if (b.length > a.length) return false;

        // HashMap me har element ki frequency store karenge
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : a) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // b ke har element ki frequency check karenge
        for (int num : b) {

            // agar element present nahi hai
            // ya uski frequency 0 ho gayi hai
            if (!map.containsKey(num) || map.get(num) == 0)
                return false;

            // ek occurrence use ho gayi
            map.put(num, map.get(num) - 1);
        }

        return true;
    }
}
```

# 28. Triplet Sum in Array((GFG) & (LC))

```java

class Solution {
    public boolean hasTripletSum(int nums[], int target) {

        // nums = [-1,0,1,2,-1,-4]
        // target = 0

        // TC --> O(n^2)
        // Space --> O(1)

        Arrays.sort(nums);

        // nums = [-4,-1,-1,0,1,2]
        // index    0  1  2 3 4 5


        for (int i = 0; i < nums.length - 2; i++) {

            // nums.length = 6
            // i < 4
            //
            // i = 0
            // i = 1
            // i = 2
            // i = 3

            int l = i + 1;
            int r = nums.length - 1;

            // i = 0
            // l = 1
            // r = 5


            while (l < r) {

                int sum = nums[i] + nums[l] + nums[r];

                // i = 0, l = 1, r = 5
                // sum = -4 + -1 + 2
                // sum = -3
                // -3 < 0 --> l++

                // l = 2


                // i = 0, l = 2, r = 5
                // sum = -4 + -1 + 2
                // sum = -3
                // -3 < 0 --> l++

                // l = 3


                // i = 0, l = 3, r = 5
                // sum = -4 + 0 + 2
                // sum = -2
                // -2 < 0 --> l++

                // l = 4


                // i = 0, l = 4, r = 5
                // sum = -4 + 1 + 2
                // sum = -1
                // -1 < 0 --> l++

                // l = 5
                // l < r false
                // while end


                // i = 1
                // nums[i] = -1
                // l = 2
                // r = 5

                // sum = -1 + -1 + 2
                // sum = 0
                // 0 == target
                // triplet mil gaya
                // [-1,-1,2]

                if (sum < target) {
                    l++;

                    // sum chhota hai
                    // isliye left ko aage badhayenge
                }

                else if (sum > target) {
                    r--;

                    // sum bada hai
                    // isliye right ko peeche karenge
                }

                else {
                    return true;

                    // sum == target
                    // valid triplet mil gaya
                    // isliye direct true return karenge
                }
            }
        }

        return false;

        // Agar poora array check karne ke baad
        // koi triplet nahi mila
        // to false return karenge
    }
}
```
# (LC)
```java

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
// TC --> O(n^2)
// space-->O(n)
        List<List<Integer>> ans = new ArrayList<>();
        // [-1, 0 , 1, 2, -1, -4]
        Arrays.sort(nums);
        // [-4, -1, -1, 0, 1, 2]
        //  0    1   2   3  4  5

        // [0, 0, 0]

        // [1,2,0,1,0,0,0,0]-->
        //  [0, 0, 0, 0, 0, 1, 1, 2]
        //  0  1  2   3  4  5  6  7
        for (int i = 0; i < nums.length - 2; i++) {
// i --> 0 , i < nums.length - 2 --> i < 4; i++
// i --> 1 , i < 4

// i = 0 

// i = 0 --> i < 6 -->
// i = 1 --> i < 6 --> skip till 5
// i = 5 --> i < 6 -->
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int l = i + 1, r = nums.length - 1;
        // l = 1, r = 5 
        // l = 2, r = 5
        // l = 1, r = 2

// l = 1 , r = 2

// l = 1, r = 7
// l = 
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
// sum = -4 + -1 + 2 = -1 
// s = -4 + 0 + 2 = -2
// s = -4 + 1 + 2 = -1

// at i = 1
// s = -1 + -1 + 2(l = 2 , r =5)
// s = -1 + 0 + 1(l = 3, r = 4)

// at i = 2 ( l = 3, r = 5)
// s = -1 + 0 + 2 = -1 --> l = 4
// s = -1 + 1 + 2 = 2 --> r = 4

// i = 3 ( l =4, r = 5)
// s = 0 + 1 + 2 = 3 --> (r = 4)


// s =  0 + 0 + 0 = 0
//  [0, 0, 0, 0, 0, 1, 1, 2]
//  0  1  2   3  4  5  6  7
// s = 2(l --> 1, r = 7) > 0 --> r-- -->6
// s = 0 (0, 1, 4)
// s = 0 (0, 2, 3)
                if (sum < 0) l++;
                // l = 2 --> 3 --> 4 --
                // l = 4
                else if (sum > 0) r--;
// jb sum 0 mil jae 
                else {
                    ans.add(Arrays.asList(nums[i], nums[l], nums[r]));
            
                    // -1,-1, 2
                    // -1, 0, 1

                    // (0,0,0)-->0, 1, 4
                    l++; // 3 // 2 
                    // l = 2
                    r--; // 4 // 1
                    // r = 3

                    while (l < r && nums[l] == nums[l - 1]) l++;
                    // 1 < 4 --> l --> 
                     while (l < r && nums[r] == nums[r + 1]) r--;
                }
            }
        }

        return ans;
    }
}
```

# 29. Trapping Rain Water
```java
class Solution {
public int trap(int[] height) {
    // 0, 1, 0, 2, 1, 0, 3, 2, 1, 2, 1
    int left = 0;
    int right = height.length -1;// 10
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

```

# 30) a.Chocolate Distribution Problem
```java
class Solution {
    public int findMinDiff(int arr[], int m) {

        int n = arr.length;
        // 7
        // Agar students packets se zyada hain
        if(m > n) {
            return 0;
        }

        // Sort array
        Arrays.sort(arr);
        // 2,3,4,7, 9, 12, 56
        int ans = Integer.MAX_VALUE;
        // 60
        // Window size = m
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
```


# b). Distribute Candies to People
```java
class Solution {
    public int[] distributeCandies(int candies, int num_people) {
    // logic is candies < num_people se to return  krna nothing;
    // int i = 0; 
    // then we are taking an loop inside that 
    // current m se candies add on krenge current m se candies subtract krenge jb tk candies 0 se bda hoga 
// Input: candies = 7, num_people = 4
// Output: [1,2,3,1]
      int[] ans = new int[num_people];
// [0, 0, 0, 0]
        int give = 1;
        int i = 0;

        // candies khatam hone tak distribute karenge
    while(candies > 0) {

            // jitni candies deni hain
            // agar available candies kam hain to remaining de denge
            int current = Math.min(give, candies);
// c = min(1, 7);
// c = (2, 6);
// c = (3, 4);
// c = min(4, 1); 
            ans[i] += current;
// ans[i] += 1 --> ans[0] = 1
// ans[i] += 2 --> ans[1] = 2
// ans[i] += 3 --> ans[2] = 3
// ans[i] += 1 --> ans[3] = 1
            candies -= current;
// c = 7 - 1 = 6
// c = 6 - 2 = 4
// c = 4 - 3 = 1
            // next person
            i = (i + 1) % num_people;
// i = 2;
// i = 3;

            give++;
// 2
// 3
// 4
        }

        return ans;
        // 
    }
}
```

# Smallest Subarray Sum Greater Than x
```java
class Solution {
    public static int smallestSubWithSum(int x, int[] arr) {
        // logic is 
        int sum = 0;
        int left = 0;
        int ans = Integer.MAX_VALUE;
    // n = 6 
        for(int right = 0; right < arr.length; right++){
            sum += arr[right];
        // s = 1 + 4 + 45 + 6 = 56
        // 56 >= 51
            while(sum > x){
                // 56 - 1 = 55 
                ans = Math.min(ans, right - left + 1);
                // ans = min(ans, 4)--> 4
                // ans = min(ans, 3 - 1 + 1) --> min(ans, 3);
                // ans = min(ans, 3 - 2 + 1) --> min(3, 2);
                
                sum -= arr[left];
                // sum = 56 - 1 = 55;
                left++;
                // 1
                // 
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}

```

# --------(Matrix)--------

# 1. Search in a 2D matrix
```java
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // TC: matrix = [[1,3,5],[7,9,11]], target = 9
        // Total elements = 2 * 3 = 6, valid indexes = 0 to 5

        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = rows * cols - 1; // left = 0, right = 5

        // Binary search poori matrix ko ek sorted array ki tarah treat karega
        while (left <= right) {
            int mid = left + (right - left) / 2;
            // First iteration: mid = 0 + (5 - 0) / 2 = 2

            int row = mid / cols;
            int col = mid % cols;
            // mid = 2: row = 2 / 3 = 0, col = 2 % 3 = 2
            // matrix[0][2] = 5

            // Target mil gaya toh true return kar denge
            if (matrix[row][col] == target) {
                return true;
            }

            // Current element chhota hai, toh right side search karenge
            else if (matrix[row][col] < target) {
                left = mid + 1;
                // 5 < 9, isliye left = 2 + 1 = 3
            }

            // Current element bada hai, toh left side search karenge
            else {
                right = mid - 1;
            }

            // Second iteration: left = 3, right = 5
            // mid = 4, row = 4 / 3 = 1, col = 4 % 3 = 1
            // matrix[1][1] = 9, target mil gaya, return true
        }

        return false; // Target poori matrix mein nahi mila
    }
}

```
