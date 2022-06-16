/* **********************************************
 * 프로그램명 :  exam06.java
* 작성자 : 2017038076 조준희
* 작성일 : 2022.03.23
*프로그램 설명 : 트라이캐치문을 활용하여 오류를 잡는 프로그램
************************************************/ 
package Homework;

public class exam06 {
	static int var = 100;
	  public static void main(String[] args) {
	    int num1 = 100, num2 = 0;
	    try {
	      System.out.println(num1/num2);
	    } catch(java.lang.ArithmeticException e) {
	      System.out.println("계산에 문제가 있습니다");
	    }
	  }
}
