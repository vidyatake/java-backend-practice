import java.util.*;

public class TreesetPractice {
    public static void main(String[] args)
    {
        List<Integer> nums=Arrays.asList(1,43,287,90,54);

        Set<Integer> numbers= new TreeSet<>(nums);

        System.out.println("LargestNumber " + ((TreeSet<Integer>) numbers).last());
    }
}