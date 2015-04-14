/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *     |_ CarTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 4. 14.
 * </pre>
 *
 * @author	: 오준용
 * @version 	: 1.0
 */
public class CarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car[] = {new Car(), new Car(), new Car()};
		car[0].setCompany("현대자동차");
		car[0].setModel("제네시스");
		car[0].setColor("검정색");
		car[0].setMaxSpeed(225);
		car[0].setPrice(50000000);
		car[1].setCompany("기아자동차");
		car[1].setModel("K7");
		car[1].setColor("흰색");
		car[1].setMaxSpeed(246);
		car[1].setPrice(40000000);
		car[2].setCompany("삼성자동차");
		car[2].setModel("SM7");
		car[2].setColor("회색");
		car[2].setMaxSpeed(200);
		car[2].setPrice(38000000);
		System.out.println("<< 자동차 목록 >>");
		for(int i=0; i<3; i++) {
			System.out.println("제조사명 : " + car[i].getCompany());
			System.out.println("모델명 : " + car[i].getModel());
			System.out.println("색상 : " + car[i].getColor());
			System.out.println("최대속도 : " + car[i].getMaxSpeed() + "km");
			System.out.println("가격 : " + String.format("%,d", car[i].getPrice()) + "원");
			System.out.println();
		}

	}

}
