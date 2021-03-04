public class recursionEx{
    public static void main(String[] args){
        //System.out.println(myPow(2, 6));
        //System.out.println(myPow(3, 4));
        //System.out.println(fib(5));
        for (int i=0; i<10; i++){
            System.out.print(fib(i) + " ");
        }
    }
    public static int myPow(int a, int b){
        if(b < 0)
            throw new IllegalArgumentException("n must be >0");
        if(b==0) 
            return 1;
        return a * myPow(a, b-1);
    }
    public static int fib(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        int fn = fib(n-1) + fib(n-2);
        return fn;
    }
}