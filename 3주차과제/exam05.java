/* **********************************************
 * ���α׷��� :  exam05.java
* �ۼ��� : 2017038076 ������
* �ۼ��� : 2022.03.23
*���α׷� ���� : �� �������� ���� ����ϴ� ���α׷�
************************************************/ 
package Homework;

public class exam05 {
	static int var = 100;
	  public static void main(String[] args) {
	    int var = 0;
	    System.out.println(var);

	    int sum = addFunction(10, 20);
	    System.out.println(sum);
	  }

	  static int addFunction(int num1, int num2) {
	    int hap;
	    hap = num1 + num2 + var;
	    return hap;
	  }
}
