package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {
    public static void main(String[] args) {
         // create a List and Filter all even numbers
         List<Integer> list1 = List.of(2,4,17,21);

         List<Integer> list2 = new ArrayList<>();
         list2.add(12);
         list2.add(34);
         list2.add(23);
         list2.add(78);

         List<Integer> list3 = Arrays.asList(23, 567, 12, 677, 24);
         //list.add(9);


        List<Integer> listEven = new ArrayList<>();

        for(Integer i: list1) {
            if(i%2 == 0) {
                listEven.add(i);
            }
        }

        System.out.println("list1 "+list1);
        System.out.println("list2 "+listEven);

        // using stream
        Stream<Integer> stream = list1.stream();
        List<Integer> newList = stream.filter(i-> i%2 == 0).collect(Collectors.toList());
        System.out.println("new list "+newList);

        List<Integer> newList1 = list1.stream().filter(i-> i>10).collect(Collectors.toList());
        System.out.println("new list 1 "+newList1);

    }
}
