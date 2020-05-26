package com.bdqn.liqi.chapter8;

import java.util.Scanner;

public class LianXi6 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] array = { "Island", "Ocean", "Pretty", "Sun" };
		String[] array2 = new String[array.length + 1];

		System.out.print("插入前的数组为:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		// 将原数组里面的值复制到新数组
		for (int i = 0; i < array.length; i++) {
			array2[i] = array[i];
		}

		System.out.println();
		int index = array.length;
		System.out.println("请输入插入歌曲的名称:");
		String iString = scanner.next();

		// 找到插入的位置
		for (int i = 0; i < array.length; i++) {
			if (array[i].compareToIgnoreCase(iString) > 0) {
				index = i;
				break;
			}
		}

		// 元素后移
		for (int i = array2.length - 1; i > index; i--) {
			array2[i] = array2[i - 1];
		}

		// 找到插入位置，并把元素后移以后，将输入的单词放入空出来的位置
		array2[index] = iString;

		System.out.println();
		System.out.println("插入后的数组为:");
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}

	}
}
