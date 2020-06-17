package com.bdqn.liqi.chapter9;

import java.util.Scanner;

public class JuXingDemo {
		public static void main(String[] args) {
			//打印矩形
			for (int i = 1; i <=5; i++) {
				for (int j = 1; j<=5; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			System.out.println("---------直角三角形---------------------");
			Scanner scanner=new Scanner(System.in);
			System.out.print("请输入三角形的行数：");
			int  hangshu =scanner.nextInt();
			
			//直角三角形
			for (int i = 1; i <=hangshu; i++) {
				for (int j = 1; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			System.out.println("------倒直角三角形---------------------");
			
			//倒直角三角形
			for (int i = 1; i <=hangshu; i++) {
				for (int j = 1; j<=hangshu+1-i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			System.out.println("------等腰三角形---------------------");
			
			//倒直角三角形
			for (int i = 1; i <=hangshu; i++) {
				for (int j = 1; j<=hangshu+1-i; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <=2*i-1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			//九九乘法表
			
			for (int i = 1; i<=9; i++) {//外层循环控制行数
				for (int j = 1; j <=i; j++) {//内层控制每行输出什么
					System.out.print(j+"*"+i+"="+i*j+"\t");
				}
				System.out.println();//每输出一行换一行
			}
	}
}
