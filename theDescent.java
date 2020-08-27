import java.util.*;
import java.io.*;
import java.math.*;

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        while (true) {
            int targetMountain = 0;
            int currentHeight = 0;
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt();
                if (mountainH > currentHeight) {
                    currentHeight = mountainH;
                    targetMountain = i;
                }
            }

            System.out.println(targetMountain);
        }
    }
}