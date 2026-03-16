import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args)
    {
        List<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(6);
        numbers.add(1);


        Set<Integer> nums=new HashSet<>(numbers);

        List<Integer> uniqueNumbers=new ArrayList<>(nums);
            System.out.println(uniqueNumbers);
    }
}