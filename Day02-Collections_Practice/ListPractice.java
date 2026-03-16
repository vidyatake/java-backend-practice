import java.util.*;

public class ListPractice {

    public static void main(String[] args)
    {
        List<Integer> num=new ArrayList<>();
        num.add(1);
        num.add(23);
        num.add(765);
        num.add(5);
        int totalValue=0;
        for(Integer sum :num)
        {
            totalValue+=sum;
        }

        System.out.println(totalValue);
    }
}