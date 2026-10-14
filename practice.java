class Solution {
    public int findPairs(int[] nums, int k) {

        if (k < 0) return 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        // Frequency store karo
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int count = 0;

        for (int num : map.keySet()) {

            // k = 0 -> frequency >= 2 honi chahiye
            if (k == 0) {
                if (map.get(num) > 1) count++;
            }
            // k > 0 -> num + k exist karta ho
            else {
                if (map.containsKey(num + k)) count++;
            }
        }

        return count;
    }
}
