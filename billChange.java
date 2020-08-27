public class Change {
    long coin2 = 0;
    long bill5 = 0;
    long bill10 = 0;
}

class Solution {

    static Change optimalChange(long changeDue) {
        long NbrOfBill10 = 0;
        long NbrOfBill5 = 0;
        long NbrOfCoin2 = 0;

        long remaining = changeDue;

        NbrOfBill10 = Math.round(remaining / 10);
        remaining = remaining % 10;

        NbrOfBill5 = Math.round(remaining / 5);
        remaining = remaining % 5;

        if (remaining < 2) {
            remaining = (NbrOfBill5 * 5) + 1;
            if (remaining % 2 == 0) {
                NbrOfBill5 = 0;
                NbrOfCoin2 = Math.round(remaining / 2);
            }
        } else {
            NbrOfCoin2 = Math.round(remaining / 2);
        }
        remaining = remaining % 2;

        if (remaining != 0)
            return null;

        Change change = new Change();
        change.coin2 = NbrOfCoin2;
        change.bill5 = NbrOfBill5;
        change.bill10 = NbrOfBill10;
        return change;
    }
}