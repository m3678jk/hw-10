package taskFive;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Mixer {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> list1 = first.collect(Collectors.toList());
        List<T> list2 = second.collect(Collectors.toList());
        int min = Math.min(list1.size(), list2.size());
        List<T> result = new ArrayList<T>();
        for (int i = 0; i < min; i++) {
            result.add(list1.get(i));
            result.add(list2.get(i));

        }

        return result.stream().limit(min * 2);
    }
}

class MixerTest {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 7);
        Stream<Integer> stream2 = Stream.of(7, 8, 9, 10, 11, 12);
       long l = Mixer.zip(stream1, stream2)
               .peek(System.out::println)
               .count();

    }
}

