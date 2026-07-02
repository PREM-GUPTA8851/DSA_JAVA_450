class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        // Extra iteration (i == n) sirf stack ko empty karne ke liye
        for (int i = 0; i <= n; i++) {

            // Last iteration me height = 0 maan lo
            int currHeight = (i == n) ? 0 : heights[i];

            // Jab current bar chhoti ho jaye
            while (!stack.isEmpty() && currHeight < heights[stack.peek()]) {

                // Jis bar ko pop kiya usi ko rectangle ki height maanenge
                int height = heights[stack.pop()];

                int width;

                // Agar stack empty ho gaya
                // Matlab left me koi smaller nahi mila
                if (stack.isEmpty()) {
                    width = i;
                }
                // Left smaller = stack.peek()
                // Right smaller = i
                else {
                    width = i - stack.peek() - 1;
                }

                // Rectangle Area
                maxArea = Math.max(maxArea, height * width);
            }

            // Current index ko stack me daal do
            stack.push(i);
        }
        return maxArea;
    }
}