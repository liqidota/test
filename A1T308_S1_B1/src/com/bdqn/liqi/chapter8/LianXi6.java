package com.bdqn.liqi.chapter8;

import java.util.Scanner;

public class LianXi6 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] array = { "Island", "Ocean", "Pretty", "Sun" };
		String[] array2 = new String[array.length + 1];

		System.out.print("����ǰ������Ϊ:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		// ��ԭ���������ֵ���Ƶ�������
		for (int i = 0; i < array.length; i++) {
			array2[i] = array[i];
		}

		System.out.println();
		int index = array.length;
		System.out.println("������������������:");
		String iString = scanner.next();

		// �ҵ������λ��
		for (int i = 0; i < array.length; i++) {
			if (array[i].compareToIgnoreCase(iString) > 0) {
				index = i;
				break;
			}
		}

		// Ԫ�غ���
		for (int i = array2.length - 1; i > index; i--) {
			array2[i] = array2[i - 1];
		}

		// �ҵ�����λ�ã�����Ԫ�غ����Ժ󣬽�����ĵ��ʷ���ճ�����λ��
		array2[index] = iString;

		System.out.println();
		System.out.println("����������Ϊ:");
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}

	}
}
