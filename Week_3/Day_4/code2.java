class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> num = new Stack<>();
        for (String t : tokens) {
            if (t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")) {
                int b=num.pop();
                int a=num.pop();
                if (t.equals("+")) num.push(a + b);
                else if (t.equals("-")) num.push(a - b);
                else if (t.equals("*")) num.push(a * b);
                else num.push(a / b); 
            } 
            else {
                num.push(Integer.parseInt(t));
            }
        }
        return num.pop();
    }
}
