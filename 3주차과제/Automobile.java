/* **********************************************
 * 프로그램명 :  Automobile.java
* 작성자 : 2017038076 조준희
* 작성일 : 2022.03.23
*프로그램 설명 : car를 상속받은 Automobile클래스
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
