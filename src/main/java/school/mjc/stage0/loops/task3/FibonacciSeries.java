package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int a=0;
        int b=1;
        int c=1;
        for (int i = 0; i <lastFibonacci ; i++) {
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}
