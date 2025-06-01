/** Implement a function that receives an array of integers and returns the maximum sum of any slice (contiguous subarray) */
public class KadaneAlgorithm {
    public int solution(int[] A) {
        int maxEnding = A[0], maxSlice = A[0];
        for (int i = 1; i < A.length; i++) {
            maxEnding = Math.max(A[i], maxEnding + A[i]);
            maxSlice = Math.max(maxSlice, maxEnding);
        }
        return maxSlice;
    }

    public static void main(String[] args) {
        KadaneAlgorithm kadaneAlgorithm = new KadaneAlgorithm();
        System.out.println(kadaneAlgorithm.solution(new int[]{1, 2, 3, 4, 5}));
    }
}

