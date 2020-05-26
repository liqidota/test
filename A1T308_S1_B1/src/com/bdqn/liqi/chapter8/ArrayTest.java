package com.bdqn.liqi.chapter8;

public class ArrayTest {
		public static void main(String[] args) {
			double [] score=new double [5];
			score[0]=98;
			score[1]=32;
			score[2]=77;
			
			for (int i = 0; i < score.length; i++) {
				System.out.println((int)score[i]);
			}
		
			
			
			
			int [] score2={29,80,65,34};
			
			
			String [] nameStrings= {"我们","你好","小河边","我们","读书"};
			
			
			System.out.println("没有替换前");
			for (int i = 0; i < nameStrings.length; i++) {
				System.out.print(nameStrings[i]+",");
			}
			
			
			for(int i=0;i<nameStrings.length;i++) {
				if(nameStrings[i].equals("我们")) {
					nameStrings[i]="xx";
					break;
				}
			}
			System.out.println();
			
			System.out.println("替换后-------------------------");
			for (int i = 0; i < nameStrings.length; i++) {
				System.out.print(nameStrings[i]+",");
			}
			
			
			int [] a=new int [3];
			int [] b={1,2,3,4,5};
			a=b;
			for (int i = 0; i < b.length; i++) {
				System.out.println(a[i]+" ");
			}
		}
}
