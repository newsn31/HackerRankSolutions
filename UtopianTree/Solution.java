import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value = Integer.parseInt(input.nextLine());
        
        int array [] = new int [value];
        for (int i = 0; i < value; i++){
            array[i] = Integer.parseInt(input.nextLine());
        }
        for (int i = 0; i < value; i++){
            int sum = 1;
            for (int j = 1; j <= array[i]; j++){
                if (j%2==1){
                    sum = 2*sum;
                }
                else if (j%2==0){
                    sum++;
                }
            }
            System.out.println(sum);
        }
        
    }
}