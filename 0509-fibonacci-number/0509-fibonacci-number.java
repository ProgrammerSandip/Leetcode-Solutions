class Solution {
    public int fib(int n) {
        // For Loop method
        if (n == 0) return 0;
        if (n == 1) return 1;

        int first = 0;
        int second = 1;
        int current = 0;

        for (int i = 2; i <= n; i++) {
            current = first + second;
            first = second;
            second = current;
        }

        return current;
    }

    /* Recursion method
    public int fib(int n) {
        return f(n);
    }
    int f(int n)
    {
        if(n <= 1)
        {
            return n;
        }
        return f(n-1) + f(n-2);
    }
    */
}