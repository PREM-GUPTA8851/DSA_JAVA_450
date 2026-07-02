// revision :-- 

// WAFP for reverse an array 
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
