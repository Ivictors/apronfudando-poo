package streamss.teste;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsTeste01 {
    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(1,2,3,4,5);

        Stream<Integer> stream = list.stream();
        Stream<Integer> integerStream = stream.map(x -> x * 10);
        Stream<Integer> iterate = Stream.iterate(0, x -> x + 2);
        System.out.println(Arrays.toString(iterate.limit(10).toArray()));

        List<Integer> collect = list.stream().filter(x -> x % 2 == 0).map(x -> x * 10).collect(Collectors.toList());

        System.out.println(Arrays.toString(collect.toArray()));
    }
}
