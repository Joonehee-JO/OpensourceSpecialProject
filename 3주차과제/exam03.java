/* **********************************************
 * 프로그램명 :  exam03.java
* 작성자 : 2017038076 조준희
* 작성일 : 2022.03.23
*프로그램 설명 : 점수에 따른 학점을 출력하는 프로그램
************************************************/ 
package Homework;

public class exam03 {
	public static void main(String[] args) {
	    int count = 85;
	    if(count >= 90) {
	      System.out.println("if문: 합격 (장학생)");
	    } else if (count >= 60) {
	      System.out.println("if문 : 합격");
	    } else {
	      System.out.println("if문: 불합격");
	    }

	    int jumsu = (count / 10) * 10;
	    switch (jumsu) {
	      case 100:
	      case 90:
	        System.out.println("switch문: 합격(장학생)");
	        break;
	      case 80:
	      case 70:
	      case 60:
	        System.out.println("switch문 : 합격");
	        break;
	      default:
	        System.out.println("switch문 : 불합격");
	    }
	  }
}
