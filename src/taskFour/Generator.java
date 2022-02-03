package taskFour;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Generator {
    public Stream<Long> generator(long seed, long c, long m){
        long a = 25214903917L;
        Stream<Long> result =
                Stream.iterate(seed, x -> ((a * x + c) % m));
        return result;
    }
}

class TestGenerator{
    public static void main(String[] args) {
        Generator gen = new Generator();
        List<Long> list = gen.generator(0L, 11L, (long)Math.pow(2,48))
                .limit(10)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
