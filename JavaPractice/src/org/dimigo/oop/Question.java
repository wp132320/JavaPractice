/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *     |_ Question
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 12.
 * </pre>
 *
 * @author	: 오준용
 * @version 	: 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String a;
		System.out.println("가장 좋아하는 휴대폰은?");
		a = s.nextLine();
		if("아이폰".equals(a)) {
			System.out.println("정답입니다!! ^^");
		}
		else {
			System.out.println("틀렸습니다!! TT");
		}
		System.out.println("가장 좋아하는 태블릿은?");
		a = s.nextLine();
		if("아이패드".equals(a)) {
			System.out.println("정답입니다!! ^^");
		}
		else {
			System.out.println("틀렸습니다!! TT");
		}
		System.out.println("가장 좋아하는 노트북은?");
		a = s.nextLine();
		if("맥북".equals(a)) {
			System.out.println("정답입니다!! ^^");
		}
		else {
			System.out.println("틀렸습니다!! TT");
		}
		
	}

}
