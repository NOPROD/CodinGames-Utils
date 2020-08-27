public class change {
    long coin2 = 0;
    long bill5 = 0;
    long bill10 = 0;
}

class Solution {
    static change optimalChange(long s) {
        change c = new change();
        if (s >= 10) {
            c.bill10 = s / 10;
            if (s % 10 >= 5) {
                c.bill5 = (s % 10) / 5;
                if ((s % 10) % 5 >= 2) {
                    c.coin2 = ((s % 10) % 5) / 2;
                }
            } else if (s % 10 >= 2) {
                c.coin2 = (s % 10) / 2;
            }
        } else if (s >= 5 && s < 10) {
            c.bill5 = s / 5;
            if (s % 5 >= 2) {
                c.coin2 = (s % 5) / 2;
            }
        } else if (s > 2 && s < 5) {
            c.coin2 = s / 2;
        }
        return c;
    }
}