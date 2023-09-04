

public class Main {

    public static void main(String[] args) {
        try {
            checkScore(2.15);
            checkScore(50);
            checkScore(95.02);
            checkScore(100.01);

        } catch (ArithmeticException a) {
            System.out.println(a.getMessage());
        }
    }
    public static void checkScore(double score) {
        if (0 < score && score <= 50.00) {
            System.out.println("Average score");
        } else if (50.00 < score && score <= 100.00) {
            System.out.println("Very good score");
        } else {
            throw new ArithmeticException("Score is out of scale!");
        }
    }
}


