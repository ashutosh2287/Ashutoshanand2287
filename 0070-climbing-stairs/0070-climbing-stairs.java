class Solution {
    public int climbStairs(int n) {
        if(n==1) return 1;
        if(n==2) return 2;

        int f=1;
        int s=2;
        int result=0;

        for(int i=3;i<=n;i++){
            result=f+s;
            f=s;
            s=result;
        }
        return result;
    }
}