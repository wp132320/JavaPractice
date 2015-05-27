/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *     |_ IdolGroup
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 27.
 * </pre>
 *
 * @author	: 오준용
 * @version 	: 1.0
 */
public class IdolGroup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] idolGroup = {"빅뱅", "2NE1", "걸스데이"};
		String[][] members = {
				{"GD", "태양", "대성", "탑", "승리"},
				{"CL", "산다라박", "박봄", "민지"},
				{"유리", "소진", "민아", "해리", "그외"}
		};
		int i=0;
		for(String group : idolGroup) {
			System.out.println("<< "+group+" 멤버 >>");
			for(String member : members[i++])
				System.out.println(member);
			System.out.println();
		}
	}

}
