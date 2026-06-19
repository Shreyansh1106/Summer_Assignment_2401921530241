class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int ans[]=new int[n];
        Stack<Integer> temp=new Stack<>();
        for (int i=0;i<n;i++) {
            while (!temp.isEmpty() && temperatures[i]>temperatures[temp.peek()]) {
                int a=temp.pop();
                ans[a]=i-a;
            }
            temp.push(i);
        }
        return ans;
    }
}
