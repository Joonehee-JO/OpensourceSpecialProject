/* **********************************************
 * 프로그램명 :  exam10.java
* 작성자 : 2017038076 조준희
* 작성일 : 2022.03.23
*프로그램 설명 : 추상클래스를 상속받은 tiger와 eagle클래스를 활용한 프로그램
************************************************/ 
package Homework;

public class exam10 {
	public static void main(String args[]) {
		Tiger tiger = new Tiger();
		Eagle eagle = new Eagle();
		
		tiger.move();
		eagle.move();
	}
}
