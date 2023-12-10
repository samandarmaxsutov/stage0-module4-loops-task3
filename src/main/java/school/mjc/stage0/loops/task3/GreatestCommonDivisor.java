package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {//30 25
        while (second!= 0) {//25!=0//5!=0
            int remainder = first % second; //=30%25=5//25%5=0
            first = second;//=25//5
            second = remainder;//5//0
        }
        System.out.println(first);//5
    }
}
