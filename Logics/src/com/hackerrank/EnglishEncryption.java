package com.hackerrank;

import java.util.Scanner;

public class EnglishEncryption {
	
	static void encrypt(String string){
		double sqrt=Math.sqrt(string.length());
		int floor=(int)Math.floor(sqrt);
		int ceil=(int)Math.ceil(sqrt);
		int prod=1;
		while(prod<string.length()){
			prod=floor*ceil;
			floor++;
		}
		int rowCount=floor,colCount=ceil;
		
		for(int i=0;i<colCount;i++){
			StringBuffer buffer=new StringBuffer();
			int temp=i-1;
			for(int j=0;j<rowCount;j++){
				if(++temp>=string.length())break;
				buffer.append(string.charAt(temp));
				temp+=colCount-1;
			}
			System.out.print(buffer+" ");
				
			
		}
		
	}
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        encrypt(s);
        in.close();
    }

}
