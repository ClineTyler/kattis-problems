import java.util.*;

public class oddman {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int numCases = inp.nextInt();

        for (int cases = 0; cases < numCases; cases++) {
            int out = 0;
            int totalGuests = inp.nextInt();
            int[] ids = new int[totalGuests];

            for (int i = 0; i < totalGuests; i++) {
                ids[i] = inp.nextInt();
            }
            for (int test : ids) {
                int num = 0;
                for (int elem : ids) {
                    if (test == elem) {
                        num++;
                    }
                }
                if (num == 1) {
                    out = test;
                    break;
                }
            }
            System.out.printf("Case #%d: %d%n", (cases + 1), out);
        }
        inp.close();
    }
}