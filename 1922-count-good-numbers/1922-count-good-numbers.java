class Solution {
    public static final long MOD=1000000007;
    public int countGoodNumbers(long n) {
        long even=(n+1)/2;
        long odd=n/2;
       
        long result=power(5,even);
        result=(result*power(4,odd))%MOD;
        return (int)result;
    }
    public static int power(long x,long n){
        long ans=1;
        long nn=n;
        while(nn>0){
            if(nn%2==1){
                ans=(ans*x)%MOD;
                nn=nn-1;
            }else{
                x=(x*x)%MOD;
                nn=nn/2;
            }
        }
        return (int)ans;
    }
}