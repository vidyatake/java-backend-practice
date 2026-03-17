import java.util.*;

public class LinkedListPractice {

    public static void main(String[] args)

    {
        List<Integer> numbers=new LinkedList<>();
         numbers.add(10);
         numbers.add(76);
         numbers.add(54);
         numbers.add(98);

         int totalValue=0;
         for(Integer num :numbers)
         {
             totalValue+=num;
         }

         System.out.println(totalValue);
    }

}