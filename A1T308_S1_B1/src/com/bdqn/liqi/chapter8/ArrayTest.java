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
			
			
			String [] nameStrings= {"����","���","С�ӱ�","����","����"};
			
			
			System.out.println("û���滻ǰ");
			for (int i = 0; i < nameStrings.length; i++) {
				System.out.print(nameStrings[i]+",");
			}
			
			
			for(int i=0;i<nameStrings.length;i++) {
				if(nameStrings[i].equals("����")) {
					nameStrings[i]="xx";
					break;
				}
			}
			System.out.println();
			
			System.out.println("�滻��-------------------------");
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
