// revision :-- 


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
