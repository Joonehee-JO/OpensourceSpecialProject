/* **********************************************
 * 프로그램명 :  exam12.java
* 작성자 : 2017038076 조준희
* 작성일 : 2022.03.23
*프로그램 설명 : 인터페이스를 활용한 프로그렘
************************************************/ 
package Homework;

interface iAnimal{
	abstract void eat();
}

public class exam12 {
	public static void main(String args[]) {
		iCat cat = new iCat();
		cat.eat();
		
		iTiger tiger = new iTiger();
		tiger.move();
		tiger.eat();
	}
	
	static class iCat implements iAnimal{
		public void eat() {
			System.out.println("생선을 좋아한다.");
		}
	}
	
	static class iTiger extends Animal implements iAnimal{
		void move() {
			System.out.println("네발로 이동한다");
		}
		
		public void eat() {
			System.out.println("멧돼지를 잡아먹는다.");
		}
	}
}
