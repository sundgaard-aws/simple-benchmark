
import java.lang.Math;

public class BenchmarkApp {
public static void main(String args[]) {
        long startTime = System.nanoTime();
        System.out.println(String.format("Benchmark started at [%s]", startTime));
        int loops = 100000;
        for(int i=0;i<loops;i++) {
                Math.random();
        }
        long endTime = System.nanoTime();
        System.out.println(String.format("Benchmark ended at [%s]", endTime));
        System.out.print(String.format("Duration=[%s] ns", endTime-startTime));

}
}
