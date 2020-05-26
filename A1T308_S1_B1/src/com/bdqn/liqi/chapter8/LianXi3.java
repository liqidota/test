package com.bdqn.liqi.chapter8;

public class LianXi3 {
		public static void main(String[] args) {
			int [] potins= {1,18,25,7,36,13,2,880,89};
			
			int min=potins[0];
			int index=0;
			for (int i = 0; i < potins.length; i++) {
				if(potins[i]<min) {
					index=i;
				}
			}
			
			System.out.println("数字中最小的值的下标为："+index);
		}
}
