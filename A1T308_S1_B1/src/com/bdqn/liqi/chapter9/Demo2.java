package com.bdqn.liqi.chapter9;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 计算3个班（每个班有4名同学），学员的平均分
		int classNum = 3;// 班级数
		// 定义数组保存，每个班4名学生的成绩
		int[] score = new int[4];

		
		for (int i = 0; i < classNum; i++) {//外层循环控制班级数
			int he =0;
			System.out.println("请输入第" + (i + 1) + "个班的成绩");
			for (int j = 0; j < score.length; j++) {//内层循环控制每个班的学员
				System.out.print("请输入第" + (j + 1) + "名学生的成绩:");
				 score[i]=scanner.nextInt();
				 he=he+score[i]; 
			}			
			System.out.println("第"+(i+1)+"个班的平均分为:"+he/score.length);

		}
	}
}
