package LongestCollatzSequence;

import java.util.LinkedList;
import java.util.List;

public class App 
{
    public static void main(String[] args)
    {
        List<Long> chain = new LinkedList<>();
        long max_length = 0;
        int max_start = 0;
        for(int j = 10; j <= 1000000; j++) {
            System.out.print(j + " -> ");
            long start = j;
            while (start != 1) {
                if (start % 2 == 0) {
                    start /= 2;
                    chain.add(start);
                    System.out.print(start);
                    if(start != 1) System.out.print(" -> ");
                } else {
                    start = (3 * start) + 1;
                    chain.add(start);
                    System.out.print(start);
                    if(start != 1) System.out.print(" -> ");
                }
            }
            if(chain.size() > max_length) {
                max_length = chain.size();
                max_start = j;
            }
            chain.clear();
            System.out.println();
        }
        // Answer: 837799 with chain size: 524
        System.out.println("Answer: " + max_start + " with chain size: " + max_length);
    }
}
