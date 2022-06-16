/* **********************************************
 * 프로그램명 :  exam09.java
* 작성자 : 2017038076 조준희
* 작성일 : 2022.03.23
*프로그램 설명 : automoblie클래스를 활용해 해당 클래스의 메소드를 활용하는 프로그램
************************************************/ 
package Homework;

public class exam09 {
	public static void main(String args[]) {
		Automobile auto = new Automobile();
		
		auto.upSpeed(250);
		System.out.println("승용차의 속도는 " + auto.getSpeed() + "km입니다.");
	}
}
