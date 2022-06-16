/* **********************************************
 * 프로그램명 :  exam13.java
* 작성자 : 2017038076 조준희
* 작성일 : 2022.03.23
*프로그램 설명 : 이벤트리스너를 활용한 프로그램
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
						System.out.println("클릭 리스너입니다.");
					}
				});
		
		listener.print();
	}
}
