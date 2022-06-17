public class FactorialTrailing{
    public static  int tz(int n){
        int  ans=0;
        int p = 5;
        while((n/p)>0){
           ans += (n/p);
           p = p*5;

        }
        return ans;
    }
    public static void main(String[] args) {
        int res=tz(100);
        System.out.println(res);
    }
    
    //https://www.youtube.com/watch?v=fx8rUY_iIms&t=620s
    //https://leetcode.com/dhrubarajroy123/
}
