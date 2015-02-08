import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numSamples = Integer.parseInt(input.nextLine());
        int [][] array = new int [numSamples][numSamples];
        String [][] sArray = new String[numSamples][numSamples];
        for (int i = 0; i < numSamples; i++){
            String temp = input.nextLine();
            for (int j = 0; j < numSamples; j++){
                String value = String.valueOf(temp.charAt(j));
                sArray[i][j] = value;
                array[i][j] = Integer.parseInt(value);
            }
        }
        for (int i = 1; i < numSamples-1; i++){
            for (int j = 1; j < numSamples-1; j++){
                if ((array[i][j]>array[i][j-1])&&(array[i][j]>array[i][j+1])&&(array[i][j]>array[i-1][j])&&(array[i][j]>array[i+1][j])){
                    sArray[i][j] = "X";
                }
            }
        }
        
        
        
        for (int h=0; h<numSamples; h++){
            for (int i = 0; i < numSamples; i++){
                System.out.print(sArray[h][i]);
            }
            System.out.println();
        }
       
    }
}