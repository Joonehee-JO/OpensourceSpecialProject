/* **********************************************
 * ���α׷��� :  exam08.java
* �ۼ��� : 2017038076 ������
* �ۼ��� : 2022.03.23
*���α׷� ���� : carŬ������ Ȱ���� �ش� Ŭ������ �޼ҵ带 ����ϴ� ���α׷�
************************************************/ 
package Homework;

import java.lang.Math;

public class exam08 {
	public static void main(String args[]) {
		Car myCar1 = new Car("����",0);
		Car myCar2 = new Car("����",0);
		Car myCar3 = new Car("����",0);
		
		System.out.println("����� ���� ���(���� �ʵ�) ==> " + Car.carCount);
		System.out.println("����� ���� ���(���� �޼ҵ�) ==> " + Car.currentCarCount());
		System.out.println("���� �ְ� ���� �ӵ� ==> " + Car.MAXSPEED);
		
		System.out.println("PI�� �� == > " + Math.PI);
		System.out.println("3�� 5���� == > " + Math.pow(3, 5));
	}
}
