import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String champion = null;
        double count = 0;
        while (!StdIn.isEmpty()) {
            if (champion == null) {
                count++;
                champion = StdIn.readString();
            }
            else {
                count++;
                if (StdRandom.bernoulli(1.0 / count)) {
                    champion = StdIn.readString();
                }
                else {
                    StdIn.readString();
                }
            }
        }
        System.out.println(champion);
    }
}
