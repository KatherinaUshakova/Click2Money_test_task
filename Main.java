
public class Main {
    public static void main(String[] args) {
        Main.fib(20);
    }

    public static void fib(int iterationCount) {
        int prevNum = 0;
        int currentNum = 1;
        int nextNum;

        for (int i = 0; i < iterationCount; i++) {
            System.out.println(currentNum);

            nextNum =+ currentNum + prevNum;
            prevNum = currentNum;
            currentNum = nextNum;
        }
    }
}
