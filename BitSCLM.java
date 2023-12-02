import java.util.*;
public class BitSCLM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int N = sc.nextInt();
        int count = 0, firstSetBitPos = -1, lastSetBitPos = 1, pos = 0;
        

        while (N > 0) {
            if ((N & 1) == 1) {
                count++;

                if (firstSetBitPos == -1) {
                    firstSetBitPos = (pos == 0) ? pos : count;
                }

                lastSetBitPos = pos;
            }
            N >>=1;
            pos++;
        }

        System.out.println(count + "#" + firstSetBitPos + "#" + lastSetBitPos);
    }
}