/* **********************************************
 * ���α׷��� :  Automobile.java
* �ۼ��� : 2017038076 ������
* �ۼ��� : 2022.03.23
*���α׷� ���� : car�� ��ӹ��� AutomobileŬ����
************************************************/ 
package Homework;

class Automobile extends Car{
	int seatNum;
	
	int getSeatNum() {
		return seatNum;
	}
	
	void upSpeed(int value) {
		if(speed + value >= 300)
			speed = 300;
		else
			speed = speed + (int)value;
	}
	
	int getSpeed() {
		return this.speed;
	}
}
