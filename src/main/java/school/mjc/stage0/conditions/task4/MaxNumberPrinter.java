package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int fourth;
        fourth = first > second ? first : second;
        fourth = fourth > third ? fourth: third;
        System.out.println(fourth);

    }
}
