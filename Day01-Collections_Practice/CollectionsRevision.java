import java.util.*;

public class CollectionsRevision {
    public static void main(String[] args)
    {
        List<String> fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Watermellon");

        for(String fruit : fruits)
        {
            System.out.println(fruit);
        }
    }
}