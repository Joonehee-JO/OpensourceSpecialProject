/* **********************************************
 * 프로그램명 :  exam08.java
* 작성자 : 2017038076 조준희
* 작성일 : 2022.03.23
*프로그램 설명 : car클래스를 활용해 해당 클래스의 메소드를 사용하는 프로그램
************************************************/ 
package Homework;

import java.lang.Math;

public class exam08 {
	public static void main(String args[]) {
		Car myCar1 = new Car("빨강",0);
		Car myCar2 = new Car("빨강",0);
		Car myCar3 = new Car("빨강",0);
		
		System.out.println("생산된 차의 대수(정적 필드) ==> " + Car.carCount);
		System.out.println("생산된 차의 대수(정적 메소드) ==> " + Car.currentCarCount());
		System.out.println("차의 최고 제한 속도 ==> " + Car.MAXSPEED);
		
		System.out.println("PI의 값 == > " + Math.PI);
		System.out.println("3의 5제곱 == > " + Math.pow(3, 5));
	}
}
