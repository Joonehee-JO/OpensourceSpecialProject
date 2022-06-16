/* **********************************************
 * 프로그램명 :  exam05.java
* 작성자 : 2017038076 조준희
* 작성일 : 2022.03.23
*프로그램 설명 : 각 데이터의 합을 출력하는 프로그램
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
