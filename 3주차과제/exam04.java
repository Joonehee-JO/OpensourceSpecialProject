/* **********************************************
 * ���α׷��� :  exam04.java
* �ۼ��� : 2017038076 ������
* �ۼ��� : 2022.03.23
*���α׷� ���� : �� �迭�� ����ŭ �ش� �����͸� ����ϴ� ���α׷�
************************************************/ 
package Homework;

public class exam04 {
	public static void main(String[] args) {
	    int one[] = new int[3];
	    for(int i = 0; i < one.length; i++) {
	      one[i] = 10 * i;
	    }

	    String two[] = { "�ϳ�", "��", "��" };
	    for(String str : two) {
	      System.out.println(str);
	    }

	    int j = 0;
	    while( j < one.length) {
	      System.out.println(one[j]);
	      j++;
	    }
	  }
}
