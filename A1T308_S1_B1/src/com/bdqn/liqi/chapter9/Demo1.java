package com.bdqn.liqi.chapter9;

import java.util.Scanner;

public class Demo1 {
		public static void main(String [] args) {
			Scanner scanner=new Scanner(System.in);
			
			int [] sum =new int[4];
			int he=0;
			
			System.out.println("������4λѧԱ�ĳɼ�:");
			for (int i =0; i<4; i++) {
				System.out.print("��"+(i+1)+"λѧԱ�ĳɼ�:");
				sum[i]=scanner.nextInt();
				he=he+sum[i];
			}		
			System.out.println("4��ѧ����ƽ����Ϊ:"+he/4);
			
		}
}
