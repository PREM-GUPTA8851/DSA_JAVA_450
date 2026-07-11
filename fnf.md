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
