import java.util.*;

public class scratch{
    public static void main(String[] args){
        LinkedList<Integer> ll = new LinkedList<>();
        for(int i=1; i<=10; i++)
            ll.add(i);
        System.out.println(recsum(ll));     
    }
    public static int recsum(LinkedList<Integer> ll){
        if(ll.size() == 0){
            return 0;
        }
        int lastval = ll.removeLast();
        int total = recsum(ll) + lastval;
        ll.add(lastval);
        return total;
    }
}