import java.util.*;

public class SetRevision {

    public static void main(String[] args)
    {
        Set<Integer> numbers=new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);


        for(Integer num:numbers)
        {
            System.out.println(num);
        }
    }
}