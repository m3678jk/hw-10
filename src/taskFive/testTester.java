package taskFive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class testTester {
    public static void main(String[] args) {
        //Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        Supplier<Stream<Object>> streamSupplier = () -> Stream.of(list);

        long l = list.stream()
                .count();
        System.out.println(l);
        //
        long lSupplierStream = streamSupplier.get()
                //.map(inner -> inner.toString())
                //.flatMap(Arrays::asList)
                .peek(System.out::println)

                .count();
        System.out.println(lSupplierStream);
    }
}
