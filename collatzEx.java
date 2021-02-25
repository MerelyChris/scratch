public class collatzEx{
    public static void main(String[] args){
        System.out.print(collatz(2));
    }
    public static int collatz(int n){
        if(n == 1) return 0;
        int nextn;
        if(n%2 == 0)
            nextn = n/2;
        else
            nextn = 3*n+1;
        return 1 + collatz(nextn);
    }
}