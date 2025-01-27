//Product Pair

import java.util.*;

class ProductPair {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println(0);
            sc.close();
            return;
        }
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int R0 = 0, R1 = 0, R2 = 0;

        // Count elements based on remainder when divided by 3
        for (int i = 0; i < n; i++) {
            if (arr[i] % 3 == 0) {
                R0++;
            } else if (arr[i] % 3 == 1) {
                R1++;
            } else {
                R2++;
            }
        }

        int pairCount = 0;

        // Count pairs within R0 group
        pairCount += (R0 * (R0 - 1)) / 2;

        // Count pairs between R0 and R1, R0 and R2
        pairCount += R0 * R1;
        pairCount += R0 * R2;

        // Count pairs between R1 and R2
        pairCount += R1 * R2;

        System.out.println(pairCount);
        
        sc.close();  // Close the scanner
    }
}
