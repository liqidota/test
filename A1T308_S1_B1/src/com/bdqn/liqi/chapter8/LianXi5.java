package com.bdqn.liqi.chapter8;

public class LianXi5 {
		public static void main(String[] args) {
			int [] array={1,3,-1,5,-2};
			int [] newArray=new int[array.length];
			
			System.out.println("ԭ����Ϊ:");
			for (int i = 0; i < array.length; i++) {
				 System.out.print(array[i]+" ");
			}
			System.out.println("--------------------");
			
			System.out.println("�������:");
			for (int i = array.length-1; i>=0; i--) {
				if(array[i]<0) {
					continue;
				}
				newArray[array.length-1-i]=array[i];
			}
			
			//ѭ��������
			
			
			for (int i = 0; i < newArray.length; i++) {
				System.out.print(newArray[i]+" ");
			}
		}
}
