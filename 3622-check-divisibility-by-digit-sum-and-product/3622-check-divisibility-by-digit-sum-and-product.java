class Solution {
    public boolean checkDivisibility(int n) {
        int original = n;
        int sum = 0;
        int product = 1;

        while(n > 0)
        {
            int digit = n % 10; //digit = last digit of n

            sum += digit; //add digit to sum
            product *= digit; //multiply digit into product

            n = n / 10; //remove last digit from n
        }
        int total = sum + product;
        return original % total == 0; //check original % total
    }
}