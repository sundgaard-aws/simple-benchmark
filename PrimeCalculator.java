public class PrimeCalculator {
    public long longMax; // The maximum integer range to seach
    public long primeMax; // The maximum prime found
    public long primeCount; // The number of primes found
    //public long jobCount; // The number of jobs done so far

    public static void main(String[] a) {
        long max = 100000; // Default integer range to search
        long interval = 1; // Default monitoring interval in seconds
        if (a.length>0) max = Long.parseLong(a[0]);
        if (a.length>1) interval = Long.parseLong(a[1]);
        System.out.println("Integer range to search: "+max);

        PrimeCalculator primeCalculator = new PrimeCalculator(max);
        long startTime = System.nanoTime();
        primeCalculator.findPrimeNumbers();      
        long endTime = System.nanoTime();
        System.out.println(String.format("Prime numbers found [%,d]", primeCalculator.primeCount));
        System.out.println(String.format("Max prime number found [%,d]", primeCalculator.primeMax));
        System.out.println(String.format("Benchmark ended at [%,d]", endTime));
        System.out.println(String.format("Duration=[%,d] ns", endTime-startTime));
        System.out.println(String.format("Duration=[%,d] mis", (endTime-startTime)/1000));
        System.out.println(String.format("Duration=[%,d] ms", (endTime-startTime)/1000000));
    }

    public PrimeCalculator(long max) {
        longMax = max;
        primeCount = 0;
        primeMax = 0;
    }

    public void findPrimeNumbers() {
        long count = 0;
        long max = 0;
        for (long i=3; i<=longMax; i++) {
            boolean isPrime = true;
            for (long j=2; j<=i/2 && isPrime; j++) {
                isPrime = i % j > 0;
            }
            if (isPrime) {
                count++;
                max = i;
            }
        }
        primeCount = count;
        primeMax = max;
    }
}