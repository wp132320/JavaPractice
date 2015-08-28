/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *     |_ SmartPhoneTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 28.
 * </pre>
 *
 * @author	: 오준용
 * @version 	: 1.0
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone[] phones = {
			new IPhone("iPhone6", "애플", 700000),
			new Galaxy("갤럭시 S6", "삼성", 650000)
		};
		for(SmartPhone phone : phones) {
			System.out.println(phone.toString());
			phone.turnOn();
			phone.pay();
			phone.useSpecialFunction();
			phone.turnOff();
		}
	}

}
