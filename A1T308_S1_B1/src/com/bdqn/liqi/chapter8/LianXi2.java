package com.bdqn.liqi.chapter8;

import java.util.Scanner;
//test顶顶顶
public class LianXi2 {
		public static void main(String[] args) {
			
			Scanner scanner =new Scanner(System.in);
			
			String [] array= new String[5];
		
		     System.out.println("请输入5句话");
		 
			 for (int i = 0; i < array.length; i++) {
			     System.out.print("第"+(i+1)+"句话:");
			     array[i]=scanner.next();
			 }
			
			
			System.out.println("逆序输出。。。。。");
			
			for(int i=array.length-1;i>=0;i--) {
				System.out.println("第"+(i+1)+"句话:"+array[i]);
			}
		}
}
