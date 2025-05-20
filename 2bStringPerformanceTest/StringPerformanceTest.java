package prgm2;

public class StringPerformanceTest {
    public static void main(String[] args) {
        final int ITERATIONS = 10000;
        String appendStr = "AIET";

        // StringBuffer Test (Thread-safe, slower)
        StringBuffer stringBuffer = new StringBuffer();
        long startTimeBuffer = System.nanoTime();
        for (int i = 0; i < ITERATIONS; i++) {
            stringBuffer.append(appendStr);
        }
        long endTimeBuffer = System.nanoTime();
        long durationBuffer = endTimeBuffer - startTimeBuffer;
        System.out.println("Time taken by StringBuffer: " + durationBuffer + " nanoseconds");

        // StringBuilder Test (Non-thread-safe, faster)
        StringBuilder stringBuilder = new StringBuilder();
        long startTimeBuilder = System.nanoTime();
        for (int i = 0; i < ITERATIONS; i++) {
            stringBuilder.append(appendStr);
        }
        long endTimeBuilder = System.nanoTime();
        long durationBuilder = endTimeBuilder - startTimeBuilder;
        System.out.println("Time taken by StringBuilder: " + durationBuilder + " nanoseconds");

        // Justification
        if (durationBuilder < durationBuffer) {
            System.out.println("\nStringBuilder is faster and more efficient for single-threaded operations.");
        } else {
            System.out.println("\nStringBuffer is slower due to thread-safety (synchronized methods).");
        }
    }
}
