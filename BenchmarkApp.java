
import java.lang.Math;

public class BenchmarkApp {
        public static void main(String args[]) {
                simpleMathLoop();
        }

        private void simpleMathLoop() {
                long startTime = System.nanoTime();
                int loops = 10000000;
                System.out.println(String.format("Benchmark started with %,d loops at [%,d]", loops, startTime));        
                for(int i=0;i<loops;i++) {
                        Math.random()*Math.PI;
                }
                long endTime = System.nanoTime();
                System.out.println(String.format("Benchmark ended at [%,d]", endTime));
                System.out.println(String.format("Duration=[%,d] ns", endTime-startTime));
                System.out.println(String.format("Duration=[%,d] mis", (endTime-startTime)/1000));
                System.out.println(String.format("Duration=[%,d] ms", (endTime-startTime)/1000000));
        }
}
