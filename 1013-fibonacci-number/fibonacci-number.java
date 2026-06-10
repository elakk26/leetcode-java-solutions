class Solution {
 //   static int a=0,b=1;
    public int fib(int n) {
        int ans=fibo(n);
        return ans;
    }
    public int fibo(int n)
    {
        if(n<=1)
        return n;

        return fibo(n-1)+fibo(n-2);
    }
}