import java.util.*;

public class scratch{
    public static void main(String[] args){
        HashSet<String> hs = new HashSet<>();
        hs.add("Alice");
        hs.add("Bob");
        hs.add("Eve");
        System.out.println(hs);
        for (int i=0; i<10; i++){
            hs.add(String.valueOf(i));
        }
        System.out.println(hs);
        System.out.println(hs.add("Alice"));
        System.out.println(hs.contains("alice"));
        System.out.println(hs.contains("Alice"));

        for (String s: hs){
            System.out.print(s + " ");
        }
        System.out.println();
        
        HashMap<String, Integer> mygrades = new HashMap<>();
        // mygrades.put(Scanner.next() + Scanner.next())
        mygrades.put("wksheet1", 8);
        mygrades.put("quiz1", 10);
        System.out.println(mygrades.get("quiz1"));
        System.out.println(mygrades);
        mygrades.containsKey("wksheet1");
        for (String key: mygrades.keySet()){
            System.out.println(key + " " + mygrades.get(key));
        }
        System.out.println(mygrades.containsKey("exam1"));

        HashMap<String, HashSet<Integer>> mymap = new HashMap<>();
        HashMap<String, HashMap<String, Integer>> gradebook = new HashMap<>();
        gradebook.put("Alice", new HashMap<>());
        gradebook.get("Alice").put("lab0", 5);
    }
}