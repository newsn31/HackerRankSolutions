import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String inputString = myScan.nextLine();
       
        int array [] = new int[26];
        for(int i = 0; i < inputString.length(); i++){
            int temp = (int)inputString.charAt(i);
            array[temp-97] = array[temp-97]+1;
        }
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i]%2!=0){
                count++;
            }
        }
        
        
        String ans;
        if (count > 1){
            ans = "NO";
        }
        else ans ="YES";
        // Assign ans a value of YES or NO, depending on whether or not inputString satisfies the required condition
        System.out.println(ans);
        myScan.close();
    }
}
