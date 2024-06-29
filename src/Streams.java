import java.util.stream.LongStream;

public class Streams {

    void getArithmeticProgressSum(){
        int a = 10000000;
        int b = 1000000000;
        LongStream stream = LongStream.range(a, b);
        long c = stream.sum();
        System.out.println(c);
    }
}
