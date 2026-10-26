import java.util.*;

class Solution {
    Map<Long, Integer> dp = new HashMap<>();

    public int integerReplacement(int n) {
        return solve((long) n);
    }

    private int solve(long n) {
        if (n == 1) {
            return 0;
        }

        if (dp.containsKey(n)) {
            return dp.get(n);
        }

        int ans;

        if (n % 2 == 0) {
            ans = 1 + solve(n / 2);
        } else {
            ans = 1 + Math.min(solve(n - 1), solve(n + 1));
        }

        dp.put(n, ans);
        return ans;
    }
}
