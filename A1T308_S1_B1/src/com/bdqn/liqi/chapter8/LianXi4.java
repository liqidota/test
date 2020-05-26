package com.bdqn.liqi.chapter8;

import java.util.Scanner;

public class LianXi4 {
		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			int [] array =new int [10];
			System.out.println("请输入10个数：");
			
			for (int i = 0; i < array.length; i++) {
				array[i]=scanner.nextInt();
			}
			
			
			int [] array2=new int[4];
			
			for (int i = 0; i < array.length; i++) {
				switch (array[i]) {
				case 1:
					array2[0]++;
					break;
			    case 2:
			    	array2[1]++;
			    	break;
			    case 3:
			    	array2[2]++;
			    	break;
				default:
					array2[3]++;
					break;
				}
			}
			
			System.out.println("数字1的个数"+array2[0]);
			System.out.println("数字2的个数"+array2[1]);
			System.out.println("数字3的个数"+array2[2]);
			System.out.println("非法数字的个数"+array2[3]);
		}
}
