package com.bdqn.liqi.chapter8;

import java.util.Scanner;
//test������
public class LianXi2 {
		public static void main(String[] args) {
			
			Scanner scanner =new Scanner(System.in);
			
			String [] array= new String[5];
		
		     System.out.println("������5�仰");
		 
			 for (int i = 0; i < array.length; i++) {
			     System.out.print("��"+(i+1)+"�仰:");
			     array[i]=scanner.next();
			 }
			
			
			System.out.println("�����������������");
			
			for(int i=array.length-1;i>=0;i--) {
				System.out.println("��"+(i+1)+"�仰:"+array[i]);
			}
		}
}
