package com.bdqn.liqi.chapter9;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// ����3���ࣨÿ������4��ͬѧ����ѧԱ��ƽ����
		int classNum = 3;// �༶��
		// �������鱣�棬ÿ����4��ѧ���ĳɼ�
		int[] score = new int[4];

		
		for (int i = 0; i < classNum; i++) {//���ѭ�����ư༶��
			int he =0;
			System.out.println("�������" + (i + 1) + "����ĳɼ�");
			for (int j = 0; j < score.length; j++) {//�ڲ�ѭ������ÿ�����ѧԱ
				System.out.print("�������" + (j + 1) + "��ѧ���ĳɼ�:");
				 score[i]=scanner.nextInt();
				 he=he+score[i]; 
			}			
			System.out.println("��"+(i+1)+"�����ƽ����Ϊ:"+he/score.length);

		}
	}
}
