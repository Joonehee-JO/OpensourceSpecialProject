/* **********************************************
 * ���α׷��� :  exam13.java
* �ۼ��� : 2017038076 ������
* �ۼ��� : 2022.03.23
*���α׷� ���� : �̺�Ʈ�����ʸ� Ȱ���� ���α׷�
************************************************/ 
package Homework;

interface clickListener{
	public void print();
}

public class exam13 {
	public static void main(String args[]) {
		
		clickListener listener = 
				(new clickListener() {
					public void print() {
						System.out.println("Ŭ�� �������Դϴ�.");
					}
				});
		
		listener.print();
	}
}
