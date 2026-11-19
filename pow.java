
public class pow {
    public static void main(String[] args) {
        Solution solution = new Solution();
        double x = 2.0;
        int n = 10;
        double result = solution.myPow(x, n);
        System.out.println(x + " raised to the power of " + n + " is: " + result);
    }   
}
class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        double result = 1.0;
        while (n > 0) {
            if (n % 2 == 1) {
                result *= x;
            }
            x *= x;
            n /= 2;
        }
        return result;
    }
        }