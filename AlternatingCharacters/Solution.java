import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;


public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numSamples = Integer.parseInt(input.nextLine());
        int array [] = new int [numSamples];
        for(int i = 0; i < numSamples; i++){
           StringBuilder temp = new StringBuilder(input.nextLine()); 
           for (int j = 0; j < temp.length()-1; j++){
               
                   if(temp.charAt(j)==temp.charAt(j+1)){
                       array[i] = array[i]+1;
                   }
               
           }
        }
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}