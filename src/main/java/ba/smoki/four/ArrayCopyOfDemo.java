package ba.smoki.four;

import java.util.Arrays;

public class ArrayCopyOfDemo {
    static void main(String[] args) {
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 't', 'i', 'n', 'e', 'r'};
        //char[] copyTo = new char[8];
        //System.arraycopy(copyFrom, 2, copyTo, 0, copyTo.length);    //8 ili length (dužina)
        char[] copyTo = Arrays.copyOfRange(copyFrom, 2, 10);
        System.out.println(copyTo);
    }
}
