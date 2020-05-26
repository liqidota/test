package com.bdqn.liqi.chapter8;

import java.util.Scanner;
//test¶¥¶¥¶¥
public class LianXi2 {
		public static void main(String[] args) {
			//ÄãºÃ·³·³·³
			Scanner scanner =new Scanner(System.in);
			
			String [] array= new String[5];
		
		     System.out.println("ÇëÊäÈë5¾ä»°");
		 
			 for (int i = 0; i < array.length; i++) {
			     System.out.print("µÚ"+(i+1)+"¾ä»°:");
			     array[i]=scanner.next();
			 }
			
			
			System.out.println("ÄæÐòÊä³ö¡£¡£¡£¡£¡£");
			
			for(int i=array.length-1;i>=0;i--) {
				System.out.println("µÚ"+(i+1)+"¾ä»°:"+array[i]);
			}
		}
}
