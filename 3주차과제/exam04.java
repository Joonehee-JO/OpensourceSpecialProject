/* **********************************************
 * 프로그램명 :  exam04.java
* 작성자 : 2017038076 조준희
* 작성일 : 2022.03.23
*프로그램 설명 : 각 배열의 수만큼 해당 데이터를 출력하는 프로그램
************************************************/ 
package Homework;

public class exam04 {
	public static void main(String[] args) {
	    int one[] = new int[3];
	    for(int i = 0; i < one.length; i++) {
	      one[i] = 10 * i;
	    }

	    String two[] = { "하나", "둘", "셋" };
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
