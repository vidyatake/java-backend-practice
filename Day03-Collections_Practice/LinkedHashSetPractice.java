import java.util.*;

public class LinkedHashSetPractice {

    public static void main(String[] args)

    {
        List<Integer> numbers=new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);

        Set<Integer> nums=new LinkedHashSet<>(numbers);
        List<Integer> uniqueNumbers=new LinkedList<>(nums);
        System.out.println(uniqueNumbers);

    }
}