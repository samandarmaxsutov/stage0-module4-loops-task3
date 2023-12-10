package school.mjc.stage0.loops.task3;

public class NinesSum {
    private int pow10(int i){//1
        int n=1;
        for (int j = 1; j <=i; j++) {
            n*=10;
        }
        return n;
    }
    public void calculateSum(int lengthOfLastNumber) {
        if (lengthOfLastNumber <= 0) {
            System.out.println(0);
            return;
        }

        int sum = 0;

        for (int i = 1; i <=lengthOfLastNumber; i++) {
           sum+=pow10(i)-1;
        }
        System.out.println(sum);
    }
}
