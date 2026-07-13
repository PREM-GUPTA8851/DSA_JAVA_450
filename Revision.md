# 1.Wap to reverse an array

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

# 10. Merge Sorted Array
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


Merge without extra space
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
