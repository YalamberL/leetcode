class Solution {
    public int fib(int n) {
        // topdown - memoization
        Map<Integer, Integer> memo = new HashMap<>();
        memo.put(0, 0);
        memo.put(1, 1);
        return f(n, memo);
    }

    private int f(int x, Map<Integer, Integer> memo){
        if (memo.containsKey(x)){
            return memo.get(x);
        }

        int res = f(x - 1, memo) + f(x - 2, memo);
        memo.put(x, res);
        return res;
    }
}