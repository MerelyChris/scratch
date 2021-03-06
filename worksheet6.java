public class worksheet6{
    public static void main(String[] args){
        int[] ia = new int[]{1,2,3,4,5};
        System.out.println(arrSum(ia));
    }
    public static int arrSum(int[] n){
        if(n.length == 1){
            return n[0];
        }
        int last = n[n.length-1];
        int[] replace = new int[n.length-1];
        for(int i=0; i<replace.length; i++){
            replace[i] = n[i];
        }
        return last + arrSum(replace); 
    }
}