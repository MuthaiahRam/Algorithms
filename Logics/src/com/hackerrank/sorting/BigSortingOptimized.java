package com.hackerrank.sorting;

//https://github.com/RyanFehr/HackerRank/blob/master/Algorithms/Sorting/Big%20Sorting/Solution.java

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BigSortingOptimized {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int i = 0; i < n; i++) unsorted[i] = in.next();
        in.close();

        Arrays.sort(unsorted,new Comparator<String>() {
            public int compare(String s1, String s2) 
            {
                return stringCompare(s1,s2);
            }
        });
        
        StringBuilder stringBuilder = new StringBuilder("");
        for(String num : unsorted)
            stringBuilder.append(num+"\n");
        System.out.println(stringBuilder.toString());
    }
    
    
    static int stringCompare(String s1, String s2)
    {
        if(s1.length() > s2.length()) return 1;
        if(s1.length() < s2.length()) return -1;
        for(int i = 0; i < s1.length(); i++)
        {
            if((int)s1.charAt(i) > (int)s2.charAt(i)) return 1;
            if((int)s1.charAt(i) < (int)s2.charAt(i)) return -1;
        }
        return 0;
    }

}
