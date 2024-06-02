package StreamApi;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        Stream<Object> emptyStream = Stream.empty();
        System.out.println("before ");
        emptyStream.forEach(item -> {
            System.out.println("item "+item);
        });

        String names[] = {"Durgesh","Uttam","Ankit"};

        Stream<String> stream = Stream.of(names);
        stream.forEach(item->{
            System.out.println("print "+item);
        });

        Stream<Object> streamBuilder = Stream.builder().build();

        IntStream stream1 = Arrays.stream(new int[]{2,4,6});
        stream1.forEach(item->{
            System.out.println("print "+item);
        });

    }
}
