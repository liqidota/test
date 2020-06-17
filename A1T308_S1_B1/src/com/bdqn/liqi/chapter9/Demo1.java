package com.bdqn.liqi.chapter9;

import java.util.Scanner;

public class Demo1 {
		public static void main(String [] args) {
			Scanner scanner=new Scanner(System.in);
			
			int [] sum =new int[4];
			int he=0;
			
			System.out.println("请输入4位学员的成绩:");
			for (int i =0; i<4; i++) {
				System.out.print("第"+(i+1)+"位学员的成绩:");
				sum[i]=scanner.nextInt();
				he=he+sum[i];
			}		
			System.out.println("4名学生的平均分为:"+he/4);
			
		}
}
