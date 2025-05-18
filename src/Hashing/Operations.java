package Hashing;
import java.util.HashSet;
import java.util.Iterator;
public class Operations {
    public static void main(String[] args) {
//        creating
        HashSet<Integer> set= new HashSet<>();
//        adding elements
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
//      checking the size of Set
        System.out.println("Size of set is " + set.size());

//       checking if element contains
        if(set.contains(1)){
            System.out.println("Value exists");
        }
        if(!set.contains(6)){
            System.out.println("Does not exists");
        }

//      Print all elements
            System.out.println(set);

//      Iterator to iterate the value in set we need to import its package
        Iterator it= set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

//      Deletion of elements
        set.remove(1);
        if (!set.contains(1)){
            System.out.println("el removed");
        }
    }
}
