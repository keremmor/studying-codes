import java.time.Duration;
import java.time.Instant;

public class Main {

    public static void main(String[] args) {
        String[] nemo = new String[]{"nemo"};
        String[] everyone = new String[]{"nemo", "dory", "bruce", "marlin", "stewart",
                "squidward", "patrick", "mr.crab", "gill"};
        findNemo(everyone);
    }

    public static void findNemo(String[] nemo) {   //O(n)
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < nemo.length; i++) {
            if (nemo[i] == "nemo") {
                System.out.println("Found NEMO ! ");
            }
        }
        long endTime = System.currentTimeMillis();
        long estimatedTime = endTime - startTime;
        System.out.println("Call to findNemo took: " + estimatedTime + " miliseconds");
    }
}
