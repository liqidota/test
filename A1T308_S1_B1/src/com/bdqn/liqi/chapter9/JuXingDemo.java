package com.bdqn.liqi.chapter9;

import java.util.Scanner;

public class JuXingDemo {
		public static void main(String[] args) {
			//��ӡ����
			for (int i = 1; i <=5; i++) {
				for (int j = 1; j<=5; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			System.out.println("---------ֱ��������---------------------");
			Scanner scanner=new Scanner(System.in);
			System.out.print("�����������ε�������");
			int  hangshu =scanner.nextInt();
			
			//ֱ��������
			for (int i = 1; i <=hangshu; i++) {
				for (int j = 1; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			System.out.println("------��ֱ��������---------------------");
			
			//��ֱ��������
			for (int i = 1; i <=hangshu; i++) {
				for (int j = 1; j<=hangshu+1-i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			System.out.println("------����������---------------------");
			
			//��ֱ��������
			for (int i = 1; i <=hangshu; i++) {
				for (int j = 1; j<=hangshu+1-i; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <=2*i-1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			//�žų˷���
			
			for (int i = 1; i<=9; i++) {//���ѭ����������
				for (int j = 1; j <=i; j++) {//�ڲ����ÿ�����ʲô
					System.out.print(j+"*"+i+"="+i*j+"\t");
				}
				System.out.println();//ÿ���һ�л�һ��
			}
	}
}
