import java.util.*;

public class LargestNumberList {

    public static void main(String[] args)
    {
        List<Integer> numbers=new ArrayList<>();

        numbers.add(1);
        numbers.add(76);
        numbers.add(55);
        numbers.add(65);
        numbers.add(87);

        int largeNum=numbers.get(0);
        for(Integer num :numbers)
        {
            if(num>largeNum)
            {
                largeNum=num;
            }

        }
        System.out.println(largeNum);
    }
}