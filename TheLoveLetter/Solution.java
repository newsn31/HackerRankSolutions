
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numSamples = Integer.parseInt(input.nextLine());

        for (int i = 0; i < numSamples; i++){
        	String temp = input.nextLine();
        	int count = 0;
        	int median = temp.length()/2;
        	for (int j = 0; j < median; j++){
        		int difference = temp.charAt(j) - temp.charAt(temp.length()-j-1);
        		if (difference < 0){
                    difference *= -1;
                }
                count += difference;
        	}	
        	System.out.println(count);
        }	
    }
}