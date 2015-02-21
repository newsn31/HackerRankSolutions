import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.LinkedList;


public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();        //number of people
        int m = input.nextInt();        //number of topics
        
        boolean [][] boolArray = new boolean [n][m];
        
        //make 2D boolean array
        
        for (int i = 0; i < n; i++){
            String line = input.next();
            for (int j = 0; j < m; j++){
                if ((line.charAt(j)=='1')){
                    boolArray[i][j] = true;
                }
            }   
        }
        
        
        //determine max number of topics a two person team can know
        //determine number of teams that know the maximum number of topics.
        int maxTopics = 0;
        LinkedList <Integer> teamTopics = new LinkedList <Integer>();
        
        
        for (int i = 0; i < n; i++){
            
            for (int j = 1+i; j < n; j++){
                int currentTopics = 0;
                for (int k = 0; k < m; k++){
                    if (boolArray[i][k]||boolArray[j][k]==true){
                        currentTopics++;
                    }
                }
                teamTopics.add(currentTopics);
                if (currentTopics > maxTopics){
                    maxTopics = currentTopics;
                }
                
            }
            
        }
        
        
        
        int numTeamsMaxTopics = 0;
        for (int x: teamTopics){
            if (x == maxTopics){
                numTeamsMaxTopics++;
            }
        }
        
        
        System.out.println(maxTopics);
        System.out.println(numTeamsMaxTopics);
        
        
        
        
        }
    }

      
            