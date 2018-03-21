 package com.hackerrank;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.*;

public class IBM2 {
	

	
	public static void main(String[] args) {
//		String s1="&nbsp<a href=\"http://www.example.com/files/world_data1.zip\"><b>World Data Part 1</b></a> <br/> <a href=\"http://www.example.com/files/world_data2.zip\"><b>World Data Part 2</b></a>";
//		while(s1.contains(".zip")){
//	
//		Pattern p = Pattern.compile("[a-zA-Z0-9_.-]*.zip", Pattern.DOTALL);
//		  Matcher m = p.matcher(s1);
//		  if (m.find()) {
//		   // Get all groups for this match
//		   for (int i=0; i<=m.groupCount(); i++) {
//		    String groupStr = m.group(i);
//		    System.out.println(groupStr);
//		    System.out.println("####");
//		    s1=s1.substring(s1.indexOf(groupStr)+groupStr.length(),s1.length());
		   String x ="a b n";
		    String itest[]=null;
		    itest = x.split(" ");
		    System.out.println(Arrays.toString(itest));
		    
		
	}
		

}
