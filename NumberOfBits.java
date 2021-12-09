import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * LeetCode 191. Number of 1 Bits
 * https://leetcode.com/problems/number-of-1-bits/
 */
public class NumberOfBits {


    /**
     * Given an unsigned integer return the number of '1' bits it has.
     */
    static public int hammingWeight(int n) {
        
        // **** initialization ****
        int cnt = 0;

        // **** traverse the binary representation of n - O(32) ****
        for (int i = 0; i < 32; i++) {

            // **** increment counter (if needed) ****
            if ((n & 1) == 1) cnt++;

            // **** shift n right ****
            n >>= 1;
        }

        // **** return count of 1s ****
        return cnt;
    }


    /**
     * Test scaffold
     * 
     * !!! NOT PART OF THE SOLUTION !!!
     * 
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        // **** open buffered reader ****
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // **** read the input line ****
        String s = br.readLine().trim();
        
        // **** close buffered reader ****
        br.close();

        // ???? ????
        System.out.println("main <<< s ==>" + s + "<==");

        // **** convert to integer ****
        int n = Integer.parseUnsignedInt(s, 2);

        // ???? ????
        System.out.println("main <<< n: " + n);

        // **** call the function of interest and display output ****
        System.out.println("main <<< output: " + hammingWeight(n));
    }

}