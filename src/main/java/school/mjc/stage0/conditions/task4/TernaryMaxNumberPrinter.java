package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int fourth;
        fourth = first > second ? first : second;
        System.out.println(fourth > third ? fourth: third);
    }
}
