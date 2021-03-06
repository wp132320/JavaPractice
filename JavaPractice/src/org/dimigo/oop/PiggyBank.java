/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *     |_ PiggyBank
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 6. 16.
 * </pre>
 *
 * @author	: 오준용
 * @version 	: 1.0
 */
public class PiggyBank {
	private static int balance;
	public static void putMoney(FamilyMember member, int amount) {
		System.out.println(member.getMemberName()+" "+amount+"원 넣음");
		balance += amount;
	}
	public static void stealMoney(FamilyMember member, int amount) {
		if(balance>=amount) {
			System.out.println(member.getMemberName()+" "+amount+"원 훔침");
			balance -= amount;
		}
		else {
			System.out.println("훔치기 실패! 잔고가 부족합니다.(현재 잔고 : "+balance+")");
		}
	}
	public static void printBalance() {
		System.out.println("돼지저금통 총 금액 : "+balance+"원");
	}
}
