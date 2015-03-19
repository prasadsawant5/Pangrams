import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args)throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        String s;
        char[] arr;
        int[] ascii;
        int x = 65, i = 0, count = 0;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        s = br.readLine();
        s.toUpperCase();
        //System.out.println(s);
        arr = new char[s.length()];
        
        arr = s.toCharArray();
        
        for (char c : arr) {
            if (c != ' ') {
                i++;
            }
        }
        ascii = new int[i];
        
        i = 0;
        for (char c : arr) {
            if (c != ' ') {
                ascii[i] = (int) c;
                i++;
            }
        }
        
        Arrays.sort(ascii);
        
        ArrayList<Integer> intList = new ArrayList();
        
        for (int z : ascii) {
            intList.add(z);
        }
        
        if ((intList.contains(65)) || (intList.contains(97)))
            count++;
        
        if ((intList.contains(66)) || (intList.contains(98)))
            count++;
        
        if ((intList.contains(67)) || (intList.contains(99)))
            count++;
        
        if ((intList.contains(68)) || (intList.contains(100)))
            count++;
        
        if ((intList.contains(69)) || (intList.contains(101)))
            count++;
        
        if ((intList.contains(70)) || (intList.contains(102)))
            count++;
        
        if ((intList.contains(71)) || (intList.contains(103)))
            count++;
        
        if ((intList.contains(72)) || (intList.contains(104)))
            count++;
        
        if ((intList.contains(73)) || (intList.contains(105)))
            count++;
        
        if ((intList.contains(74)) || (intList.contains(106)))
            count++;
        
        if ((intList.contains(75)) || (intList.contains(107)))
            count++;
        
        if ((intList.contains(76)) || (intList.contains(108)))
            count++;
        
        if ((intList.contains(77)) || (intList.contains(109)))
            count++;
        
        if ((intList.contains(78)) || (intList.contains(110)))
            count++;
        
        if ((intList.contains(79)) || (intList.contains(111)))
            count++;
        
        if ((intList.contains(80)) || (intList.contains(112)))
            count++;
        
        if ((intList.contains(81)) || (intList.contains(113)))
            count++;
        
        if ((intList.contains(82)) || (intList.contains(114)))
            count++;
        
        if ((intList.contains(83)) || (intList.contains(115)))
            count++;
        
        if ((intList.contains(84)) || (intList.contains(116)))
            count++;
        
        if ((intList.contains(85)) || (intList.contains(117)))
            count++;
        
        if ((intList.contains(86)) || (intList.contains(118)))
            count++;
        
        if ((intList.contains(87)) || (intList.contains(119)))
            count++;
        
        if ((intList.contains(88)) || (intList.contains(120)))
            count++;
        
        if ((intList.contains(89)) || (intList.contains(121)))
            count++;
        
        if ((intList.contains(90)) || (intList.contains(122)))
            count++;
        
        if (count == 26)
            System.out.println("pangram");
        else
            System.out.println("not pangram");
    }
}
