import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
static int lonelyinteger(int[] a) {
    int array [] = new int [101];
    int solution = 0;
    for (int i = 0; i < a.length; i++){
        int temp = a[i];
       // System.out.println("Temp = " + temp);
        array[temp] = array[temp] + 1;
    }
    
    for (int i = 1; i < array.length; i++){
        if (array[i]==1){
            
            solution = i;
            //System.out.println("Solution: "+ solution);
        }
        
    }
    return solution;
    
    }
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        
        int _a_size = Integer.parseInt(in.nextLine());
        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");
        
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }
        
        res = lonelyinteger(_a);
        System.out.println(res);
        
    }
}
